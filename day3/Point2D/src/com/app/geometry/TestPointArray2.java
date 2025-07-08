package com.app.geometry;
import java.util.Scanner;
public class TestPointArray2 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("How many points do you want to plot? ");
	        int size = sc.nextInt();

	        Point2D[] points = new Point2D[size];

	        
	        for (int i = 0; i < size; i++) {
	            System.out.println("Enter coordinates for Point " + i);
	            System.out.print("Enter x: ");
	            double x = sc.nextDouble();
	            System.out.print("Enter y: ");
	            double y = sc.nextDouble();
	            points[i] = new Point2D(x, y);
	        }

	      
	        int choice;
	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Display details of a specific point");
	            System.out.println("2. Display x, y coordinates of all points");
	            System.out.println("3. Display distance between 2 points");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter index of the point: ");
	                    int index = sc.nextInt();
	                    if (index >= 0 && index < size) {
	                        System.out.println(points[index].getDetails());
	                    } else {
	                        System.out.println("Invalid index, please retry!!!");
	                    }
	                    break;

	                case 2:
	                    System.out.println("All point coordinates:");
	                    for (Point2D p : points) {
	                        System.out.println(p.getDetails());
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter index of start point: ");
	                    int i1 = sc.nextInt();
	                    System.out.print("Enter index of end point: ");
	                    int i2 = sc.nextInt();

	                    if (i1 >= 0 && i1 < size && i2 >= 0 && i2 < size) {
	                        if (points[i1].isEqual(points[i2])) {
	                            System.out.println("Both points are at the same location.");
	                        } else {
	                            double dist = points[i1].calculateDistance(points[i2]);
	                            System.out.println("Distance between points: " + dist);
	                        }
	                    } else {
	                        System.out.println("Invalid indices, please retry!!!");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice, try again.");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}
