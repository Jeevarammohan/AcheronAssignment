package com.shrishti.training.number.pattern;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		System.out.println("Forward Pattern :");
		for(int row=1;row<=size;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Reverse Pattern :");
		for(int row=size;row>=1;row--) {
			for(int col=row;col>=1;col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
