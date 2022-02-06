package primeNumber;

import java.util.Scanner;

/*public class primeNumber {
	// prime number is a number that is divisible only by itself.
	public static void main(String[]args) {
		int i, m=0, flag=0;
		int n=3; // it is the number to be checked
		m = n/2;
		if(n==0 || n==1) {
			System.out.println(n + " is not prime number");
		}else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+ " is prime number");
			}
		}
	}

}*/

//Prime number program using method in java
/*public class primeNumber {
	static void checkPrime(int n) {
		int i, m=0, flag=0;
		m=n/2;
		if(n==0 || n==1) {
			System.out.println(n + " is not a prime number");
		} else {
			for(i=2; i<=m; i++) {
				if(n%i==0) {
					System.out.println(n + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(n + " is prime number");
			}
		}
	}
	public static void main(String[] args) {
		checkPrime(2);
		checkPrime(1);
		checkPrime(3);
		checkPrime(5);
		checkPrime(6);
			
	}
}*/

// Prime number in another way
public class primeNumber{
	   public static void main(String args []) {  
	       Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt();  
	       if (isPrime(n)) {  
	           System.out.println(n + " is a prime number");  
	       } else {  
	           System.out.println(n + " is not a prime number");  
	       }  
	   }  
	  
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	} /// this code has problem. 4 is not prime number but it shows it is prime number

