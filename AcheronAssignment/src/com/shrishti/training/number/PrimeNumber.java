package com.shrishti.training.number;

import java.util.Scanner;

public class PrimeNumber {
	static boolean isPrime(int number) {
		for(int value=2;value<number;value+=2) {
			if(number%value==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scanner.nextInt();
		if(isPrime(number)) {
			System.out.println(number+" is a prime number");
		}
		else {
			System.out.println(number+" is not a prime number");

		}
		scanner.close();

	}

}
