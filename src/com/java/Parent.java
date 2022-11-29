package com.java;

public class Parent extends Grandfather{
	//------------- Multi level Inheritances --------
	//------------only parent and Grandfather class-----//
public void Bike() {
	System.out.println("Rx 1oo");
}
public void Home() {
	System.out.println("3BHK");
}
public static void main(String[] args) {
	Parent pt = new Parent();
	pt.Bike();
	pt.Home();
	pt.Property();
	pt.Vehicle();
}
}
