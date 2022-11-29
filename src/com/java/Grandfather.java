package com.java;
//---- INHERITANCES---///

public class Grandfather {
	public void Vehicle() {
   System.out.println("RC 350");	
	}
	public void Property() {
   System.out.println("Agriculture land");	
	}
public static void main(String[] args) {
	Grandfather gt = new Grandfather();
	gt.Property();
	gt.Vehicle();
	
}
}
