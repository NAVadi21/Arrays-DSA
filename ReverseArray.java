package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	//method
	static void ReverseArray(int arr[]) {
		System.out.println("The Reverse array is ");
		for(int i=arr.length - 1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//this is the driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		ReverseArray.ReverseArray(arr);
		
	}

}
