package com.shrishti.training;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit=scanner.nextInt();
		System.out.println("The even elements are :");
		for(int value=1;value<=limit;value++) {
			if(value%2==0) {
				System.out.println(value+" ");
			}
		}
		System.out.println("The odd elements are ");
		for(int value=1;value<=limit;value++) {
			if(value%2!=0) {
				System.out.println(value+" ");
			}
		}
		scanner.close();
	}

}
