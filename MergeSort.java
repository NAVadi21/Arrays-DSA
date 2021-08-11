package dsa;

import java.util.Arrays;

public class MergeSort {
	
	//functon for mergesort
	static void mergesort(int arr[], int left, int right) {
		if(left < right) {
			int mid = (left+right)/2;
			mergesort(arr, left, mid);
			mergesort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	//functon for merge
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
				k++; j++;
			}
		}else {
			while(i<=mid) {
				temparr[k] = arr[i];
				k++;
				i++;
			}
		} //if else ends here
		for(k=left; k<=right; k++) {
			arr[k] = temparr[k];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,54,1,85,2,7,6,45,78,30,20,41,5,9,61};
		int left = 0;
		int right = arr.length-1;
		System.out.println("Array before sort "+Arrays.toString(arr));
		
		//call the mergeSort function
		MergeSort.mergesort(arr, left, right);
		
		System.out.println("Array after sort "+Arrays.toString(arr));

	}

}
