package dsa;

import java.util.Arrays;

public class MergeTwoArrays {
	
	//method
	static void MergeArray(int arr1[], int arr2[]) {
		int size1 = arr1.length;
		int size2 = arr2.length;
		int newsize = size1 + size2;
		int newarr[] = new int[newsize];
		for(int i=0; i<arr1.length; i++) {
			newarr[i] = arr1[i];
		} //1st array inserteds
		
		for(int i=0; i<arr2.length; i++) {
			newarr[arr1.length + i] = arr2[i];
		} //2nd array inserted
		
		System.out.println("Merged array is "+Arrays.toString(newarr));
	}

	//driver code	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1, 5, 8, 25 ,12};
		int arr2[] = {54, 87, 87, 25};
		
		System.out.println("1st Array is "+Arrays.toString(arr1));
		System.out.println("2nd Array is "+Arrays.toString(arr2));
		
		//call the method
		MergeTwoArrays.MergeArray(arr1, arr2);
		
	}

}
