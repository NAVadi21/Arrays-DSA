package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementIntoArrayUserInput {
	
	//function to add new element
	static int[] AddNewElement(int arr[], int newele, int size) {
		int newarr[] = new int[size + 1];
		for(int i=0; i<size; i++) {
			newarr[i] = arr[i];
			newarr[size] = newele;
		}
		return newarr;
	}
	
	

	//driver code
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
		System.out.println("the array is "+Arrays.toString(arr));
		
		System.out.println("Enter the new element to add ");
		int newele = sc.nextInt();
		
		//add the ele
		arr = AddNewElement(arr, newele, size);
		System.out.println("After added "+Arrays.toString(arr));
		

	}

}
