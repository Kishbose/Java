package com.java;
import java.util.Scanner;
public class SR_Nested_if {
	   
	// ---- Nested_if Statement ----//
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println(" Exam Result");
	        String st = "yes";
	        String st1 ="No";
	        String Sg = sc.nextLine();
	      if(Sg.equals(st) || Sg.equals(st1)) {
	        	int mark = sc.nextInt();
	        if (mark>=50 && mark<=75) {
	        	System.out.println(mark+" is Average" );
	        }else if(mark<=0 || mark<=40) {
	        	System.out.println(mark+" is Poor ");
	        }
	        else {
	        System.out.println("  Attend Revaluation And Instant Exam ");
	        } 
	        }  
	    }
}
