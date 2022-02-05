package palindrome;

import java.util.Scanner;

public class palindrome {
	public static void main (String[]args) {
		String input,  reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		input = sc.nextLine();
		
		int length = input.length();
		for (int i = length -1; i>=0; i--)
			reverse = reverse + input.charAt(i);

		
		System.out.println(input + " This is the number you gave");
		System.out.println(reverse + " This is the number that reversed");
		
		if(input.equals(reverse)) {
			System.out.println(input+ " This is palindrome");
			
		}
		else
			System.out.println(input + " this is not palindrome");
	}
}
