package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElement {
	
	//method
	static void FindMax(int arr[]) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("The max element from the array is "+max);
	}
	
	
	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]  = sc.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(arr));
		
		//max
		FindMaxElement.FindMax(arr);

	}

}
