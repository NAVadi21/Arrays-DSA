package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class SumValuesOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //for user input
		System.out.println("Enter the size of the array"); //for message
		int size = sc.nextInt(); //this is the size of the array
		int arr[] = new int[size]; //we are taking a int array
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt(); //user input
		}
		
		System.out.println("Your array is "+Arrays.toString(arr));
		
		//now we will take a variale for adding
		int sum = 0; //this is initializer for sum
		for(int i=0; i<arr.length; i++) {
			sum = arr[i] + sum;
		}
		
		System.out.println("The sum of the array elements is "+sum);

	}

}
