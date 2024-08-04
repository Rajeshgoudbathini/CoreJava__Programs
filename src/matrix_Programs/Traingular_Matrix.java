package matrix_Programs;

public class Traingular_Matrix {

	public static void main(String[] args) {
		  int arr[][] = {       
                  {1, 2, 3},    
                  {8, 2, 4},    
                  {4, 5, 6}    
              };   
		  upper_triangular_matrix(arr);
		
	}

	static void lower_triangular_matrix(int[][]matrix) { 
		if(identity_matrix.checkDimentions(matrix)==false) {
			System.out.println("Matrix has  different Dimensions.please recheck the input")	;
			}else {
		int rows=matrix.length;
		int columns=matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if(j>i) { 
					System.out.print("0 ");
				}else { 
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	}

	static void upper_triangular_matrix(int[][]matrix) { 
		
		if(identity_matrix.checkDimentions(matrix)==false) {
			System.out.println("Matrix has  different Dimensions.please recheck the input")	;
			}else {
		int rows=matrix.length;
		int columns=matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if(i>j) { 
					System.out.print("0 ");
				}else { 
					System.out.print(matrix[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	
	}
}
