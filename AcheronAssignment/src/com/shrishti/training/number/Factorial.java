package com.shrishti.training.number;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=scanner.nextInt();
		int factorial=1;
		while(number>1) {
			factorial*=number--;
		}
		System.out.println("The factorial of a "+number+" is "+factorial);
		scanner.close();

	}

}
