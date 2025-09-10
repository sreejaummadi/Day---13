package com.codegnan.Patterns;

import java.util.Scanner;

public class Number_Pyramind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int n=sc.nextInt();
		//outer loop for row
		for(int i=1;i<=n;i++) {
			//1st inner loop 
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			//second inner loop
			for(int j=i-1;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
