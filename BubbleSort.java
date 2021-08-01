package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Unsorted array "+ Arrays.toString(arr));
		
		//start the sorting
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				} //if ends here
			} //inner loop ends here
		} //outer loop ends here

		//let's print the result using for each loop
		System.out.print("Sorted Array is ");
		for(int item: arr) {
			System.out.print(item+ " ");
		}
	}

}
