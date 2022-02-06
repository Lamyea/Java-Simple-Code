import java.lang.reflect.Array;
import java.util.Arrays;

/*public class RemoveDuplicateInArrayExample{  
public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,50,50,20,30,40,50};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}*/

public class RemoveDuplicateInArrayExample{
	public static int removeDuplicateElements(int arr[], int n) {
		if(n==0 || n==1) {
			return n;
		}
		int [] temp = new int[n];
		int j = 0; 
		for(int i = 0; i<n-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		//Changing original array
		for(int i=0; i<j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,1,2,34,5,6,13,54,5,57};
		Arrays.sort(arr); //sorting array
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		//printing array elements
		for(int i =0; i<length; i++)
			System.out.print(arr[i] + " ");
	}
}
