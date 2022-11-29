package com.java;
//----- Method Overriding----///
public class Day3OR extends Day3{
	public void Method(int z,String add,int x) {
		System.out.println("Address no :"+" "+z);
        System.out.println("City :"+" "+add);
        System.out.println("Phone : "+ x);
	}	
	@Override                         //----- Override Method
	public void Method() {
		System.out.println("Software");
		super.Method();
	}	
 @Override
public void Method(float num, char value) {
	System.out.println(" Graph program dimension XY and"+" "+ num+" "+"Abbrivation of Java(J)Development(D)Kit"+(value));
	super.Method(num, value);
}
 public static void main(String[] args) {
	Day3OR d3OR = new Day3OR();
	d3OR.Method(5,"Chennai",232424245);
	d3OR.Method(); 
    d3OR.Method(-5, 'j');
 }
}
