package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class RevereseTheArray {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(arr));
		
		//now we will reverse the array
		System.out.println("The reverse array is");
		for(int i=size - 1; i>=0; i--) {
			System.out.println(arr[i]+" ");
		}
	}

}
