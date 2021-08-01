package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class FindDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		String arr[] = new String[size];
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		//now let's find duplicate
		for(int i=0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if((arr[i].equals(arr[j])) && (i != j)) {
					System.out.println("Duplicate element found "+arr[j]);
				}
			}
		}

	}

}
