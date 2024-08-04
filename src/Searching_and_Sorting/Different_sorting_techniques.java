package Searching_and_Sorting;

import java.util.Arrays;

public class Different_sorting_techniques {

	public static void main(String[] args) {
        int[]arr= {10,20,50,40,80,90,36,67,98,34,60,70};
        insertionSort(arr);
//        int key=50;
//        System.out.println(key+" Key found at index "+binary_Search(arr, key));	
	}
  static int linear_Search(int[]arr,int key) { 
	  
	  for(int i=0;i<arr.length;i++) { 
		  if(arr[i]==key) { 
			  return i;
		  }
	  }
	  return -1;
  }

  static int linear_Search_2(int[]arr,int target) { 
	  int index=0;
	  for(int search:arr) { 
		  if(search==target) { 
			  return index;
		  }
		  index++;
	  }
	  return -1;
  }

  static int binary_Search(int []arr,int value) { 
	  if(arr==null||arr.length==0) { 
		  return -1;
	  }
	  int startIndex = 0,endIndex=arr.length-1;
	  Arrays.sort(arr);
	  while(startIndex<=endIndex) {
		  int mid = (startIndex+endIndex)/2;
	  if(value==arr[mid]) { 
		  return mid;
	  }else if(value<arr[mid]){ 
		  endIndex=  mid-1;
	  }else { 
		  startIndex=  mid+1;
	    }
	  }
	return -1;
  }

  static void Bubble_Sort(int[]arr) { 
	  int temp;
	 for (int i = 0; i < arr.length; i++) {
		for (int j = 1; j < arr.length; j++) {
			if(arr[j-1]>arr[j]) { 
				 temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int loop:arr) {
		System.out.print(loop+" ");
	}
	 
  }

  static void Bubble_Sort_2(int[]arr) {
  int n = arr.length;
  boolean swapped;
  do {
      swapped = false;
      for (int i = 1; i < n; i++) {
          if (arr[i - 1] > arr[i]) {
              // swap arr[i-1] and arr[i]
              int temp = arr[i - 1];
              arr[i - 1] = arr[i];
              arr[i] = temp;
              swapped = true;
          }
      }
      n--;
  } while (swapped);
  for(int loop:arr) {
		System.out.print(loop+" ");
	}
}
  
	//In selection sort algorithm, we search for the lowest element and arrange
	//it to the proper location. We swap the current element with the next lowest number.
	  
	   static void insertionSort(int[] arr) {
	        int n = arr.length;
	       // int[]arr= {10,20,50,40,80,90,36,67,98,34,60,70};
	        for (int i = 1; i < n; i++) {
	            int key = arr[i];
	            int j = i - 1;
	            
	            // Move elements of arr[0..i-1], that are greater than key,
	            // to one position ahead of their current position
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = key;

	            // Print the array after each pass (optional, for visualization)
	            System.out.println("Array after pass " + i + ":");
	            printArray(arr);
	            System.out.println();
	        }
	    }

	   static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
 
	   static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber;  
	        }  
	    }  


}
  
/* class Person {      //Learn these linear search for object
private int id;
private String name;

public Person(int id, String name) {
    this.id = id;
    this.name = name;
}

public int getId() {
    return id;
}

public String getName() {
    return name;
}

// Override equals method to compare Person objects by id
@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Person person = (Person) obj;
    return id == person.id;
}
}

public class CustomObjectLinearSearch {

public static int linearSearch(Person[] arr, Person target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].equals(target)) {
            return i; // Return index of target if found
        }
    }
    return -1; // Return -1 if target not found
}

public static void main(String[] args) {
    Person[] people = {
            new Person(1, "Alice"),
            new Person(2, "Bob"),
            new Person(3, "Charlie")
    };

    Person target = new Person(2, "Bob"); // Searching for person with id=2

    int index = linearSearch(people, target);
    if (index != -1) {
        System.out.println("Person found at index: " + index);
    } else {
        System.out.println("Person not found");
    }
}
}*/