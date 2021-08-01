package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int min = 0;
		
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("The min element is "+min);
	}

}
