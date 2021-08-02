package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
	
	//method
		static void FindMin(int arr[]) {
			int min = arr[0];
			for(int i=0; i<arr.length; i++) {
				if(arr[i]<min) {
					min = arr[i];
				}
			}
			System.out.println("The min element from the array is "+min);
		}
		
		
		//driver code
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter array elements");
			for(int i=0; i<arr.length; i++) {
				arr[i]  = sc.nextInt();
			}
			System.out.println("The array is "+Arrays.toString(arr));
			
			//max
			MinElement.FindMin(arr);

}
}
