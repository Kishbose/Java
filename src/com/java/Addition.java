package com.java;
                               // ---- Scanner Method ----//
import java.util.Scanner;

public class Addition  {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ___ Calculator Method ___ ");
		System.out.println("Enter a  First Num : ");
	int a = sc.nextInt();
		System.out.println("Enter a Second Num : ");
	int b = sc.nextInt();
		     int  A = a+b;    //---- Add Method
       	System.out.println("Add = " +A); 
        int B = a-b;         //---- Sub Method  
	     System.out.println("Sub = " +B); 
		     int C = a*b;   //---- Multiple method
	    System.out.println("Multiply = "+C);
		     int D = a%b;  //---- Divide Method
	    System.out.println("Divide = "+D);
		int Q = 1000;
       	int W = 467;
		     int M = Q/W;
		     System.out.println("Given value : " +M);
	}
	
}
