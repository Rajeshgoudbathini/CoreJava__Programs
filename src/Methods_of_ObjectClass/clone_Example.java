package Methods_of_ObjectClass;
//Note consider clone_Example as Prototype
/*Real-Time Scenario:
Prototype Design Pattern: In scenarios where you want to create new objects by copying existing objects, without knowing their concrete types.*/
public class clone_Example implements Cloneable {
    private String type;

    public clone_Example(String type) {
        this.type = type;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
    	 clone_Example prototype = new clone_Example("Type1");
        try {
        	clone_Example clonedPrototype = (clone_Example) prototype.clone();
            System.out.println("Cloned Prototype: " + clonedPrototype.type);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

