package week3.day2.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestCollection {

	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
      int length = data.length;
      List<Integer> list = Arrays.asList(data);
      Collections.sort(list);
      int secLargestNum =list.get(length-2);
      System.out.println("Second largest Number: " + secLargestNum);
	}
}
