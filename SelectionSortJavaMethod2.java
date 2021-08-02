package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortJavaMethod2 {
	
	//method code
	static void SelectionSort(int arr[]) {
		int size = arr.length;
		for(int i=0; i<size-1; i++) {
			int min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			} //inner for loop ends here
			
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		} //outer for loop
		System.out.println("The array after sorted "+Arrays.toString(arr));
	}
	
	//driver's code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sort "+Arrays.toString(arr));
		
		//call the method
		SelectionSortJavaMethod2.SelectionSort(arr);
	}

}
