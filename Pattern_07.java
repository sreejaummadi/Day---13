package com.codegnan.Patterns;

import java.util.Scanner;

public class Pattern_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
