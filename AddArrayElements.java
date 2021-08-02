package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class AddArrayElements {
	
	//method
	static void AddElement(int arr[]) {
		int size = arr.length;
		int sum = 0;
		for(int i=0; i<size; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of array elements is "+sum);
		
	}
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(arr));
		
		AddArrayElements.AddElement(arr);
	}

}
