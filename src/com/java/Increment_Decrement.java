package com.java;

public class Increment_Decrement {
	public static void main(String[] args) {
		System.out.println("Increment Method ");
		int i = 0;
		System.out.println(i);
		i++;                            //--- + Increment
		System.out.println(i);
		++i;
		System.out.println(i);
		i++;
		--i;
		++i; 
		i--; //2
		System.out.println(i++ + ++i);   //(3 + 3)
	}

}
