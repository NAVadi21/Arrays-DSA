package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoArrays {
	
	//method
	static void MergeArray(int arr1[], int arr2[]) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		
		int newsize = size1 + size2;
		int newarr[] = new int[newsize];
		
		for(int i=0; i<arr1.length; i++) {
			newarr[i] = arr1[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			newarr[arr1.length+i] = arr2[i];
		}
		
		System.out.println("New merged array is "+Arrays.toString(newarr));
	}
	
	
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Array size");
		int size1 = sc.nextInt();
		System.out.println("Enter 2nd Array size");
		int size2 = sc.nextInt();
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		System.out.println("Enter Array elements for 1st Array");
		for(int i=0;i<arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter Array elements for 2nd Array");
		for(int i=0;i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("1st Array is "+Arrays.toString(arr1));
		System.out.println("2nd Array is "+Arrays.toString(arr2));
		
		//call the merge array method
		AddTwoArrays.MergeArray(arr1, arr2);
		

	}

}
