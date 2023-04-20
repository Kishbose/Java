package com.java;

public class Reverse_string {
	
      public static void main(String[] args) {
			String s = "My Name is Bose";
			String st = " ";
		for(int i=s.length()-1;i>-1;i--) {
			st=st+s.charAt(i);
		}
		System.out.println("Reverse Type : "+st);
		}

	

}
