package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size]; //here we will take one extra size becaue later we will add a new array. So size will be +1
		System.out.println("enter the elements ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("array is "+Arrays.toString(arr));
		
		//now we will insert an element to an array
		//so we will take the new element from  the user
		System.out.println("Enter the index number where new array will be inserted");
		int index = sc.nextInt(); // we will take index number for new element
		System.out.println("Enter the new element");
		int newEl = sc.nextInt(); //this is for new element
		
		//now let's add the element
		for(int i=size - 1; i>index;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = newEl;
		System.out.println("New element is added "+Arrays.toString(arr));
	}

}
