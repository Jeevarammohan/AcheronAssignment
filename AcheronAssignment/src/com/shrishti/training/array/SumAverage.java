package com.shrishti.training.array;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size=scanner.nextInt();
		int array[]=new int[size];
		int sum=0;
		System.out.println("Enter the array elements: ");
		for(int index=0;index<size;index++) {
			array[index]=scanner.nextInt();
			sum+=array[index];
		}
		System.out.println("The sum of all the digits in an array: "+sum);
		System.out.println("The average of all the digits in an array: "+(double)(sum)/size);
		scanner.close();
	}

}
