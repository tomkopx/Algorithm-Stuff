package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr){
		
		boolean flag = true;
		
		while(flag){
			flag = false;
			
			for(int i = 0; i < arr.length - 1; i++){
				
				if(arr[i] > arr[i + 1]){
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = true;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		int[] data = {4, 37, 9, 6, 23, 55, 34, 0, 1};
		
		System.out.println("Unsorted array: " + Arrays.toString(data));
		
		bubbleSort(data);
		
		System.out.println("Sorted array: " + Arrays.toString(data));
		
	}

}
