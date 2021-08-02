package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortJavaMethodUserInput {
	
	//method for bubble sort
	static void BubbleSort(int arr[]) {
		//now we will write the code for sorting
		int size = arr.length;
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				//now we will check the sort condition
				if(arr[j+1]<arr[j]) {
					//[j+1] because we will check the right side element with left side element
					//if it is smaller than left side then we will swap the two elements
					int temp = arr[j+1]; //temp variable for storing the [j+1] value
					arr[j+1] = arr[j]; // here we swapped the two elements
					arr[j] = temp; //now we restore the [j] value
				} //if ends here
			}//inner loop ends here
		} //outer loop ends here
	} //method ends here
	
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); //scanner class for user input
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		//insert the array
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sort "+Arrays.toString(arr));
		
		//now we will call main method to execute the sort method
		BubbleSortJavaMethodUserInput.BubbleSort(arr);
		
		System.out.println("Arrays after Sorted "+Arrays.toString(arr));
		
	}

}
