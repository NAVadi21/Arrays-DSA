package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMergeSort {
	
	//function for mergersort
	static void mergersort(int arr[], int left, int right) {
		//now we will check if left is less than rigth then we will sort
		if(left<right) {
			int mid = (left+right)/2;
			mergersort(arr, left, mid);
			mergersort(arr, mid+1, right);
			merge(arr, left, mid, right);
			
		}
	}
	
	//function for merge
	static void merge(int arr[], int left, int mid, int right) {
		int temparr[] = new int[arr.length];
		int i=left;
		int j=mid+1;
		int k=left;
		while(i<=mid && j<=right) {
			if(arr[i]<=arr[j]) {
				temparr[k] = arr[i];
				i++;
			}else {
				temparr[k] = arr[j];
				j++;
			}
			k++;
		} //while loop ends here
		if(i>mid) {
			while(j<=right) {
				temparr[k] = arr[j];
				k++;
				j++;
			}
		}else {
			while(i<=mid) {
				temparr[k] = arr[i];
				k++;
				i++;
			}
		} //if ends here
		
		//now copy the elements from temparr to arr
		for(k=left; k<=right; k++) {
			arr[k] = temparr[k];
		}
	}
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sort "+Arrays.toString(arr));
		int left = 0;
		int right = arr.length-1;
		//call the sort method
		ArrayMergeSort.mergersort(arr, left, right);
		//print the sorted array
		System.out.println("Array after sorting "+Arrays.toString(arr));
		
	}

}
