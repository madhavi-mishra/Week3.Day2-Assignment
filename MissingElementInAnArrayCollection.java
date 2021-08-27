package week3.day2.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArrayCollection {

	public static void main(String[] args) {
		Integer[] arr = { 0,1,2,3,4,7,6,8};
		int length = arr.length;
		List<Integer> arrList = Arrays.asList(arr);
		Collections.sort(arrList);
		for(int i = 0 ; i<length;i++) {
			if(arr[i] != i) {
				System.out.println("Missing Element in an array using collection : "+i);
				break;
				
			}
		}
		

	}

}
////Here is the input
	//	int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration