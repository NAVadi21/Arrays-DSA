package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class SelectionSortArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size  = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		//let's start selection sort
		for(int i=0; i<size-1; i++) {
			int min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				} //if ends here
			}//for loop ends here
			
			if(min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			} //if ends here
		} //for loop ends here
		
		System.out.println("After sorting ");
		for(int item: arr) {
			System.out.print(item+" ");
		}
	}

}
