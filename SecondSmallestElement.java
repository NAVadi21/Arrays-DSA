package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		//now we will find the second smallest number
		
		int min = Integer.MAX_VALUE;
		int second_min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
				if(arr[i] == min) {
					second_min = min;
				}else if(arr[i] < min){
					min = arr[i];
				}else if(arr[i] < second_min) {
					second_min = arr[i];
				}
			}
		System.out.println("Second lowest number is : " + second_min);
	    }

	}
