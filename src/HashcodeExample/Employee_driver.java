package HashcodeExample;

public class Employee_driver {

	public static void main(String[] args) {
		   Employee emp1 = new Employee(1234, "John");
		    Employee emp2 = new Employee(1234, "Jane");
		    Employee emp3 = new Employee(5678, "Mike");

		    // Check equality based on regno
		    if (emp1.equals(emp2)) {
		      System.out.println("emp1 and emp2 have the same regno");
		    } else {
		      System.out.println("emp1 and emp2 have different regno");
		    }

		    if (emp1.equals(emp3)) {
		      System.out.println("emp1 and emp3 have the same regno"); // This won't be printed
		    } else {
		      System.out.println("emp1 and emp3 have different regno");
		    }
		  }
	}

