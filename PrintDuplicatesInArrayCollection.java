package week3.day2.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArrayCollection {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20);
		System.out.println("Print Duplicates in Array using collection:");
		for (int i = 11; i <= 20; i++) {
			int result = Collections.frequency(arr, i);
			if (result >= 2) {
				System.out.println(i);
			}
		}

	}

}
