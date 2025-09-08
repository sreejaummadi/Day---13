package com.codegnan.Patterns;

public class pattern_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("  ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
