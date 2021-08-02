package dsa;
import java.util.Arrays;

public class BubbleSortArrayMethod {
	
	static void BubbleSort(int arr[]) {
		int size = arr.length;
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				} //if ends
			} //inner for loop end
		} //outer for loop end
	} //method ends here
	
	public static void main(String args[]) {
		int[] arr = {5,8,251,7,21,14,65,32,21,9,4,57,14,21,45,3};
		
		System.out.println("Arrays before sorting "+Arrays.toString(arr));
		
		BubbleSortArrayMethod.BubbleSort(arr);
		
		System.out.println("Sorted array now "+Arrays.toString(arr));
	}
}
