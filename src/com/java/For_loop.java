package com.java;
                          //----FOR LOOP
public class For_loop {
	public static void main(String[] args) {
		System.out.println("-----------FOR LOOP---------");
		for(int a=1;a<=2;a++) {            //---OUTER LOOP
			for(int b=2;b<5;b++) {         //---- INNER loop
			 System.out.println(b);
		}
	}                                         //----FOR EACH-----
		 System.out.println("--------FOR EACH------------");
		int[]arr= new int[] {1,2,3,4,5,6,7,8};
		    for(int i :arr) {
		      System.out.println(i);
	   }
	}
}

