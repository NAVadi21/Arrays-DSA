package dsa;

import java.util.Scanner;
public class BubbleSort {

    public static void main(String[] args) {

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the user input
        int[] arr = new int[n];

        // Prompt the user to enter the elements of the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at index " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Print the unsorted array
        System.out.println("Unsorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Bubble sort the array
        bubbleSort(arr);

        // Print the sorted array
        System.out.println("\nSorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {

        // Loop through the array
        for (int i = 0; i < arr.length - 1; i++) {

            // Loop through the array from the beginning to the end
            for (int j = 0; j < arr.length - i - 1; j++) {

                // Compare the current element to the next element
                if (arr[j] > arr[j + 1]) {

                    // Swap the elements if they are not in order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
