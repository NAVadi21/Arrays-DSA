package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElementString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt();
		String arr1[] = new String[size];
		String arr2[] = new String[size];
		
		//now we will insert the elements for both arrays
		System.out.println("Enter elements for Array 1");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = sc.next();
		}
		//we will see our array
		System.out.println("1st Array is "+Arrays.toString(arr1));
		
		//for 2nd array
		System.out.println("Enter the elements for 2nd Array");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.next();
		}
		System.out.println("2nd Array is "+Arrays.toString(arr2));
		
		//now we will compare our array elements
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i].equals(arr2[j])) {
					System.out.println("Matching found "+arr2[j]);
				}
			}
		}

	}

}
