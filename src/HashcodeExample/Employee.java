package HashcodeExample;

public class Employee {
	private int regno;
	  private String name;

	  
	// Constructor to initialize regno and name
	  public Employee(int regno, String name) {
	    this.regno = regno;
	    this.name = name;
	  }
	  
	  // Getters and setters for regno and name (omitted for brevity)

	  @Override
	  public boolean equals(Object obj) {
	    if (obj == null) return false;
	    if (obj == this) return true;
	    if (!(obj instanceof Employee)) return false; // Check if obj is an Employee object

	    Employee other = (Employee) obj; // Cast obj to Employee

	    // Only compare regno for equality
	    return this.regno == other.regno;
	  }
}
