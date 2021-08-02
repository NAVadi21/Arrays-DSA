package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class SimpleSorting {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//now print some message for user
		System.out.println("Enter the array size");
		int size = sc.nextInt();//this is the array size
		int arr[] = new int[size]; 
		System.out.println("Enter the elements in the array");
		//let's insert the elements in the array
		for(int i=0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		//now we can see our array
		System.out.println("Unsorted array is "+Arrays.toString(arr));
		
		//now start the sorting algorithm
		//we will take a for loop for for bubble sort
		for(int i=0; i<size-1; i++) { //size -1 because bubble sort automatically sort last element
			for(int j=0; j<size-1; j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				} //inner if ends here
			} // inner for loop ends here
		} //outer for loop ends here
		
		//lets print the result
		System.out.println("After sorting");
		for(int item: arr) {
			System.out.println(item+" ");
		}
		
	}

}
