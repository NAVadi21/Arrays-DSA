package practice;

import java.util.Scanner;

public class TwoDArray2Insert {
	
	//function to insert the elements
	static void InsertElement(int arr[][], Scanner sc, int row, int col) {
		System.out.println("Enter array elements");
		//insert loop
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//print loop
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}

	//driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row ");
		int row = sc.nextInt();
		System.out.println("Enter col");
		int col = sc.nextInt();
		
		int arr[][] = new int[row][col];
		
		//call the function to insert the array elements
		
		TwoDArray2Insert.InsertElement(arr, sc, row, col);
	}

}
