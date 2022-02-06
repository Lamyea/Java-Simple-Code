package AllStringMethod;

//charAt() //codePointAt //codePointbefore
/*public class AllStringMethod {
/*	public static void main(String [] args) {
		String myStr = "Nowrin";
		char result = myStr.charAt(3); 
		//int result2 = myStr.codePointAt(0);
		System.out.println(result); //charAt
		//System.out.println(result2); //codePointAt: this shows error in eclipse
	} */
	
//compareto(), compareToIgnoreCase
/*	public static void main(String [] args) {
		String str1 = "Nowrin ";
		String str2 = "nowrin"; //compareToIgnoreCase() method
		//String str2 = "Nowrin"; for compareto() method
	//	System.out.println(str1.compareTo(str2)); //returns 0 if they are equal
		System.out.println(str1.compareToIgnoreCase(str2));
	
  //contains() method
		System.out.println(str1.contains("rin")); //true
		System.out.println(str1.contains("Air")); //false
//contains and endswith() method are similar. ends letter matter in endswith and contains matter every letter in word
  
 //contentEquals() method
		System.out.println(str1.contentEquals("Nowrin"));
		System.out.println(str1.contentEquals("in"));
//concat() method
		System.out.println(str1.concat(str2)); // u can use first and last name
		
// equals() returns equality and compareto() compare two strings lexicographically.
}

} */

//copyValueOf() method 

public class AllStringMethod{
	public static void main(String [] args) {
		char[] myStr1 = {'N', 'o', 'w', 'r', 'i', 'n'};
		String myStr2 = "";
		myStr2 = myStr2.copyValueOf(myStr1, 0, 6);
		System.out.println("Returned String: " + myStr2);
	
	//hashCode() method
		String myStr3 = "  Bmbu and pitunia   ";
		System.out.println(myStr3.hashCode());
	//IndexOf() method
		System.out.println(myStr3.indexOf("and"));
		System.out.println(myStr3.indexOf("p",1));
	//length() method
		System.out.println(myStr3.length()); //length counts whitespace
		
	//replace() method
		System.out.println(myStr3.replace("Bmbu", "Bunny"));
	//starswith() method
		System.out.println(myStr3.startsWith("B"));
	//toUpperCase() and toLowerCase() method
		System.out.println(myStr3.toUpperCase());
		System.out.println(myStr3.toLowerCase());
	//trim() method removes the white space from both ends of a string
		System.out.println(myStr3.trim());
	}
}