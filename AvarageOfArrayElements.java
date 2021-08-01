package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class AvarageOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we are taking scanner class for user input
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the size of the array");
		int size = sc.nextInt(); 
		int arr[] = new int[size];
		//now we will insert the array elements
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		//now we will take sum of all array elem
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = arr[i] + sum;
		}
		//now we will calculate the avg of the sum of array elements
		int avg = sum/size;
		
		//lets display the results
		System.out.println("The sum of the array elements is "+sum);
		System.out.println("The avg of the array elements is "+avg);

	}

}
