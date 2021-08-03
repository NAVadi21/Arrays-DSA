package dsa;

import java.util.Arrays;

public class CommonElementInArray {
	
	static void Common(int arr1[], int arr2[]) {
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println("Common found "+arr1[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {45,54,87,95, 87, 87, 52};
		int arr2[] = {54,7,95, 52};
		
		System.out.println("1st array "+Arrays.toString(arr1));
		System.out.println("1st array "+Arrays.toString(arr2));
		
		CommonElementInArray.Common(arr1, arr2);

	}

}
