package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class CopyArrayFromAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		int arr2[] = new int[size]; //this array will be copied from arr1
		System.out.println("Enter the element for array 1 ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i]  = sc.nextInt();
		}
		System.out.println("1st array is "+Arrays.toString(arr1));
		
		//now we will copy the arr1 to arr2
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		//array2 is now copied from array1
		System.out.println("2nd array is which is copied from arr1 "+Arrays.toString(arr2));
	}

}
