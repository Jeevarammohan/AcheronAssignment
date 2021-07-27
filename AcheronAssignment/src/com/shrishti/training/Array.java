package com.shrishti.training;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scanner.nextInt();
		int array[]=new int[size];
		int smallestNumberInTheArray=Integer.MAX_VALUE;
		int greatestNumberInTheArray=0;
		System.out.println("Enter the array elements");
		for(int index=0;index<size;index++) {
			array[index]=scanner.nextInt();
			if(greatestNumberInTheArray<array[index]) {
				greatestNumberInTheArray=array[index];
			}
			if(smallestNumberInTheArray>array[index]) {
				smallestNumberInTheArray=array[index];
			}
		}
		for(int row=0;row<size;row++) {
			for(int col=row+1;col<size;col++) {
				if(array[row]>array[col]) {
					array[row]^=array[col];
					array[col]^=array[row];
					array[row]^=array[col];
				}
			}
		}
		System.out.println("The smallest number in the array is: "+smallestNumberInTheArray);
		System.out.println("The greatest number in the array is: "+greatestNumberInTheArray);
		System.out.println("The second smallest number in the array is: "+array[1]);
		System.out.println("The second largest number in the array is: "+array[size-2]);



		
	}

}
