package com.java;
import java.util.Scanner;
public class Switch_case {
	//---- Switch Statement Calculator Method
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        int choice =sc.nextInt();    // --- declare variable
        switch(choice)
        {                          // ---- Switch Case
            case 0 : 
               int a=num1 + num2;
               System.out.println("Add : "+a);   //---Add
                
            case 1 : 
                int b = num1-num2;
                System.out.println("Sub : "+b);   //---Sub
              
            case 2 : 
                int c = num1*num2;
                System.out.println("Mul : "+c);  //---Mul 
                
            case 3 : 
            	int d = num1/num2;
            	System.out.println("Div : "+d); // --- Div
                break;
             default :
                 System.out.println("Invalid choice");
                 break;
        }
     }
}
