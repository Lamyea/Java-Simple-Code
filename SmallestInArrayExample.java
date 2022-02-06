package findelement;

/*public class largestestArray {
	public static int getLargest(int [] a, int total) {
		int temp;
		for(int i = 0; i< total; i++)
		{
			for(int j = i + 1; j < total; j++) {
				if (a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total -1];
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,6,7};
		int b[] = {44,55,6,77,8,32};
		System.out.println("Largest: "+getLargest(a,6));  
		System.out.println("Largest: "+getLargest(b,6));  

	}

}*/

//third element in array
/*public class ThirdLargestInArrayExample{  
public static int getThirdLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-3];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
System.out.println("Third Largest: "+getThirdLargest(a,6));  
System.out.println("Third Largest: "+getThirdLargest(b,7));  
}} */

//Second smallest
/*public class SecondSmallestInArrayExample{  
public static int getSecondSmallest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[1];//2nd element because index starts from 0  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
System.out.println("Second smallest: "+getSecondSmallest(a,6));  
System.out.println("Second smallest: "+getSecondSmallest(b,7));  
}}  */

//smallest number
public class SmallestInArrayExample{  
public static int getSmallest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[0];  
}  
public static void main(String args[]){  
int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
System.out.println("Smallest: "+getSmallest(a,6));  
System.out.println("Smallest: "+getSmallest(b,7));  
}}
