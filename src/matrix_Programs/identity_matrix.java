package matrix_Programs;

public class identity_matrix {

	public static void main(String[] args) {
		/*NOTE 2: An identity matrix of size 
n×n has the following properties:
All diagonal elements (elements where the row index equals the column index) are 1 called identity matrix.
An identity matrix is a square matrix where all elements along the main diagonal (from the top-left to the
bottom-right) are 1, and all other elements are 0.*/
         int [][] matrix= { {1,0,0},
		                    {0,1,0},
		                    {0,0,1} };
         if(is_identity_matrix(matrix)==true) { 
        	 System.out.println("Given matrix is a identity matrix");
         }else { 
        	 System.out.println("Given matrix is not a identity matrix");

         }
         

	}
	static boolean is_identity_matrix(int[][]arr) { 
		int rows=arr.length,columns=arr[0].length,i,j;
		
		if(checkDimentions(arr)==true) { 
			
			for( i=0;i<rows;i++) { 
				for( j=0;j<columns;j++) { 
					if(i==j && arr[i][j]!=1) {
						return false;
					  }else if(i!=j && arr[i][j]!=0) { 
						  return false;
					  }
				}
			}
		}
		return true;
}
	static boolean checkDimentions(int[][] arr) { 
		
		int columns=arr[0].length;
		for(int i=1;i<columns;i++) { 
			if(arr[i].length!=columns) {
			return false;
		}
	  }
		return true;
	}

}
