package dsa;
import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//let's find duplicate
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((arr[i] == arr[j]) && (i != j)) {
					System.out.println("Duplicate element found "+arr[j]);
				}
			}
		}
		
	}

}
