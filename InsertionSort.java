package dsa;

import java.util.Arrays;

public class InsertionSort {

	//function for sort
	static void InsertionSort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {45,5,12,78,2,6,9,45,852,12,63,87,5,94,15};
		System.out.println("Array before sort "+Arrays.toString(arr));
		InsertionSort.InsertionSort(arr);
		System.out.println("Array after sort "+Arrays.toString(arr));

	}

}
