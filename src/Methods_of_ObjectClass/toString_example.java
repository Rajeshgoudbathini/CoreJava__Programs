package Methods_of_ObjectClass;
//Note consider toString_example as Product

/*Real-Time Scenario:
Logging and Debugging: In applications where you want to log or display information about objects in a human-readable format.*/

public class toString_example {
    private String name;
    private double price;

    toString_example(String name,double price){ 
    	this.name=name;
    	this.price=price;
    }
    
    //getters, setters

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }

    public static void main(String[] args) {
    	toString_example product = new toString_example("Laptop", 1200.0);
        System.out.println("Product details: " + product); // Prints: Product details: Product{name='Laptop', price=1200.0}
    }
}

