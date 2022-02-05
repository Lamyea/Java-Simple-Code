//D to b
// Binary to decimal

import java.util.Scanner;
public class DtoB {
/*public static void main (String[]args) {
	System.out.println(Integer.toBinaryString(23));
	System.out.println(Integer.toBinaryString(34));
	System.out.println(Integer.parseInt("111111111",2)); 
	System.out.println(Integer.toOctalString(8));
	/*int n;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number to Change");
	n = input.nextInt();
	System.out.println(Integer.toBinaryString(n)); // for decimal to binary */
	

	
//}

public static int getDecimal(int binary) {
	int decimal = 0;
	int n = 0;
	while(true) {
		if(binary == 0) {
			break;
		} else {
			int temp = binary%10;
			decimal += temp*Math.pow(2, n);
			binary = binary/10;
			n++;
		}
	}
	return decimal;
}
public static void main(String args[]) {
	System.out.println("Decimal of 1010 is: "+getDecimal(10101));
	
	
}}


