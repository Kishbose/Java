package com.java;

public class Day4INF1 implements Day4IF {

	@Override              // Interface_Implement method ----//
	public void demo(String a) {
		System.out.println("Shortcut for copy is ctrl +"+" "+ a );
	}
    @Override
    public void demo1(int b) {
	System.out.println("Shortcut for shut down is ctrl + f"+ b);
}
    @Override
    public void demo2(float c) {
    	float a = 3;
    	float b = 4;
    	float d = a+b;
	System.out.println("Window os "+" "+ c+","+d);
}
    @Override
    public void demo3(boolean d) {
	System.out.println("Pc shortcuts & Info is "+" "+ d);
}
    public static void main(String[] args) {
    	Day4INF1 dif = new Day4INF1();
    	dif.demo("C");
    	dif.demo1(4);
    	dif.demo2(10);
    	dif.demo3(true );
}
}
