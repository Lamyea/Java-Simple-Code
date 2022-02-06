package Anagram;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// 
		String str1= "Brag";
		String str2= "Grab";
		
		str1= str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//checking for the length of strings
		if(str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			//Converting both the array to character array
			char [] string1 = str1.toCharArray();
			char [] string2 = str2.toCharArray();
			
			//Sorting the arrays using in-built function sort()
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			//Comparing both the array using in build funciton  equals()
			if(Arrays.equals(string1, string2) == true) {
				System.out.println("Both the strings are anagram");
			} else  {
				System.out.println("Both the strings are not anagram");
			}
		}
		
		

	}

}
