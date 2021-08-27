package week3.day2.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.bcel.generic.ARRAYLENGTH;
public class CollectionsAssignment {
	public static void main(String[] args) {
		//1.Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)	
		ArrayList<String> arrList =  new ArrayList<String>();
		arrList.add("Google");
		arrList.add("Microsoft");
		arrList.add("TestLeaf");
		arrList.add("Maverick");
		System.out.println(arrList);
		//2.Get the length of the array	
		int arrayLength = arrList.size(); 
		System.out.println("The length of the array is: " + arrayLength);
		
		//3. sort the array
		Collections.sort(arrList);
		System.out.println(arrList);
		//4. Iterate it in the reverse order
		//Collections.sort(arrList, Collections.reverseOrder());
		System.out.println(arrList);
		System.out.print("[");
		for(int i=arrayLength-1;i>=0;i--)
		{
			System.out.print(arrList.get(i));
			if(i!=0)
				System.out.print(", ");
				
		}
		System.out.print("]");
		
		
		
		}
 
	
	
}

//Assignment 3: Sort using Collections.

//1.Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		
//
//2.Get the length of the array		
//
//3. sort the array			
//
//4. Iterate it in the reverse order
//
//5. print the array
//		
//6. Required Output: Wipro, HCL , CTS, Aspire Systems