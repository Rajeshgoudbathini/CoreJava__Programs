//package Methods_of_ObjectClass;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class hashCode_Example {
//
//	private String name;
//	private int id;
//	 // Constructor, getters, setters
//	hashCode_Example(String name,int id){ 
//		this.name=name;
//		this.id=id;
//	}
//	@Override
//	public int hashCode() { 
//		return Objects.hash(name,id);
//	}
//	public static void main(String[] args) {
//		
//		hashCode_Example obj=new hashCode_Example("Miller", 422);
//		
//		Map<hashCode_Example, String> map = new HashMap<hashCode_Example, String>();
//		map.put(obj, "Manager");
//		System.out.println(map.get(new hashCode_Example("Miller", 422)));
//	}
//
//}

package Methods_of_ObjectClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class hashCode_Example {

    private String name;
    private int id;

    // Constructor
    hashCode_Example(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        // 1. Check if the references are the same object
        if (this == obj)
            return true; // Exit the method immediately and return true

        // 2. Check for null and different class types
        if (obj == null || getClass() != obj.getClass())
            return false; // Exit the method immediately and return false

        // 3. Cast obj to hashCode_Example and compare id and name fields
        hashCode_Example other = (hashCode_Example) obj;
        return id == other.id && Objects.equals(name, other.name); // Exit the method and return result
    }


    public static void main(String[] args) {
        // Create an instance of hashCode_Example
        hashCode_Example obj = new hashCode_Example("Miller", 422);

        // Create a HashMap with hashCode_Example as keys
        Map<hashCode_Example, String> map = new HashMap<>();
        map.put(obj, "Manager");

        // Retrieve value using a different instance with same attributes
        System.out.println(map.get(new hashCode_Example("Miller", 422))); // Should print "Manager"
    }
}
