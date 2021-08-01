package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class CheckTheValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is "+Arrays.toString(arr));
		
		//lets now find a number from this array
		int count = 0;
		System.out.print("Enter a number to find ");
		int no = sc.nextInt();
		//search the number from the array
		for(int i=0; i<arr.length; i++) {
			if(no == arr[i]) {
				count++;
			}
		}
		if(count > 0) {
			System.out.println(no+" is found "+count+" times.");
		}else {
			System.out.println(no+" not found.");
		}
		

	}

}
