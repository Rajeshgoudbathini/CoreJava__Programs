package Array_Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Frequency_of_numbers {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,1,2,3,6,7,8,9,6,7,8};		
		find_the_frequency_of_each_element_in_the_array_2(arr);
	}
	
	static void find_the_frequency_of_each_element_in_the_array(int[] arr) { 
		
		System.out.println("Note : These method is most efficient code :");
		
		Map<Integer,Integer> frequency =new HashMap<>();
		
		for(int arr1:arr) { 
			if(frequency.containsKey(arr1)) { 
				frequency.put(arr1, frequency.get(arr1)+1);
			}else { 
				frequency.put(arr1, 1);
			}
		}
		System.out.println("Elements:Frequency");
		 for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
	            System.out.println("   "+entry.getKey() + "    :   " + entry.getValue());
	        }
		
		
	}


    static void find_the_frequency_of_each_element_in_the_array_1(int[] arr) { 
	
	System.out.println("Note : These method is most efficient code :");
		
		int currentelement=arr[0],count=1;
		Arrays.sort(arr);
		System.out.println("Element : Frequency");
		
		for(int i=1;i<arr.length;i++) { 
			if(currentelement==arr[i]) { 
				count++;
			}else { 
				System.out.println("   "+currentelement +"     "+ "   "+count);
				currentelement=arr[i];
				count=1;
			}
			
		}
		
		// Print the last element and its frequency
        System.out.println("   " + currentelement + "     " + "   " + count);
	}

   	
	static void find_the_frequency_of_each_element_in_the_array_2(int[] arr) {
			    System.out.println("Note: This method is less efficient code compared to other two mwthods above");

			    int[] uniqueElement = new int[arr.length];
			    int[] frequencyElement = new int[arr.length];
			    int unit_Index=-1;
			    
			    for(int i=0;i<arr.length;i++) { 
			    	boolean found=false;
			    	for(int j=0;j<=unit_Index;j++) { 
			    		if(arr[i]==uniqueElement[j]) {
			    		frequencyElement[j]++;
			    		found=true;
			    		break;
			    	}
			    	}
			    	if(!found) { 
			    		unit_Index++;
			    		uniqueElement[unit_Index] = arr[i];
			    		frequencyElement[unit_Index]=1;
			    	}
			    }
			    System.out.println("Elements:Frequency");
			    for(int i=0;i<=unit_Index;i++) { 
			    	System.out.println("   "+uniqueElement[i] +"   "+frequencyElement[i]);
			    }
			}	
}
