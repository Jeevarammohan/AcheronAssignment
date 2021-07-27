package com.shrishti.training.number;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scanner.nextInt();
		int cubeSumValue=0;
		int tempNumber=number;
		while(tempNumber!=0) {
			int reminder=tempNumber%10;
			cubeSumValue+=reminder*reminder*reminder;
			tempNumber/=10;
		}
		if(cubeSumValue==number) {
			System.out.println(number+" is an armstrong number");
		}
		else {
			System.out.println(number+" is not an armstrong number");
		}
		scanner.close();


	}

}
