package dsa;

import java.util.Arrays;

public class ReverseArrayUsingMethod {
	
	//method
	static void ReverseArray(int arr[]) {
		int size = arr.length;
		for(int i=size - 1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,14,54,85,25,45,87};
		System.out.println("Array before reverse "+Arrays.toString(arr));
		
		ReverseArrayUsingMethod.ReverseArray(arr);
		//System.out.println("After reverse "+Arrays.toString(arr));

	}

}
