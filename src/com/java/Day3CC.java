package com.java;
       //---- Constructor Chaining ----//
public class Day3CC extends Day3C{    
	 public Day3CC() {
		 this(2.3);                        //----Current Class Call this Keyword  ----//
		System.out.println("Finished");
	}
	public Day3CC(double c){
	     this(100);
		System.out.println("Decimal Value : "+" "+c);
	}
	public Day3CC(int a){
		this("lenovo ", 1900);
		System.out.println("RX"+a);
	}
	public Day3CC(String a,int z) {
		super();                             //----- Call Parent Class Day3C ----//
		System.out.println("PC"+" "+a +"Rolex"+" "+z);
	
	}
public static void main(String[] args) {
	Day3CC d3cc= new Day3CC();
	
}
}
