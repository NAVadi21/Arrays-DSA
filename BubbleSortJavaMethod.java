package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSortJavaMethod {
	
	//method
	static void BubbleSort(int arr[]) {
		int size = arr.length;
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			} //inner for loop
		} //outer for loop
		System.out.println("After sorting "+Arrays.toString(arr));
	}
	
	//driver code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		//call the sort method
		BubbleSortJavaMethod.BubbleSort(arr);
	}

}
