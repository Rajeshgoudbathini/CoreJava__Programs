package matrix_Programs;

import java.util.InputMismatchException;
import java.util.Iterator;

public class General_Matrix_Programs {

	public static void main(String[] args) {
		int Matrix1 [][] = {    
                {1, 3, 2},    
                {3, 1, 1},    
                {1, 2, 2}    
             };    
    
  
    int Matrix2 [][] = {    
                     {2, 1, 1},    
                     {1, 0, 1},    
                     {2, 3, 1}    
                    };    
    int[]  values = {5, 8, 3, 6};
	int[] rows = {2, 1, 2, 3};
	int[]  columns = {0, 1, 2, 4};

            sparseMatrix(values, rows, columns);
	}

	static void frequency_of_odd_and_even_numbers_in_the_given_matrix(int [][]matrix) { 
		int rows=matrix.length,columns=matrix[0].length,even=0,odd=0,j,i;
		if(identity_matrix.checkDimentions(matrix)==false) { 
			throw new InputMismatchException("Matrix has  different Dimensions.please recheck the input");
		}else { 			
			for( i=0;i<rows;i++) { 
				for( j=0;j<columns;j++) { 
					if(matrix[i][j]%2==0) { 
						even++;
					}else { 
						odd++;
					}
				}
			}
		}
		System.out.println("Frequency of even in given matrix : "+even);
		System.out.println("Frequency of  odd in given matrix : "+odd);
	}

    static void product_of_two_matrices(int [][]Matrix1,int[][]Matrix2) { 
    	
    /*	1 3 2  X  2 1 1  =  1*2+3*1+2*1  1*1+3*0+2*3  1*1+3*1+2*1
    	3 1 1     1 0 1     3*2+1*1+1*1   1*1+3*0+3*2  3*1+1*1+1*1
    	1 2 2     1 3 1     2*2+2*1+2*1  1*1+2*0+2*3  1*1+2*1+2*1  */
    	
    	if(identity_matrix.checkDimentions(Matrix2)!=identity_matrix.checkDimentions(Matrix2)) { 
    		throw new InputMismatchException("");
    	}else { 
    		
    		int row1=Matrix1.length;
    		
    	  int  row2 = Matrix2.length;    
    	  int  column2 = Matrix2[0].length; 
    		int [][] product=new int[row1][column2];
    		for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column2; j++) {
					for(int k=0;k< row2;k++) {
					product[i][j]+=Matrix1[i][k]*Matrix2[k][j];
					}
				}
			}     	
        	for (int i = 0; i < row1; i++) {
        		for (int j = 0; j < column2; j++) {
        			
        			System.out.print(product[i][j]+" ");
        		}
        		System.out.println();
    		}
    	}
    	
    }

     static void sum_of_each__row_and_each_column_of_a_matrix(int [][] matrix) { 
    	
    	 int rows=matrix.length,sum;
    	 int column=matrix[0].length;
    	 //sum of the rows
    	 for(int i=0;i<rows;i++) { 
    		 sum=0;
    		for (int j = 0; j < column; j++) {
				sum+=matrix[i][j];
			}
    		System.out.println("Sum of "+i+" row "+sum);
    	 }
    	 
    	 //Sum of the column
    	 for(int i=0;i<column;i++) { 
    		 sum=0;
    		for (int j = 0; j < rows; j++) {
				sum+=matrix[j][i];
			}
    		System.out.println("Sum of "+i+" column "+sum);
    	 }
    }

     static void transpose_of_Matrix(int [][]Matrix) { 
    	 int rows=Matrix.length;
    	 int column=Matrix[0].length;
    	 
    	 int result [][]=new int[column][rows];
    	 
    	 for (int i = 0; i < column; i++) {
			for (int j = 0; j < rows; j++) {
				
				result[j][i]=Matrix[i][j];
				
			}
		}
    	 System.out.println("Before transpose of a matrix : ");

    	 arithmetic_operations_on_two_matrics.printMatrix(Matrix);
    	 System.out.println("After transpose of a matrix : ");
    	 arithmetic_operations_on_two_matrics.printMatrix(result);
     }

     static void sparseMatrix(int[]  values,int[] rows,int[]  columns ) { 
    	//int[]values,int[]rows,int[]columns
//    	int[]  values = {5, 8, 3, 6};
//    	int[] rows = {2, 1, 2, 3};
//    	int[]  columns = {0, 1, 2, 4};
    	
    int rowsmaxlength=	invoke_for_rows_or_column_length_for_sparseMatrix(rows);
    int columnmaxlength=invoke_for_rows_or_column_length_for_sparseMatrix(columns);
	int[][] values1 =new int[rowsmaxlength][columnmaxlength];

    
    for (int i = 0; i <values1.length ; i++) {
    	int row=rows[i];
    	int column=columns[i];
    	int value=values[i];
    	values1[row][column]=value;
    	
	}
    print_spareMatrix(values1);
    	
    }
     static int invoke_for_rows_or_column_length_for_sparseMatrix(int[]arr) { 
	   
	  int max=0;
	   for(int rows:arr) { 
		   if(rows>max) { 
			   max=(byte) rows;
		   }
	   }
	   return max+1;
   }

     static void print_spareMatrix(int[][]arr) { 
	/*   int maxcolumn=0;
	   for(int[]rows :arr) {  
		   maxcolumn=  Math.max(maxcolumn, rows.length);
	   }
	   
	   
	   for(int[] row : arr) { 
		  for (int i = 0; i < maxcolumn; i++) {
			if(i<row.length) { 
				System.out.print(row[i]+" ");
			}else { 
				System.out.print("0 ");
			}
		}
		   System.out.println();
	   }*/
	   
	   for(int[]a:arr) { 
		   for(int element:a) { 
			   System.out.print(element+" ");
		   }
		   System.out.println();
	   }
   }
}
