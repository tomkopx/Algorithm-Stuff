package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
	
	public static void quickSort(int[] arr, int lowerIndex, int higherIndex){
		
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = arr[lowerIndex + (higherIndex - lowerIndex)/2];
		
		while(i <=j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			if(i <= j){
				int temp = arr[i];
				
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
		}
		
		if(lowerIndex < j){
			quickSort(arr, lowerIndex, j);
		}
		if(i < higherIndex){
			quickSort(arr, i, higherIndex);
		}
		
	}

	public static void main(String[] args) {
		
		int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
		System.out.println("Unsorted array: " + Arrays.toString(input));
		
		int length = input.length;
		
		quickSort(input, 0, length - 1);
		System.out.println("Sorted array: " + Arrays.toString(input));

	}

}
