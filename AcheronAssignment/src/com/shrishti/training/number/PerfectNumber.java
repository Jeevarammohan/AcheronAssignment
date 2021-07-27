package com.shrishti.training.number;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=scanner.nextInt();
		int sum=0;
		for(int value=1;value<number;value++) {
			if(number%value==0) {
				sum+=value;
			}
		}
		if(sum==number) {
			System.out.println(number+" is a perfect number");
		}
		else {
			System.out.println(number+" is not a perfect number");
		}
		scanner.close();
	}

}
