package practice;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Prompt the user to enter the number of columns
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array to store the user input
        int[][] arr = new int[rows][columns];

        // Prompt the user to enter the elements of the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the element at row " + i + " and column " + j + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("The 2D array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
