package com.shrishti.training.number.pattern;

import java.util.Scanner;

public class NumberPatternV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int size=scanner.nextInt();
		int value=1;
		for(int row=1;row<=size;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
		scanner.close();
	}

}
