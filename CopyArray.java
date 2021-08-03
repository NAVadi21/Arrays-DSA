package dsa;

import java.util.Arrays;

public class CopyArray {
	
	static void ArrayCopy(int arr[]) {
		int newarr[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			newarr[i] = arr[i];
		}
		System.out.println("New array is "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,4,87,54};
		
		System.out.println("array is "+Arrays.toString(arr));
		
		CopyArray.ArrayCopy(arr);

	}

}
