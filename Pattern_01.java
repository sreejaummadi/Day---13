package com.codegnan.Patterns;

import java.util.Scanner;

public class Pattern_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows");
		int rows=sc.nextInt();
		System.out.println("Enter number of Columns");
		int col=sc.nextInt();
		//outer for loop for rows
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=col;j++) {
				//System.out.print("* ");
				
				System.out.print(j+" ");
				//System.out.println((6-j)+" ");
			}
			System.out.println();
		}

	}
}
