//package Methods_of_ObjectClass;
//
//import java.util.Objects;
//
////Note consider equals_method_Example as User
///* Real-Time Scenario:
//Object Comparison: In applications where you need to check if two objects are equal based on their attributes (e.g., username and password in authentication systems).
// **/
//public class equals_method_Example {
//    private String username;
//    private String password;
//
//    equals_method_Example(String username,String password){ 
//    	this.username=username;
//    	this.password=password;
//    }
//    
//    
//    //getters, setters
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null || getClass() != obj.getClass())
//            return false;
//        equals_method_Example other = (equals_method_Example) obj;
//        return Objects.equals(username, other.username) &&
//               Objects.equals(password, other.password);
//    }
//
//    public static void main(String[] args) {
//    	equals_method_Example user1 = new equals_method_Example("alice", "password");
//    	equals_method_Example user2 = new equals_method_Example("alice", "password");
//
//        System.out.println("User1 equals User2: " + user1.equals(user2)); // Prints: true
//    }
//}

