package com.shrishti.training.array;

import java.util.Scanner;

public class DuplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=scanner.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the array elemenst: ");
		int countArray[]=new int[Integer.MAX_VALUE];
		int count=0;
		for(int index=0;index<size;index++) {
			array[index]=scanner.nextInt();
			countArray[array[index]]++;
		}
		for(int index=0;index<size;index++) {
			if(countArray[array[index]]>1) {
				count++;
			}
		}
		System.out.println("The number of duplicates elements in the array is "+count);
		scanner.close();
		
	}

}
