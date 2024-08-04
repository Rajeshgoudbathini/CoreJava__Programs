package Array_Programs;

import java.util.HashSet;
import java.util.Set;

public class duplicate_Elements {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,1,2,3,7,8,9,1,2,4,6};

		System.out.println(find_the_duplicate_elements_in_array(arr));
		
	}
	
	static String find_the_duplicate_elements_in_array(int[] arr) {
	    int length = arr.length;

	    HashSet<Integer> hashset=new HashSet<Integer>();
	    for (int i = 0; i < length - 1; i++) {
	        int k = -1; // Initialize k to a value that does not conflict with array elements

	        for (int j = i + 1; j < length; j++) {
	            if (arr[i] == arr[j]) {
	            	hashset.add(arr[i]); // Store the duplicate element
	            }
	        }
	    }
	    //Even if you use println statement in caller method the output will be on same line because hashset internally
	    //uses 'toString' method and print like['and'] to overcome these and print without [] use below code
	    StringBuilder sb=new StringBuilder();
	    for(Integer num:hashset) { 
	    	sb.append(num).append(' ');
	    }
	   return sb.toString().trim();
	    
	   //Alternate to print duplicate like to replace Stringbuilder
         /*for(int dup:hashset) { 
	         System.out.print(dup+" ");
          }*/
	}
	
	static void find_the_duplicate_elements_in_array_2(int arr) { 
		
		Set<Integer> seen=new HashSet<Integer>();
		Set<Integer> duplicate=new HashSet<Integer>();
		
		if((!seen.add(arr))) { 
			duplicate.add(arr);
		}
	}
}
