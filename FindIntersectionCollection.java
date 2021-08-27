package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionCollection {

	public static void main(String[] args) {
		List<Integer> ListA = new ArrayList<Integer>();
		ListA.add(3);
		ListA.add(2);
		ListA.add(11);
		ListA.add(4);
		ListA.add(6);
		ListA.add(7);
		System.out.println("ListA = " + ListA);
		
		List<Integer> ListB = new ArrayList<Integer>();
		ListB.add(1);
		ListB.add(2);
		ListB.add(8);
		ListB.add(4);
		ListB.add(9);
		ListB.add(7);
		System.out.println("ListB = " + ListB);
		List<Integer> listIntersection =new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while(i < ListA.size() && j < ListB.size()){
			listIntersection.add(ListA.get(i));
			listIntersection.add(ListB.get(j));
			i++;
			j++;
		}
		System.out.println("List of Intersection of Two List:");
		System.out.println(listIntersection);
		
		
		
		
	}

	

}
/*
 * Pseudo Code: use same code for collection

 * a) Declare An array for {3,2,11,4,6,7};	 
 * b) Declare another array for {1,2,8,4,9,7};
 * c) Declare for loop iterator from 0 to array length
 * d) Declare a nested for another array from 0 to array length
 * e) Compare Both the arrays using a condition statement
 
 *  f) Print the first array (shoud match item in both arrays)
 */