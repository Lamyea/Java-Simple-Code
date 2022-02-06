package factorial;

import java.util.Scanner;

/*public class factorial {
	public static void main(String args[]) {
		int i,fact=1;
		int number=5;//it is the number to calcute factorial
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " + number+ "is: " +fact);
	}

}*/

public class factorial {
	static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
	}
	public static void main(String[] args) {
		int i,number,fact=1;
		Scanner scan = new Scanner(System.in); // user can input whatever number they want. 
		System.out.println("Enter a number to get its factorial: ");
		number = scan.nextInt();
		//int number=4;//It is the number to calculate factorial
		fact= factorial(number);
		System.out.println("Factorial of " + number + "is: "+fact);
	}
}