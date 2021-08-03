package dsa;

import java.util.Arrays;

public class FindDuplicate1 {

	static void FindDuplicate(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate found "+arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,5,4,8,5,7,9,7, 8, 9, 22, 87, 22};
		System.out.println("Array is "+Arrays.toString(arr));
		
		FindDuplicate1.FindDuplicate(arr);

	}

}
