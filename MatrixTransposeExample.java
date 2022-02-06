package MatrixAdditionExample;

/*public class MatrixAdditionExample {

	public static void main(String[] args) {
		//creating two matrics
		int a[] [] = {{1,3,4},{2,4,3},{3,4,5}};
		int b[] [] = {{1,3,4}, {2,4,3}, {1,2,4}};
		
		//creating another matrix to store the sum of two matrices
		
		int c[][] = new int [3] [3]; //3 rows and 3 columns
		
		//adding and printing addition of 2 matrices
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c[i][j]=a[i][j]+b[i][j]; // use - for subtraction
				System.out.print(c[i][j] + " ");
			}
			System.out.println();//new line
		}

	}

}*/
/*public class MatrixMultiplicationExample{
	public static void main(String args []) {
		//creating two matrices    
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		    
		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//multiplying and printing multiplication of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{
			c[i][j]+=a[i][k]*b[k][j];      
		}//end of k loop  
		System.out.print(c[i][j]+" ");  //printing matrix element  
		}//end of j loop  
		System.out.println();//new line    
		}    
		
	}
}*/


//java program to transpose matrix
//transpose: converting row into columns and colums into row
public class MatrixTransposeExample{
	public static void main(String args []) {
		//creating a matrix
		int original [] [] = {{1,3,4},{2,4,3},{3,4,5}};
		
		//creating another matrix to store transpose of a matrix
		int transpose [][] = new int [3][3]; //3 rows and 3 columns
		
		//code to transpose a matrix
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				transpose[i][j] = original[j][i];
				
			}
		}
		System.out.println("Printing Matrix Without transpose:");
		for (int i=0; i<3; i++) {
			for(int j =0; j<3; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();// new line
		}
		System.out.println("Printing Matrix After Transpose:");
		for(int i=0; i<3; i++) {
			for(int j =0; j<3; j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();//new line
		}
	}
}
