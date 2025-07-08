package com.dlkte;

public class Date {
	private int day;
	private int month;
	private int year;


	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	
	public int getDay() {
		return day;
		
	}
	public void setDay(int day) {
		if(day<=31) {
		 this.day=day;
		}
		else {
			System.out.println("Enter valid date");
		}
	}
	public int getMonth() {
		return month;
		
	}
	public void setMonth(int month) {
		if(month<=12)
		 this.month=month;
		
	}
	public int getYear() {
		return year;
		
	}

	public void setYear(int year) {
		this.year=year;
		
	}
	
	

	
	public void displayDate() {
		System.out.println("Date: "+day +"/" +month +"/" +year);
		
	}


}
