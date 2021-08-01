package dsa;
import java.util.Arrays;

public class ArraySelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {25, 4, 85, 20, 45, 6, 9, 40, 87, 5};
		int size = arr.length;
		
		System.out.println("Array before sorting "+Arrays.toString(arr));
		
		for(int i=0; i<size-1; i++) {
			int minIndex = i;
			for(int j=i; j<size; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				} //if ends here
			} //inner loop ends here
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		} //for loop ends here
		
		System.out.print("After sorted ");
		for(int item: arr) {
			System.out.print(item+" ");
		}

	}

}
