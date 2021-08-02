package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class AvgOfArrayElements {
	
	//method
	static void AvgOfArrayElements(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = arr[i] + sum;
		}
		int avg = sum/arr.length;
		System.out.println("The sum of array elements is "+sum);
		System.out.println("The avg of the array elements is "+avg);
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(arr));
		
		//method calling
		
		AvgOfArrayElements.AvgOfArrayElements(arr);

	}

}
