package Methods_of_ObjectClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class getClass_Example {

	public void log(Object obj) { 
		
		Class<? extends Object> clazz = obj.getClass();
		System.out.println(clazz.getName());
	}

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		getClass_Example logger=new getClass_Example();
		int message=123;
		logger.log(message);// Logs: Logging: java.lang.String
		
//Method 2 for Runtime class for a variable
//		String text="Degug strng";
//		System.out.println("Runtime class of text: " +text.getClass().getName());
		
		/*
		  //Note i don't now these should be walkaround 
		    Scanner scanner = new Scanner(System.in);
		 
	        System.out.print("Enter class name: ");
	        String className = scanner.next();
	        
	        // Dynamically create an instance of the specified class
	        Class<?> clazz = Class.forName(className);
	        Constructor<?> constructor = clazz.getDeclaredConstructor();
	        constructor.setAccessible(true); // To access non-public constructors
	        Object instance = constructor.newInstance();
	        
	        // Check the runtime class of dynamically created instance
	        System.out.println("Runtime class of dynamically created instance: " + instance.getClass().getName());
	        
	        scanner.close();
*/	        
	}

}
