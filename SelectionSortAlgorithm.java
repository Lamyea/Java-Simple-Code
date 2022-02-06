package SelectionSortAlgorithm;

import java.util.Scanner;

/*public class SelectionSortAlgorithm {
	public static void main(String [] args) {
		int size, i, j, temp;
		int arr[] = new int[50];
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Array Size: ");
		size = scan.nextInt();
		
		System.out.print("Enter Array Elements: ");
		for(i=0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Sorting Array using Selection Sort Texhnique..\n");
		
		for(i=0; i<size; i++) {
			for (j=i+1; j<size; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("Now the Array after Sorting is: ");
		for(i=0; i<size; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

} */

// Another way

public class SelectionSortAlgorithm {
	public static void selectionSort(int [] arr) {
	for(int i = 0; i< arr.length - 1; i++) {
		int index = i;
		for (int j = i + 1; j<arr.length;j++) {
			if(arr[j]<arr[index]) {
				index = j; //searching for lowest index
			}
		}
		int smallerNumber = arr[index];
		arr[index] = arr[i];
		arr[i] = smallerNumber;
	}
	
	}
	public static void main(String[] args) {
		int[] arr1 = {3,5,63,65,21,35};
		System.out.println("Before Selection Sort: ");
		for(int i: arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		selectionSort(arr1); //sorting array using selection sort
		System.out.println("After Selection Sort: ");
		for(int i: arr1) {
			System.out.print(i + " ");
		}
	}
}
