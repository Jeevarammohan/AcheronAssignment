package com.shrishti.training.number.pattern;

import java.util.Scanner;

public class NumberPattern {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		for(int row=0;row<size;row++) {
			for(int col=0;col<=row;col++) {
				System.out.println(row+" ");
			}
			System.out.println();
			
		}
		
	}
}
