package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class SecondLargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		//now we will find the second largest number
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} // in this step we found the max number
		}
		System.out.println("The first max element in the array is "+max); //highestMax
		
		int secondMax = arr[0];
		for(int i=0; i<arr.length; i++) {
			if((arr[i] < max) && (arr[i] > secondMax)) {
				secondMax = arr[i];
			} // we found second max
		}
		System.out.println("The second max element in the array is "+secondMax); //SecondMax
	}

}
