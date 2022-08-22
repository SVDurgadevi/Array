package org.normalandenhanceforloop;

public class Sample {
    public static void main(String[] args) {
		int[] a= new int[10];
   a[0]=1;
   a[1]=2;
   a[2]=3;
   a[3]=4;
   a[4]=5;
   a[5]=6;
   a[6]=7;
   a[7]=8;
   a[8]=9;
   a[9]=10;
   a[10]=11;
  
   int sum = 0;

//enhance for loop
for (int j : a) {
	sum  =sum+ j ;   
	System.out.println("enhance for loop");
	System.out.println(" sum is"+sum);  
	}   
}}