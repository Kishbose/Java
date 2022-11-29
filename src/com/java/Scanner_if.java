package com.java;
 //---- Scanner If Statement ----//
import java.util.Scanner;
public class Scanner_if {
	    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int mark = sc.nextInt();
	    if(mark>=75 && mark<=100){  //--- AND Operator
	    System.out.println( " Grade = A+");
	    }
	    else if (mark>=40&& mark<=74){
	        System.out.println(" Grade = B+");
	    }    
	    else if(mark>0 || mark<=39) {  //--- OR Operator
	    System.out.println("Not cleard");
	    }
	 
	    }
	}
