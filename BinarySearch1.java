package linkedlist;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {
	
	//function for binarySearch
	static void binarySearch(int arr[], int element) {
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		int count = 0;
		while(low<=high) {
			if(arr[mid] == element) {
				System.out.println("Element found in "+mid+"th position");
				count++;
				break;
			}else if(arr[mid]<=element) {
				low = mid+1;
			}else {
				high = mid-1;
			}
			mid = (low+high)/2;
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
		System.out.println("Enter array elements in a sorted format");
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Arrays is "+Arrays.toString(arr));
		System.out.println("Enter element to search");
		int element = sc.nextInt();
		
		//call the method for search
		binarySearch(arr, element);
	}

}
