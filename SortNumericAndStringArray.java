package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class SortNumericAndStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of your array");
		int size = sc.nextInt();
		int arr[] = new int[size]; //int array
		String arr1[] = new String[size]; //string array
		
		System.out.println("Enter the array elements for Int Array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		} //this is for int array
		
		System.out.println("Enter the array elements for String Array");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.next();
		} //this is for string array
		
		//before sorting array
		System.out.println("The int array before sorting "+Arrays.toString(arr));
		System.out.println("The string array before sorting "+Arrays.toString(arr1));
		
		//now we will do sorting using Arrays method
		Arrays.sort(arr);
		Arrays.sort(arr1);
		
		//now we will see the sorting array
		System.out.println("The int array after sorting "+Arrays.toString(arr));
		System.out.println("The string array after sorting "+Arrays.toString(arr1));
		

	}

}
