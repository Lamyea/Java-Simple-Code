package DivideString;

/*public class DivideString {

	public static void main(String[] args) {
		String str = "aaabbbccc";
		
		//Stores the length of the string
		int len = str.length();
		
		//n determines the variable that divide string in 'n' equal parts
		int n = 3;
		int temp = 0, chars = len/n;
		//Stores the array of string
		String [] equalStr = new String [n];
		//Check whether a string can be divided into n equal parts
		if(len % n!=0) {
			System.out.println("Sorry this string cannot be divided into" + n + "equals parts.");
		} else {
			for(int i =0; i<len; i = i + chars) {
				//Dividing string in n equal part using substring()
				String part = str.substring(i, i+chars);
				equalStr[temp] = part;
				temp ++;
			}
			System.out.println("equal part of given string are");
			for(int i = 0; i<equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}

	}

}*/

public class DivideString {
	public static void main(String []args) {
		String str = "FUN";
		int len = str.length();
		int temp = 0;
		//total possible subsets for string of size n is n*(n+1)/2
		String arr[] = new String [len*(len+1)/2];
		
		//This loop maintains the starting character
		for(int i =0; i<len; i++) {
			//This loop adds the next character every iteration for the subset to form and add it to the array
			for(int j=i; j<len; j++) {
				arr[temp] = str.substring(i, j+1);
				temp++;
			}
		}
		//This loop prints all the subsets formed from the string
		System.out.println("All subsets for given string are: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
