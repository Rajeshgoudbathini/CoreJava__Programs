package Array_Programs;

public class even_odd_Position {

	public static void main(String[] args) {
		int []arr= {0,1,2,3,4,5,6,7,8,9};

		even_od_Position_method_2(arr, "even");

	}
	static void even_Position(int[] arr) { 
		int length=arr.length;
		for(int i=1;i<=length-1;i=i+2) { 
			System.out.println(i+" ");
		}	
	} 
	static void odd_Position(int[] arr) { 
		int length=arr.length;
		for(int i=0;i<length-1;i=i+2) { 
			System.out.println(i+" ");
		}	
	} 
	
    static void even_od_Position_method_2(int [] arr,String str) { 
	
    	switch (str.toLowerCase()) {
        case "odd":
           for(int i=0;i<=arr.length-1;i=i+2) { 
        	   System.out.print(i+" ");
           }
            break;
        case "even":
        	  for(int i=1;i<=arr.length-1;i=i+2) { 
           	   System.out.print(i+" ");
              }
        	break;
        // More cases can be added as needed
        default:
            System.out.println("-- Enter valid string either even or odd(Accepts only lowercase) --");
            
          } 
   	}
}
