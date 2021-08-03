package dsa;

import java.util.Arrays;

public class FindMinElementusingMethod {
	
	static void FindMin(int arr[]) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("The min is "+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,54,58,58,1,78,8,58,0,96};
		
		System.out.println("array is "+Arrays.toString(arr));
		
		
		FindMinElementusingMethod.FindMin(arr);
	}

}
