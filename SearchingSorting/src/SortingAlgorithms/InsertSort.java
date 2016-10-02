package SortingAlgorithms;

import java.util.Arrays;

public class InsertSort {
	
	public static void insertSort(int[] arr){
		
		int n = arr.length;
		
		for(int i = 1; i < n; i++){
			int key = arr[i];
			int j = i - 1;
			
			while((j > -1) && (arr[j] > key)){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
	}

	public static void main(String[] args) {
		
		int[] data = {4, 2, 9, 6, 23 , 12 , 34 , 0, 1};
		
		System.out.println("Unsorted array: " + Arrays.toString(data));
		
		insertSort(data);
		
		System.out.println("Sorted array: " + Arrays.toString(data));
		
	}

}
