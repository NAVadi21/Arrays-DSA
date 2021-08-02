package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sorting "+Arrays.toString(arr));
		
		//now do the selection sort
		for(int i=0; i<size-1; i++) {
			int min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			} ///if ends here
			
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}// for loop ends
		
		System.out.println("After sorting ");
		for(int item: arr) {
			System.out.print(item+" ");
		}

	}

}
