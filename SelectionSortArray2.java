package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class SelectionSortArray2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]  = sc.nextInt();
		}
		System.out.println("Array is "+ Arrays.toString(arr));
		
		//selection sort starts here
		for(int i=0; i<size -1; i++) {
			int min = i;
			for(int j=i+1; j<size; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				} //if ends here
			}//inner for loop ends here
			
			if(i != min) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min]= temp;
			} //if ends here
			
		} //for loop ends here
		
		System.out.println("The sorted array is ");
		for(int item: arr) {
			System.out.print(item+" ");
		}
				
	}

}
