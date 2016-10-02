package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
	
	public static int[] selectionSort(int[] arr){
		
		int jMin;
		
		for(int i = 0; i < arr.length- 1; i++){
			
			jMin = i;
			
			for(int j = i + 1; j < arr.length; j++){
				
				if(arr[j] < arr[jMin]){
					jMin = j;
				}
			}
			
			if(jMin != i){
				int temp = arr[i];
				
				arr[i] = arr[jMin];
				arr[jMin] = temp;
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] unsorted = {10 ,34 ,2 ,56 ,7 ,67 ,88 ,42};
		System.out.println("Unsorted Array "+ Arrays.toString(unsorted));
		
		int[] sorted = selectionSort( unsorted ) ;
		System.out.println("Sorted Array "+ Arrays.toString(sorted));

	}

}
