package practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray1 {
	
	//function to insert array elements
	static void AddElements(int arr[][], Scanner sc, int row, int col) {
		System.out.println("Enter 2D Array elements");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	
	//driver  code
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size ");
		int row = sc.nextInt();
		System.out.println("Enter the column size");
		int col = sc.nextInt();
		 
		int arr[][] = new int[row][col];
		//call the method
		
		TwoDArray1.AddElements(arr, sc, row, col);
		
		//System.out.println("2D Array is "+Arrays.toString(arr));
		
		
	}

}
