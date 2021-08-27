package week3.day2.Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordCollection {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		Set<String> uniqueWords = new LinkedHashSet<String>();
		Set<String> duplicateWords = new LinkedHashSet<String>();
for (String eachWord : words) {
	if(!uniqueWords.add(eachWord)) {
		duplicateWords.add(eachWord);
	}
}
for (String wd : uniqueWords) {
	System.out.print(wd + " ");
}
	}

}
/*
 * Pseudo code: do same code using collection
 * 
 * a) Use the declared String text as input String text =
 * "We learn java basics as part of java sessions in java week1"; b) Initialize
 * an integer variable as count c) Split the String into array and iterate over
 * it d) Initialize another loop to check whether the word is there in the array
 * e) if it is available then increase and count by 1. f) if the count > 1 then
 * replace the word as ""
 * 
 * g) Displaying the String without duplicate words
 */