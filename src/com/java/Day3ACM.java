package com.java;
                   
public class Day3ACM extends Day3Ac {
	           //---- Add Unimplemented method -----//

	@Override
	public void name() {
		System.out.println("BOSE");
	}
	@Override                         //-- Override class Day3AC ----//
	public void rollnumber() {
		System.out.println(19049);
	}
	@Override
	public void Regnumber() {
		System.out.println(1901211033);
		
	}
    public static void main(String[] args) { 
    	Day3ACM d3ACM = new Day3ACM();
    	d3ACM.name();
    	d3ACM.rollnumber();
    	d3ACM.Regnumber();
}	    
}

