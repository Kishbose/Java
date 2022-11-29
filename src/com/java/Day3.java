package com.java;

    //POLYMORPHISM

//---- Method Overloading---//
public class Day3{
	public void Method() {
		System.out.println("Testing");
	}
    public void Method(String a,int b) {
		String c="Augest";
		System.out.println("Class Starts With "+a+" "+"Program"+" "+ "Day on"+" "+b+c);
	}
	public void Method(float num,char value ) {
		System.out.println("Graph program dimension XY and"+" "+ num+" "+"Abbrivation of Java(J)Development(D)Kit"+(value));
	}
	public void Method(int z,String add,int x) {
		System.out.println("Address no :"+" "+z);
        System.out.println("City :"+" "+add);
        System.out.println("Phone : "+ x);
	}	
	public static void main(String[] args) {
		Day3 d3 = new Day3();
		d3.Method();
		d3.Method("Java",15 );
		d3.Method(-1, 'K');
		d3.Method(22, "Uthiramerur", 1234567890);	
	}
}
