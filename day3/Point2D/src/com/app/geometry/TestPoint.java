package com.app.geometry;

public class TestPoint {

	    public static void main(String[] args) {
	        Point2D p1 = new Point2D(2, 4);
	        Point2D p2 = new Point2D(3, 4);

	        System.out.println(p1.getDetails());
	        System.out.println(p2.getDetails());

	        if (isEqual(p1, p2)) {
	            System.out.println("Both points are having same x & y coordinates.");
	        } else {
	            System.out.println("Both points are having different x & y coordinates.");
	        }

	        double D = calculateDistance(p1, p2);
	        System.out.println("Distance: " + D);
	    }

	    private static double calculateDistance(Point2D p1, Point2D p2) {
	        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
	    }

	    private static boolean isEqual(Point2D p1, Point2D p2) {
	        return p1.x == p2.x && p1.y == p2.y;
	    }
	}
