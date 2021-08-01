package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size"); //user input message
		int size = sc.nextInt();
		int arr[] = new int[size]; //new array
		System.out.println("Enter the elements for array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		//now we will remove an element from array
		System.out.println("Enter the index no to remove");
		int index = sc.nextInt();
		for(int i=index; i<arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		System.out.println("After removing the new array is "+Arrays.toString(arr));

	}

}
