package Array_Programs;

public class Copy_elements {
	public static void main(String[] args) { 
		int num[]= {1,2,3,4,5,6};
		Method_2(num);
	}

	static void copy_all_elements_of_one_array_into_another_array(int[] arr) {
       // int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length];
        // Copy elements from arr to arr2
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
     // Print elements of arr
        System.out.print("Orginal Array: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Print elements of arr1
        System.out.print("Copied Array: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
       
    }

	static void Method_2(int []arr) { 

		int[]arr1=new int[arr.length];	
		System.arraycopy(arr, 0, arr1, 0, arr.length);
		 // Print elements of arr
        System.out.print("Orginal Array: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Print elements of arr1
        System.out.print("Copied Array: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }	
      
        /* Optional loop
        for (int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i] + " ");     //these loop also can be use to print elements in array
        }*/
	}
}
