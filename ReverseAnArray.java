package dsa;

import java.util.Arrays;

public class ReverseAnArray {
	
	static void Reverse(int arr[]) {
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {54, 52, 45, 20, 87,15};
		
		System.out.println("Before Reverse "+Arrays.toString(arr));
		
		ReverseAnArray.Reverse(arr);

	}

}
