package com.java;

//----------- Multi Level Inheritances -----------            

public class Child extends Parent{
	      //----------- child class,parent class,Grandfather class-------------//
	public void Bikes() {
	System.out.println("MT 15"+" "+"Himaliyan" );
}
public void Phone() {
 System.out.println("Iphone13 pro"+" "+"Nothing Phone");
}
public static void main(String[] args) {
	Child cd = new Child();
    cd.Bikes();
    cd.Phone();
    cd.Home();
    cd.Bike();
    cd.Vehicle();
    cd.Property();
}    
}
