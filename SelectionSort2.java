package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sorted "+Arrays.toString(arr));
		//now lets implement selection sort
		for(int i=0; i<size-1; i++) {
			int min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
				
			} //inner for loop
			
			if(min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			
		}//outer for loop
		
		//lets print the result
		System.out.println("After sorted array ");
		for(int item: arr) {
			System.out.print(item+" ");
		}
	}

}
