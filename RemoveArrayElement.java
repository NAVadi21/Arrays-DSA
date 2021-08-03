package dsa;

import java.util.Arrays;

public class RemoveArrayElement {
	
	static void RemoveElement(int arr[], int remove) {
		for(int i=0; i<arr.length; i++) {
			if(remove == arr[i]) {
				for(int j=i; j<arr.length-1; j++) {
					arr[j] = arr[j+1];
				}
				break;
			}
		}
		//System.out.println("After delete "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,54,85,42,54,52};
		System.out.println("Array is "+Arrays.toString(arr));
		int remove = 12;
		
		RemoveArrayElement.RemoveElement(arr, remove);
		System.out.println("New array is "+Arrays.toString(arr) +" deleted "+remove);

	}

}
