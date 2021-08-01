package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class FindTheIndex {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		//now we will find index
		System.out.println("Enter the index number to find element from array:");
		int index = sc.nextInt();
		int element = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == arr[index]) {
				element = arr[i];
			}
		}
		System.out.println("Index no "+index+" is found with element "+element);
	}

}
