package dsa;
import java.util.Scanner;
import java.util.Arrays;

public class SimpleSorting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sorted "+Arrays.toString(arr));
		
		//now implement the bubble sorting
		//in bubble sort we have to iterate the loop for two times, in first loop we will go the the
		//next line while in second loop we will compare within all elements inside the array
		//let's do this now
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1; j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				} //inner if ends here
			} //inner for loop ends here
		}//outer for loop ends here
		
		System.out.print("After sorting ");
		//we will print this using for each loop
		for(int item: arr) {
			System.out.print(item+" ");
		}

	}

}
