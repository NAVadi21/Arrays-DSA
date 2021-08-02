package dsa;

import java.util.Arrays;

public class ReverseStringArray {
	
	static void ReverseArray(String arr[]) {
		int size = arr.length;
		System.out.println("Arrays after reverse");
		for(int i=size-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"Saroj", "Sipan", "Lucy", "Rakesh"};
		System.out.println("The array is "+Arrays.toString(arr));
		
		ReverseStringArray.ReverseArray(arr);
		
	}

}
