package dsa;

import java.util.Arrays;

public class ArraySelectionSortNew {
	
	//method
	static void SelectionSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		
		System.out.println("Array after selection Sort "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 5, 78,54,206,9,52,12,7,6,3,854,6};
		
		System.out.println("Array before sort "+Arrays.toString(arr));
		
		//sort using method
		ArraySelectionSortNew.SelectionSort(arr);

	}

}
