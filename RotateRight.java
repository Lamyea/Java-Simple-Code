package leftrotation;


/*public class duplicate{
	public static void main(String [] args) {
		int [] arr = new int [] {1,2,3,4,5,6,7,2,1,3,5,4};
		System.out.println("Duplicate elements in given array: ");
		//Searches for duplicate element
		for(int i= 0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}*/


/*public class leftrotation {
	public static void main (String [] args) {
		//initialize array
		int [] arr = new int [] {1,2,3,4,5};
		//n determine the number of times an array should be rotated
		int n = 3; 
		//Displays original array
		System.out.println("Original array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	//Rotate the given array by n times towards left
		for(int i=0; i<n; i++) {
			int j,first;
			//Stores the first element of the array
			first = arr[0];
			for(j = 0; j<arr.length-1; j++) {
				//Shift element of array by one
				arr[j] = arr[j+1];
			}
			//First element of array will be added to the end
			arr[j] = first;
		}
		System.out.println();
		//Displays resulting array after rotation
		System.out.println("Array after left rotation: ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}*/

//RotateRight
public class RotateRight {
	public static void main (String [] args) {
		//initialize array
		int [] arr = new int [] {1,2,3,4,5};
		//n determine the number of times an array should be rotated
		int n = 3; 
		//Displays original array
		System.out.println("Original array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	//Rotate the given array by n times towards left
		for(int i=0; i<n; i++) {
			int j,last;
			//Stores the first element of the array
			last = arr[arr.length-1];
			for(j = arr.length-1; j>0;j--) {
				//Shift element of array by one
				arr[j] = arr[j-1];
			}
			//First element of array will be added to the end
			arr[0] = last;
		}
		System.out.println();
		//Displays resulting array after rotation
		System.out.println("Array after left rotation: ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

//Print array in reverse order
/*public class reverseorder{
	public static void main (String [] args) {
		//Intialize array
		int arr[] = new int [] {1,2,3,4,5};
		System.out.println("Original Array:");
		for (int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order");
		//Loop through the array in reverse order
		for(int i= arr.length - 1; i >=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}*/

//EvenPosition element and OddPosition Element
/*public class ArrayExample{
	public static void main(String args []) {
		int [] arr = new int [] {1,2,3,4,5,6};
		
		System.out.println("Elements of given array presents on even position: ");
		//Loop through the array by incrementing value of i by 2
		//Here, I will start from 1 as the first even positioned element is present at position 1.
		for(int i = 1; i<arr.length; i = i+2) // even number i = 1
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Elements of given array presents on odd position:");
		for ( int i= 0; i<arr.length; i = i+ 2) {
			System.out.print(arr[i] + " ");
		}
	}
}*/

//find the largest element in array
/*public class ArrayExample {
	public static void main (String args []) {
		int [] arr = new int [] {25, 11, 7, 75, 56};
		//Initialize max with first element of array
		int max = arr[0];
		//Loop through the array
		for (int i = 0; i<arr.length; i++) {
			//Compare elements of array with max
			if (arr[i]>max)
				max = arr[i];
		}
		System.out.println("Largest element present in given array: " + max);
	}
}*/

//find the small elements in array // sum of the elements in array
/*public class ArrayExample {
	public static void main (String args []) {
		int [] arr = new int [] {25, 11, 7, 75, 56};
		//Initialize max with first element of array
		int min = arr[0];
		int sum = 0; // to sum elements
		//Loop through the array
		for (int i = 0; i<arr.length; i++) {
			//Compare elements of array with max
			if (arr[i]<min)
				min = arr[i];
			sum = sum + arr[i]; // to sum the elements
			
		}
		System.out.println("Smallest element present in given array: " + min);
		System.out.println("Sum of all the elements of an array: " + sum);
	}
}*/