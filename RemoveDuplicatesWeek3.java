package week3.day2.Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWeek3 {

	public static void main(String[] args) {

		String str = "PayPal India";
		System.out.println("The original string : " + str);
		char charArray[] = str.toCharArray();
		LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			charSet.add(str.charAt(i));
		}
		System.out.println("The removed duplicate string is: ");
		for (Character ch : charSet)
			System.out.print(ch);
	}
}

//Assignment 4: RemoveDuplicates 
//
//Declare a String as PayPal India
//
//1.Convert it into a character array
//
//2.Declare a Set as charSet for Character
//
//3.Declare a Set as dupCharSet for duplicate Character
//
//4.Iterate character array and add it into charSet
//
//5.If the character is already in the charSet then, add it to the dupCharSet
//
//6.Check the dupCharSet elements and remove those in the charSet
//
//7.Iterate using charSet
//
//8.Check the iterator variable isn't equals to an empty space
//
//9.print it