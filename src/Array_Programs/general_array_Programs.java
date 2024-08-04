package Array_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class general_array_Programs {

	public static void main(String[] args) {
		int[] arr= {11,2,3,6,8,4,1,1,1,1,11,23};
	
		
	}

	static int print_the_largest_element_in_an_array(int[] arr) { 
 
		int max=arr[0];
		int length=arr.length;
		for(int i=0;i<length;i++) { 	
				if(arr[i]>max) { 
				max=arr[i];
				}
			}
		return max;
	 } 

	static int  print_the_smallest_element_in_an_array(int[] arr) { 
		 
		int min=arr[0];
		int length=arr.length;
		for(int i=0;i<length;i++) { 	
				if(arr[i]<min) { 
				min=arr[i];
				}
			}
		return min;
	 } 

	static int print_the_number_of_elements_present_in_an_array(int[] arr) { 
		 int count = 0,i;
		for( i=0;i<arr.length;i++) { 
			count++;
		}
		/*
		count= arr.length;
		*/
		return count;
	 }

    static int print_the_sum_of_all_the_items_of_the_array(int[]arr) { 
	   
	   int sum=0;
	   for(int i=0;i<arr.length;i++) { 
		  sum+= arr[i];
	   }
	   return sum;
   }

    static void sort_the_elements_of_an_array_in_ascending_order(int[]arr) { 
    	int i,j,length=arr.length,temp=0;
    	 for(i=0;i<length;i++) { 
    		 for(j=i+1;j<length;j++) { 
    	    		if(arr[j]<arr[i]) { 
    	    			temp=arr[i];
    	    			arr[i]=arr[j];
    	    			arr[j]=temp;
    	       }
    	   }
       }
    	 
    	 /*//Use these for better efficiency
    	  Arrays.sort(arr);
    	   print_Array(arr);
    	  * */
    }

    static void sort_the_elements_of_an_array_in_decending_order(int[]arr) {
    	
    	int i,j,length=arr.length,temp=0;
   	 for(i=0;i<length;i++) { 
   		 for(j=i+1;j<length;j++) { 
   	    		if(arr[j]>arr[i]) { 
   	    			temp=arr[i];
   	    			arr[i]=arr[j];
   	    			arr[j]=temp;
   	       }
   	   }
     }
   }
   
    static void print_Arraylist(List<Integer> list) { 
    	 for(int sort:list) {
        	 System.out.print(sort+" ");
        }
    }

     static void print_Array(int []arr) { 
   	 for(int sort:arr) {
       	 System.out.print(sort+" ");
       }
    }
     static void Find_largestNumber_or_smallestNumber_like_3rdlargest_2ndsmallest_in_an_array(int []arr,String largest_or_smallest,int position) {
    	 Arrays.sort(arr);
		 LinkedHashSet<Integer> unique = new LinkedHashSet<>();
	        for (int num : arr) {
	            unique.add(num); // Add elements to HashSet to remove duplicates
	        }
         ArrayList<Integer> list=new ArrayList<Integer>(unique);
//	        System.out.println("Printing array with unique elements in sorted order:");
//	        for (int num : list) {
//	            System.out.print(num + " ");
//	        }
    	      int length2=list.size();
			   if (largest_or_smallest.equalsIgnoreCase("smallest")) {
		            if (position < length2) {
		                System.out.println(position + " position Smallest Element: " + list.get(position - 1));
		            } else {
		                System.out.println("Array size is less than " + position+" or  last available highest digit not considered as smallest");
		            }
		        }else if (largest_or_smallest.equalsIgnoreCase("largest")) {
		            if (position < length2) {
		                System.out.println(position + " position Largest Element: " + list.get(length2 - position));
		            } else {
		                System.out.println("Array size is less than " + position+" or  last available smallest digit not considered as highest");
		            }
		        } else {
		            System.out.println("Invalid input for largest_or_smallest parameter.");
		        }
     }

     
}
