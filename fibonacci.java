package fibonacci;

//Fibonacci Series in Java without using recursion
/*public class fibonacci {
	public static void main(String []args) {
		int n1=0,n2=1,n3, i, count =10;
		System.out.print(n1+ " " + n2); //printing 0 and 1
		
		for(i=2;i<count;i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	

} */
//Fibonacci Series using recursion in java
public class fibonacci {
	static int n1=0, n2=1, n3 = 0;
	static void printFibonacci(int count) {
		if(count>0) {
			n3= n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " +n3);
			printFibonacci(count-1);
		}
	}
	public static void main(String [] args) {
		int count= 10;
		System.out.print(n1+ " " + n2); //printing 0 and1
		printFibonacci(count-2); //n-2 because 2 number are already printed
	}
}
