package com.java;

//----- Non Primitive Data Type-----//
//---------String
public class Data_Types {
public void name() {
String src = "Rolex";
System.out.println(src);
}  
//------------Array 
public void Non_premitive() {
int [] arr = new int[5];
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
arr[4]=50;
System.out.println(arr[4]);

}		
public static void main(String[]args) { 
Data_Types dt = new Data_Types();
dt.name();
dt.Non_premitive();
}

}


	
	

