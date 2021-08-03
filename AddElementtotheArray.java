package dsa;

import java.util.Arrays;

public class AddElementtotheArray {
	
	static int[] arrNewElement(int length, int arr[], int newElement) {
		int newarr[] = new int[length + 1];
		for(int i=0; i<length; i++) {
			newarr[i] = arr[i];
			newarr[length] = newElement;
		}
		return newarr;
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Logic
		//for adding a new element in the array, first we need to find the index where we will add
		// the new element, then we can add 
		int arr[] = {12, 45,25,4,20};
		int length = arr.length;
		int newElement = 50;
		
		System.out.println("Array is "+Arrays.toString(arr));
		
		arr = arrNewElement(length, arr, newElement);
		
		System.out.println("New added element with array "+Arrays.toString(arr));
		

	}

}
