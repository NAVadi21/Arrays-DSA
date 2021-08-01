package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array is "+Arrays.toString(arr));
		
		boolean sorted = true;
		
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1]= arr[j];
					arr[j] = temp;
					
					sorted = false;
				} //if ends here
			}//innerloop
			if(sorted) break;
		}//outerloop
		
		System.out.print("Sorted array is ");
		for(int item: arr) {
			System.out.print(item+" ");
		}

		
	}

}
