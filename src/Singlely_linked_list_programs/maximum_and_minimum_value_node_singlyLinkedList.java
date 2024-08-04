package Singlely_linked_list_programs;

//public class LinkedListExamples  
//{  
// Node head;  // head of list  
// static class Node {  
// int data;  
//         Node next;  
// Node(int d)  { data = d;  next=null; }  
//     }  
//     /* This function prints contents of the linked list starting from head */  
// public void display()  
//     {  
//         Node n = head;  
// while (n != null)  
//         {  
// System.out.print(n.data+" \n");  
//             n = n.next;  
//         }  
//     }  
//     /* method to create a simple linked list with 3 nodes*/  
// public static void main(String[] args)  
//     {  
//         /* Start with the empty list. */  
// LinkedListExamples list = new LinkedListExamples();  
//  
// list.head   = new Node(100);  
//         Node second   = new Node(200);  
//         Node third    = new Node(300);  
//  
// list.head.next = second; // Link first node with the second node  
// second.next = third; // Link first node with the second node  
// list.display();  
//     }  
//}  
//----------------------------------------------
//public class ReverseLinkedList {
//
//	private Node head;
//	public ReverseLinkedList(){ 
//		this.head=null;
//	}
//	
//	void insertBegining(int data) { 
//		Node node=new Node(data);
//		node.next=head;
//		head=node;
//	}
//	void display() { 
//		Node current=head;
//		while(current!=null) { 
//			System.out.println(current.data+" ");
//			current=current.next;
//		}
//	}
//	public static void main(String[] args) {
//
//		ReverseLinkedList list=new ReverseLinkedList();
//		list.insertBegining(100);
//		list.insertBegining(200);
//		list.insertBegining(300);
//		list.insertBegining(400);
//		list.insertBegining(500);
//		list.display();
//
//	}
//
//}
//-----------------------------------------------------------------------------
//import java.util.ArrayList;
//import java.util.List;
//
//public class SinglyLinkedL {
//    
//    private static class Node {
//        int data;
//        Node next;
//        
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//    
//    private Node head;
//    
//    public SinglyLinkedL() {
//        this.head = null;
//    }
//    
//    public void insertAtBeginning(int data) {
//        Node newNode = new Node(data);  // Create a new node
//        newNode.next = head;            // Set the new node's next to current head
//        head = newNode;                 // Update the head to the new node
//    }
//    
//    // Method to retrieve elements in the order they were inserted
//    public List<Integer> retrieveInOrder() {
//        List<Integer> elements = new ArrayList<>();
//        Node current = head;
//        while (current != null) {
//            elements.add(current.data);
//            current = current.next;
//        }
//        return elements;
//    }
//    
//    public static void main(String[] args) {
//        SinglyLinkedL myList = new SinglyLinkedL();
//        
//        // Insert elements into the linked list
//        myList.insertAtBeginning(5);
//        myList.insertAtBeginning(10);
//        myList.insertAtBeginning(15);
//        
//        // Retrieve and display elements in the order they were inserted
//        List<Integer> insertedOrder = myList.retrieveInOrder();
//        System.out.println("Elements in the order they were inserted:");
//        for (int element : insertedOrder) {
//            System.out.print(element + " ");
//        }
//        System.out.println();  // Print new line after printing all elements
//    }
//}
//------------------------------------------------------------

//import java.util.Stack;
//
//public class SinglyLinkedL {
//    
//    private static class Node {
//        int data;
//        Node next;
//        
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//    
//    private Node head;
//    
//    public SinglyLinkedL() {
//        this.head = null;
//    }
//    
//    public void insertAtBeginning(int data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }
//    
//    public void displayInInsertionOrder() {
//        Node current = head;
//        Stack<Integer> stack = new Stack<>();
//        
//        // Traverse the linked list and push elements onto the stack
//        while (current != null) {
//            stack.push(current.data);
//            current = current.next;
//        }
//        
//        // Pop elements from the stack to print them in reverse insertion order
//        System.out.print("Insertion Order: ");
//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop() + " ");
//        }
//        System.out.println();
//    }
//    
//    public static void main(String[] args) {
//        SinglyLinkedL myList = new SinglyLinkedL();
//        // Insert elements into the linked list
//        myList.insertAtBeginning(5);
//        myList.insertAtBeginning(10);
//        myList.insertAtBeginning(15);
//        
//        // Display elements in the order they were inserted
//        myList.displayInInsertionOrder();  // Output: Insertion Order: 5 10 15
//    }
//}
//-------------------------------------------------------------------------------------
//public class SinglyLinkedL{ 
//	
//	public class Node{ 
//		int data;
//		Node next;
//		Node(int data){ 
//			this.data=data;
//			this.next=null;
//		}
//	}
//	public	Node head=null ;		
//	public	Node tail=null ;
//	
//	public void add_Data(int data) { 
//		Node addnode=new Node(data);
//		if(head==null) { 
//			head=addnode;
//			tail=addnode;
//		}else { 
//			tail.next=addnode;
//			tail=addnode;
//		}
//	}
//	public void display() { 
//		
//		while(head!=null) { 
//			System.out.print(head.data+" ");
//			head=head.next;
//		}
//		System.out.println();
//	  }
//	
//	public static void main(String[] args) { 
//		SinglyLinkedL list=new SinglyLinkedL();
//		list.add_Data(10);
//		list.add_Data(20);
//		list.add_Data(30);
//		list.add_Data(40);
//		list.add_Data(50);
//		list.display();
//	}
//}
//----------------------------------------------------------------------------------------------
//public class countNodes{ 
//	static int count=0;
//	public class Node{ 
//		
//		int data;
//		Node next;
//		Node(int data){ 
//			this.data=data;
//			this.next=null;
//		}
//	}
//	
//	Node head=null;
//	Node tail=null;
//	
//	public void addNode(int data) { 
//		Node node=new Node(data);
//		if(head==null) { 
//			head=node;			
//			tail=node;
//			
//		}else { 
//			tail.next=node;			
//			tail=node;
//		}
//		count++;
//	}
//	public void display() { 
//		
//		while(head!=null) { 
//			System.out.print(head.data+" ");
//			head =head.next;
//		}
//		System.out.println();
//	}
//	public static void main(String[]args) { 
//		countNodes list=new countNodes();
//		list.addNode(10);
//		list.addNode(20);
//		list.addNode(30);
//		list.addNode(40);
//		list.addNode(50);
//		System.out.print("Nodes in the singly Linked List : ");
//		list.display();
//		System.out.println("Count of the nodes : "+count);
//	}
//}
//---------------------------------------------------------------------
//public class  delete_node_from_beginning{ 
//	
//	public class Node{ 
//		int data;
//		Node next;
//		Node(int data){ 
//			this.data=data;
//			this.next=null;
//		}
//	}
//	Node head=null;
//	Node tail=null;
//	public void addNode(int data) { 
//		Node newNode=new Node(data);
//		if(head==null) { 
//			head=newNode;
//			tail=newNode;
//		}else { 
//			tail.next=newNode;
//			tail=newNode;
//		}
//	}
//	
//	public void deleteBegining() { 
//		
//		
//		if(head==null) { 
//			System.out.println("List is Empty");
//			return;
//		}else { 
//			if(head!=tail) { 
//				head=head.next;
//			}else { 
//				head=tail=null;
//			}
//		}
//		
//	}
//	public void display() { 
//		Node current=head;
//		if(current==null) { 
//			System.out.println("List is Empty");
//			return;
//		}
//		while(current!=null) { 
//			System.out.print(current.data+" ");
//			current=current.next;
//		}
//		System.out.println();
//	}
//	public static void main(String[]args) { 
//		delete_node_from_beginning list=new delete_node_from_beginning();
//		list.addNode(10);
//		list.addNode(20);
//		list.addNode(30);
//		list.addNode(40);
//		list.addNode(50);
//		System.out.print("Orginal list : ");
//		list.display();
//		while(list.head!=null) { 
//			list.deleteBegining();
//			System.out.print("Updated list : ");
//			list.display();
//		}
//	}
//}

//public class delete_node_by_user_choice { 
//	public class Node{ 
//		
//		int data;
//		Node next;
//		Node(int data){ 
//			this.data=data;
//			this.next=null;
//		}
//	}
//	Node head=null;
//	Node tail=null;
//	public void addNode(int data) { 
//		Node node=new Node(data);
//		
//		if(head==null) { 
//			head=node;
//			tail=node;
//		}else { 
//			tail.next=node;
//			tail=node;
//		}
//	}
//	public void deleteNode(int key) { 
//		Node current=head;
//		Node previous=null;
//		while(current!=null&&current.data!=key) { 
//			previous=current;
//			current=current.next;
//		}
//		if(current==null) { 
//			System.out.println("Node with key "+key+ " is not found");
//			return;
//		}
//		if(previous!=null) { 
//			previous.next=current.next;
//			
//		}else { 
//			head=current.next;   //If deleting the head node
//		}
//		System.out.println("Node with key "+key+" is deleted");
//	}
//	
//	public void display() { 
//		Node current=head;
//		if(current==null) { 
//			System.out.println("List is empty");
//			return;
//		}while(current!=null) { 
//			System.out.print(current.data+" ");
//			current=current.next;
//		}
//		System.out.println();
//	}
//	public static void main(String[]args) { 
//		delete_node_by_user_choice list=new delete_node_by_user_choice();
//		list.addNode(0);
//		list.addNode(10);
//		list.addNode(20);
//		list.addNode(30);
//		list.addNode(40);
//		list.addNode(50);
//		System.out.print("Orginal list : ");
//		list.display();
//		list.deleteNode(0);
//		list.display();
//	}
//}

//public class delete_node_from_end_in_singleyLinkedList { 
//	
//	public  class Nodee{ 
//		int data;
//		Nodee next;
//		Nodee(int data){ 
//			this.data=data;
//			this.next=null;
//		}
//	}
//	
//	private Node head;
//	
//	public void addNode(int data) { 
//		Node addingNode=new Node(data);
//		
//		if(head==null) { 
//			head=addingNode;
//		}else { 
//			Node current=head;
//			while(current.next!=null) { 
//				
//				current=current.next;
//			}
//			current.next=addingNode;
//		}
//	}
//	public void display() { 
//		Node current=head;
//		if(current==null) { 
//			System.out.println("List is empty");
//			return;
//		}
//		while(current!=null) { 
//			System.out.print(current.data+" ");
//			current=current.next;
//		}
//		System.out.println();
//	}
//
//	public void delete_from_end() {
//		while(head!=null) { 
//			Node current=head;
//			Node previous=null;
//			while(current.next!=null) { 
//				previous=current;
//				current=current.next;
//			}
//			if(previous==null) { 
//				head=null;
//			}else { 
//				previous.next=null;
//			}
//			current=null;
//			display();
//		}
//		
//	}
//	public static void main(String[]args) { 
//		delete_node_from_end_in_singleyLinkedList list=new delete_node_from_end_in_singleyLinkedList();
//		list.addNode(0);
//		list.addNode(10);
//		list.addNode(20);
//		list.addNode(30);
//		list.addNode(40);
//		list.addNode(50);
//		System.out.print("Orginal list : ");
//		list.display();
//		list.delete_from_end();
//	}
//}

public class maximum_and_minimum_value_node_singlyLinkedList{ 
	
	public class Node{ 
		int data;
		Node next;
		Node(int data){ 
			this.data=data;
			this.next=null;
		}
	}

	Node head=null;
	Node tail=null;
   public void addNode(int data) { 
	   Node newNode=new Node(data);
	   if(head==null) { 
		   head=newNode;
		   tail=newNode;
	   }else { 
			   tail.next=newNode;
			   tail=newNode;
		   }   
   }

   public void display() { 
	  Node current=head;
	  if(current==null) { 
		  System.out.println("List is empty");
	  }else { 
		  while(current!=null) { 
			  System.out.print(current.data+" ");
			  current= current.next;
		  }
		  
	  }
	  
  }

    public void maxValue() { 
        if(head==null) { 
    		throw new RuntimeException(" Liist is empty");
    	}
    	Node current=head.next;
    	int maxKey=head.data;
    	while(current!=null) {   
    		if(current.data>maxKey) { 
    			maxKey=current.data;
    		}
    		current=current.next;
    	}
    	System.out.println("Maximum value in the list : "+maxKey);
    }
    public void minValue() { 
           if(head==null) { 
    		throw new RuntimeException(" Liist is empty");
    	}
    	Node current=head.next;
    	int minKey=head.data;
    	while(current!=null) {   
    		if(current.data<minKey) { 
    			minKey=current.data;
    		}
    		current=current.next;
    	}
    	System.out.println("\nMinimum value in the list : "+minKey);

    }

	public static void main(String[]args) { 
		maximum_and_minimum_value_node_singlyLinkedList list=new maximum_and_minimum_value_node_singlyLinkedList();
		list.addNode(0);
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
		System.out.print("Orginal list : ");
		list.display();
		list.minValue();
		list.maxValue();
	}

}


