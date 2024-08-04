package Array_Programs;

public class array_Rotation {

	  public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int n = 4; // Number of positions to right rotate

	        System.out.println("Original Array:");
	        printArray(arr);

	        rightRotate(arr, n);

	        System.out.println("\nArray after right rotation by "+n+" positions:");
	        printArray(arr);
	    }

	    // Method to right rotate the array by n positions by rotating one element at a time
	    static void rightRotate(int[] arr, int n) {
	      
	    	int length=arr.length-1;
	    	for(int i=0;i<n;i++) { 
	    		
	    		int lastElement=arr[length];
	    		for(int j=length;j>0;j--) { 
	    			arr[j]=arr[j-1];
	    		}
	    		arr[0]=lastElement;
	    	}
	    	
	    }

	    
	    static void leftRotate(int[] arr,int n) { 
	    	//In right array we got last elements at first by considering given position now left was quite opposite means
	    	//first elements must come last
	    	
	    	int length=arr.length-1;

	    	for(int i=0;i<n;i++) { 
	    		
	    		int firstElement=arr[0];
	    		
	    		for(int j=0;j<length;j++) { 
	    			arr[j]=arr[j+1];
	    		}
	    		arr[length]=firstElement;
	    	}
	    }
	    
	    
	    // Utility method to print the array
	    static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}


