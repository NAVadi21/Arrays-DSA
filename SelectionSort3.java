package dsa;
import java.util.Arrays;
public class SelectionSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {54,52,4,1,8,587,20,62,45,11,96,52,10,6,3,45,11,100,87,4,9,14,63};
		int size = arr.length;
		
		System.out.println("Before sorting "+Arrays.toString(arr));
		
		for(int i=0; i<size-1; i++) {
			int min = i;
			for(int j=i; j<size; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				} //if ends here
			}//inner for loop
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
