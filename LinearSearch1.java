package linkedlist;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch1 {
	
	//function for linearSearch
	static void linearSearch(int arr[], int element) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == element) {
				System.out.println("Element is found at "+i+"th position");
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("Element not found");
		}
	}
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		System.out.println("Enter the element to search");
		int element = sc.nextInt();
		
		//call the method for search
		linearSearch(arr, element);
	}

}
