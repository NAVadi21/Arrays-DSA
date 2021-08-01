package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayBubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = sc.nextInt(); //this is the size of the array
		int arr[] = new int[size]; //new int array
		System.out.println("Let's put the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//old array before sorting
		System.out.println("Inputted array is "+Arrays.toString(arr));
		
		//lets start sorting now using bubble sort
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				} //if ends here
			} // inner for loop ends here
		} //outer for loop ends here
		
		//now let's print the result using for each loop
		for(int item: arr) {
			System.out.print(item+" ");
		}
	}

}
