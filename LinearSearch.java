package linearSearch;

import java.util.Scanner;

//normal way
/* Algorith:
 * step1: Traverse the array
 * step2: Match the key element with array element
 * Step3: if key element is found, return the index position of the array element
 * Step4: if key element is not found, return -1
 */
/*public class LinearSearch {
	public static int linearSearch(int[] arr, int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
public static void main(String [] args) {
	int[] a1= {10,20,30,40,50,60};
	int key=50;
	System.out.println(key+ "is found at index: " + linearSearch(a1,key));
}
}*/
public class LinearSearch {
	public static void main(String [] args) {
		int c, n, search, array[];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n= scan.nextInt();
		array = new int[n];
		
		System.out.println("Enter those "+n+ " as elements");
		for(c=0; c<n; c++)
			array[c]=scan.nextInt();
		System.out.println("Enter value to find");
		search = scan.nextInt();
		
		for(c=0; c<n; c++) {
			if(array[c] == search) //searching element is present
			{
				System.out.println(search + "is present at location" + (c+1) + ".");
				break;
			}
		}
		if(c==n) //Element to search isn't present
			System.out.println(search + "isn't present in array");
	}
}
