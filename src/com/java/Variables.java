package com.java;
                          //---- Variables-----
public class Variables {                                 
	static int b =150;          //----Static Variable-----
	int a = 200;              // --- class variable-----
	public void name() {
        int a = 100;          //---- Method variable----
        System.out.println("Total Marks : "+a);
	}
   public void name2() {
	int b = 50;
	System.out.println("Average Mark : "+b);
}
public static void main(String[] args) {
	Variables vs = new Variables();
	vs.name();
	vs.name2();
	System.out.println(vs.a);
    System.out.println(vs.b);
}
}


