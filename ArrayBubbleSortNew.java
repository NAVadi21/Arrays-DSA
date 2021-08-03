package dsa;

import java.util.Arrays;

public class ArrayBubbleSortNew {
	
	//method
	static void BubbleSort(int arr[]) {
		for(int i=0; i<arr.length -1; i++) {
			for(int j=0; j<arr.length -1; j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("After Bubble Sort "+Arrays.toString(arr));
	}
	
	//driver code
	public static void main(String args[]) {
		int arr[] = {14,52,85,2,5,54,0,421,4,87,3};
		System.out.println("Array before sorting "+Arrays.toString(arr));
		
		//sort using method
		ArrayBubbleSortNew.BubbleSort(arr);
	}

}
