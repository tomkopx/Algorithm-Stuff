package SearchingAlgorithms;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int key){
		
		//If target = middle element, return middle element index
		if(key == arr[arr.length/2]){
			return arr.length/2;
		}
		//If target < middle element, search lower half of array
		else if(key < arr[arr.length/2]){
			for(int i = 0; i < arr.length/2; i++){
				if(arr[i] == key){
					return i;
				}
			}
		}
		//If target > middle element, search upper half of array
		else if(key > arr[arr.length/2]){
			for(int i = arr.length/2; i < arr.length; i++){
				if(arr[i] == key){
					return i;
				}
			}
		}
		//If not found, return -1 to display error message
		return -1;
	}

	public static void main(String[] args) {
		
		int[] data = {0,1,2,3,4,5,6,7,8,9};
		int key = 5;
		int result = binarySearch(data, key);
		
		if(result == -1){
			System.out.println("Key not found in array");
		}
		else{
			System.out.println("Key " + key + " found at index: " + result);
		}

	}

}
