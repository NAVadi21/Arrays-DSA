package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayBubbleSort {
	public static void main(String args[]) {
		int arr[] = {1, 54, 85,98,63,45,5,78,2,4}; //hardcode array
		int size = arr.length;
		
		//old array
		System.out.println("Unsorted array "+Arrays.toString(arr));
		
		//now we will do for loop for bubble sort
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		
		//after sorting
		System.out.println("After bubble sort ");
		for(int item: arr) {
			System.out.print(item+" ");
		}
	}

}
