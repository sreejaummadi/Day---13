package com.codegnan.Patterns;

public class pattern_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print(j+" ");
				//System.out.print("* ");
				//System.out.print((6-j)+" ");
				//System.out.print(i+" ");
				//System.out.print((6-i)+" ");
				System.out.print((char)(96+j)+" ");
				//System.out.print((char)(102));
			}
			System.out.println();
		}
	}
}
