package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		int arr[] =  new int[size];
		System.out.println("Enter elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		System.out.println("Enter the index n to remove");
		int index = sc.nextInt();
		for(int i=index; i<arr.length - 1; i++) {
			arr[i] = arr[i+1];
		}
		System.out.println("New array is "+Arrays.toString(arr));
	}

}
