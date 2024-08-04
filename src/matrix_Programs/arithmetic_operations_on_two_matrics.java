package matrix_Programs;

import java.util.InputMismatchException;

public class arithmetic_operations_on_two_matrics {

	public static void main(String[] args) {
		//Note:Rather than getting every operation for individual methods use switch case and do operations
		//by using only one method use these method:- arithematic_operations_on_two_matrics( matrix1,matrix2 , operator);
		 int[][] matrix1 = { {2, 2, 3},
                             {4, 5, 6},
                             {7, 8, 10} };

         int[][] matrix2 = { {2, 2, 3},
                             {4, 5, 6},
                             {7, 8, 10} };

         if(chect_whether_two_matrices_are_equal(matrix1, matrix2)) { 
               	System.out.println("Given two matrix are  equal");
                 }else { 
                		System.out.println("Given two matrix are not equal");
	        }
 
	}

	static void Add_The_Two_Matrices(int Matrix1[][],int Matrix2[][]) { 
		
		if(!checkDimensions(Matrix1) || !checkDimensions(Matrix2)) { 
			System.out.println("Array hs different Dimensions.cannot perform addition,please recheck the input");
		}else { 
			int rows=Matrix1.length;
			int columns=Matrix1[0].length;
			
			int [][] result=new int[rows][columns];
			
			for(int i=0;i<rows;i++) { 
				for(int j=0;j<columns;j++) { 
					result[i][j] =	Matrix1[i][j]+Matrix2[i][j];
				}
			}
			System.out.println("Addition  of two matrix: ");

			printMatrix(result);
		}
		
	}

	
    static void Subtract_The_Two_Matrices(int Matrix1[][],int Matrix2[][]) { 
		
		if(!checkDimensions(Matrix1) || !checkDimensions(Matrix2)) { 
			System.out.println("Array hs different Dimensions.cannot perform addition,please recheck the input");
		}else { 
			int rows=Matrix1.length;
			int columns=Matrix1[0].length;
			
			int [][] result=new int[rows][columns];
			
			for(int i=0;i<rows;i++) { 
				for(int j=0;j<columns;j++) { 
					result[i][j] =	Matrix1[i][j]-Matrix2[i][j];
				}
			}
			System.out.println("Subtraction of two matrix: ");
			printMatrix(result);
		}
		
	}

    
    static void Multiply_The_Two_Matrices(int Matrix1[][],int Matrix2[][]) { 
		
		if(!checkDimensions(Matrix1) || !checkDimensions(Matrix2)) { 
			System.out.println("Array hs different Dimensions.cannot perform addition,please recheck the input");
		}else { 
			int rows=Matrix1.length;
			int columns=Matrix1[0].length;
			
			int [][] result=new int[rows][columns];
			
			for(int i=0;i<rows;i++) { 
				for(int j=0;j<columns;j++) { 
					result[i][j] =	Matrix1[i][j]*Matrix2[i][j];
				}
			}
			System.out.println("Addition  of two matrix: ");

			printMatrix(result);
		}
		
	}

    static void Divide_The_Two_Matrices(int Matrix1[][],int Matrix2[][]) { 
		
		if(!checkDimensions(Matrix1) || !checkDimensions(Matrix2)) { 
			System.out.println("Array hs different Dimensions.cannot perform addition,please recheck the input");
		}else { 
			int rows=Matrix1.length;
			int columns=Matrix1[0].length;
			
			int [][] result=new int[rows][columns];
			
			for(int i=0;i<rows;i++) { 
				for(int j=0;j<columns;j++) { 
					result[i][j] =	Matrix1[i][j]/Matrix2[i][j];
				}
			}
			System.out.println("Addition  of two matrix: ");

			printMatrix(result);
		}
		
}
 
    static void arithematic_operations_on_two_matrics(int Matrix1[][],int Matrix2[][],char operator){ 
    	
    	switch(operator) { 
    	case '+':
    		if(!checkDimensions(Matrix1) || !checkDimensions(Matrix2)) { 
    			System.out.println("Array hs different Dimensions.cannot perform addition,please recheck the input");
    		}else { 
    			int rows=Matrix1.length;
    			int columns=Matrix1[0].length;
    			
    			int [][] result=new int[rows][columns];
    			
    			for(int i=0;i<rows;i++) { 
    				for(int j=0;j<columns;j++) { 
    					result[i][j] =	Matrix1[i][j]+Matrix2[i][j];
    				}
    			}
    			System.out.println("Addition  of two matrix: ");

    			printMatrix(result);
    		}
    		break;
    	case '-':
    		if(!checkDimensions(Matrix1) || !checkDimensions(Matrix2)) { 
    			System.out.println("Array hs different Dimensions.cannot perform addition,please recheck the input");
    		}else { 
    			int rows=Matrix1.length;
    			int columns=Matrix1[0].length;
    			
    			int [][] result=new int[rows][columns];
    			
    			for(int i=0;i<rows;i++) { 
    				for(int j=0;j<columns;j++) { 
    					result[i][j] =	Matrix1[i][j]-Matrix2[i][j];
    				}
    			}
    			System.out.println("Addition  of two matrix: ");

    			printMatrix(result);
    		}
    		break;
    	case '*':
    		if(!checkDimensions(Matrix1) || !checkDimensions(Matrix2)) { 
    			System.out.println("Array hs different Dimensions.cannot perform addition,please recheck the input");
    		}else { 
    			int rows=Matrix1.length;
    			int columns=Matrix1[0].length;
    			
    			int [][] result=new int[rows][columns];
    			
    			for(int i=0;i<rows;i++) { 
    				for(int j=0;j<columns;j++) { 
    					result[i][j] =	Matrix1[i][j]*Matrix2[i][j];
    				}
    			}
    			System.out.println("Addition  of two matrix: ");

    			printMatrix(result);
    		}
    		break;
    	case '/':
    		if(!checkDimensions(Matrix1) || !checkDimensions(Matrix2)) { 
    			System.out.println("Array hs different Dimensions.cannot perform addition,please recheck the input");
    		}else { 
    			int rows=Matrix1.length;
    			int columns=Matrix1[0].length;
    			
    			int [][] result=new int[rows][columns];
    			
    			for(int i=0;i<rows;i++) { 
    				for(int j=0;j<columns;j++) { 
    					result[i][j] =	Matrix1[i][j]/Matrix2[i][j];
    				}
    			}
    			System.out.println("Addition  of two matrix: ");

    			printMatrix(result);
    		}
    		break;
    	default:
    		System.out.println("Unsupported operator "+operator);
    	}
    }
    
    
    static boolean chect_whether_two_matrices_are_equal(int Matrix1[][],int Matrix2[][]) { 
    	
    	if(checkDimensions(Matrix1)!=checkDimensions(Matrix2)) { 
    		//System.out.println("Given matrix are unequal.check the input");
    		throw new InputMismatchException(": Given inputs are mismatched");
    	}else {
    	
    	int rows=Matrix1.length;
    	int columns=Matrix2[0].length;
    	for (int i = 0; i < rows; i++) {
    		for (int j = 0; j < columns; j++) {
    			if(Matrix1[i][j]!=Matrix2[i][j]) { 
    				return false;
    			}
    		}
		 }
    	}
    	return true;
    }
    
    //utility method to check dimensions
	
     static boolean checkDimensions(int[][]arr) { 
		int column=arr[0].length;
		
		for(int i=1;i<column;i++) { 
			if(arr[i].length!=column) { 
				return false;
			}
		}
		return true;
	}

	//utility method to print result
    static void printMatrix(int[][]arr) { 
    	int columns = arr[0].length;
    	int rows = arr.length;
    	
    	for (int i = 0; i < rows; i++) {
    		for (int j = 0; j < columns; j++) {
    			
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
		}
    }

    
}

   







/* NOTE : Matrix relates to mathematics that can be defined as a 2-dimensional array 
 * in the form of a rectangle which is filled either with numbers or symbols 
 * or expressions as its elements. The matrix has a row and column arrangement of its elements.
 A matrix with m rows and n columns can be called as m × n matrix. Individual entries in the
  matrix are called element and can be represented by aij which suggests that the element
   a is present in the ith row and jth column. */


