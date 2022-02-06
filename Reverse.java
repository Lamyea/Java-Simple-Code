package changeCase;

/*public class changeCase {

	public static void main(String[] args) {
		String str1 = "Great Power";
		StringBuffer newStr = new StringBuffer(str1);
		
		for(int i=0; i<str1.length(); i++) {
			//Checks for lower case character
			if(Character.isLowerCase(str1.charAt(i))) {
				//Convert it into upper case using toUpperCase() function
				newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
			}
			//Checks for upper case character
			else if(Character.isUpperCase(str1.charAt(i))) {
				//convert it into upper case using toLowerCase() function
				newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}
		}
		System.out.println("String after case conversion: " + newStr);

	}

}*/


/*public class ReplaceSpace{
	public static void main(String []args) {
		String string = "Once in a blue moon";
		char ch = '/';
		
		//Replace space with specific character ch
		 string = string.replace(' ', ch);   
		System.out.println("String after replacing spaces with given character:");
		System.out.println(string);
	}
}*/

/*public class PalindromeString {
	public static void main(String [] args) {
		String string = "Kayak";
		boolean flag = true;
		
		//converts the given string into lowercase
		string = string.toLowerCase();
		//Iterate the string forward and backward, compaeone character at a time
		// till middle of the string is reached
		for(int i = 0; i< string.length()/2; i++) {
			if(string.charAt(i)!= string.charAt(string.length()-i-1)) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not a palindrome");
			}
}*/

/*public class StringRotation{
	public static void main(String[]args) {
		String str1 = "abcde", str2 = "deabc";
		
		if(str1.length()!= str2.length()) {
			System.out.println("Second string is not a rotation of first string");
		}
		else {
			//Concatenate str1 with str1 and store it in str1
			str1 = str1.concat(str1);
			//Check whether str2 is present in str1
			if(str1.indexOf(str2)!= -1)
				System.out.println("Second string is a rotation of first string");
			else
				System.out.println("Second string is not a rotation of first string");
		}
	}
}*/

/*public class Characters     {

public static void main(String[] args) {    
   String str = "grass is greener on the other side";    
   int[] freq = new int[str.length()];    
   char minChar = str.charAt(0), maxChar = str.charAt(0);    
   int i, j, min, max;            
       
   //Converts given string into character array    
   char string[] = str.toCharArray();    
       
   //Count each word in given string and store in array freq    
   for(i = 0; i < string.length; i++) {    
       freq[i] = 1;    
       for(j = i+1; j < string.length; j++) {    
           if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {    
               freq[i]++;    
                   
               //Set string[j] to 0 to avoid printing visited character    
               string[j] = '0';    
           }    
       }    
   }    
       
   //Determine minimum and maximum occurring characters    
   min = max = freq[0];    
   for(i = 0; i <freq.length; i++) {    
           
       //If min is greater than frequency of a character     
       //then, store frequency in min and corresponding character in minChar    
       if(min > freq[i] && freq[i] != '0') {    
           min = freq[i];    
           minChar = string[i];    
       }    
       //If max is less than frequency of a character     
       //then, store frequency in max and corresponding character in maxChar    
       if(max < freq[i]) {    
           max = freq[i];    
           maxChar = string[i];    
       }    
   }    
       
   System.out.println("Minimum occurring character: " + minChar);    
   System.out.println("Maximum occurring character: " + maxChar);    
} }
*/

public class Reverse {
	public static void main(String [] args) {
		String string = "Dream big";
		//Stores the reverse of given string
		String reversedStr = "";
		
		//Iterate through the string from last and add each character to variable reversedStr
		for(int i = string.length()-1; i>=0l; i--) {
			reversedStr = reversedStr + string.charAt(i);
		}
		System.out.println("Original string: " + string);
		//Displays the reverse of given string
		System.out.println("Reverse of given string: " + reversedStr);
	}
}