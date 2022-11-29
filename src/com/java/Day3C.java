package com.java;
//---- Constructor----//
public class Day3C {
	public Day3C() {  // Default constructor
		this(45);
		System.out.println("Default");
	}
	public Day3C(int sum) {       //---- Non Parameterized Constructor
		this(2f);
		System.out.println(sum);
	}
	public Day3C(float a) {
		this("Rohit");
	System.out.println("a : "+a);
}
	public Day3C(String r) {
	   System.out.println("Name : "+ r);
	}
	
	public static void main(String[] args) {
		Day3C d3C = new Day3C();
			
	}
}

