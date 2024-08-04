package Number_Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class All_Number_Programs {
//Learn Numbers to words important
	public static void main(String[] args) {
		int num=113;
		if(is_Prime(num)) { 
			System.out.println(num+" is a Emrip number");
		}else { 
			System.out.println(num+" is not a Emrip number");
		}
	}
	static void Reverse_a_Number(int num) { 
//		for ( int numref = num; numref >0; numref/=10) {
//			int remainder=numref%10;
//			System.out.print(remainder);
//		}
		
		while(num>0) {
		int remainder=num%10;
		System.out.print(remainder);
		num/=10;
	   }
	}
	static void Numbers_to_words() { 
		System.out.println("Not done yet will do");
		
	}
	static void Automorphic_Number(long num) {
	    long temp = num;
	    long square = num * num;
	    boolean found = false;

	    while (num > 0) {
	        if (num % 10 == square % 10) {
	            found= true;
	        } else {
	            found = false; // Reset found if digits don't match
	           
	        }
	        num /= 10;
	        square /= 10;
	    }
	    
	    	if(found==true) { 
				System.out.println(""+temp+" is a automorphic number");
			}else { 
				System.out.println(""+temp+" is not a automorphic number");
			}
	   
	}
	static void Peterson_number(int num){ 
		/*A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.
	 145 = !1 + !4 + !5
         =1+4*3*2*1+5*4*3*2*1
         =1+24+120
         145=145*/
		int digit=0,sum=1,temp=num;
		while(num>0) { 
		int rem=num%10;
		int factorial=1;
			for(int j=1;j<=rem;j++) { 
				factorial*=j;
			}
			digit+=factorial;
			num/=10;
		}
		if(digit==temp) { 
			System.out.println(+digit+" It is a peterson number");
		}else { 
			System.out.println(+digit+" It is not peterson number\"");
		}
	}
	static void Tech_number(int num) { 
		int digits=num,numberOfDigits=0,firsthalf,secondhalf,square  ;
		while(num>0) { 
			numberOfDigits++;
		num/=10;
		}
		if(numberOfDigits%2==0) { 
			firsthalf = (int) (digits /  Math.pow(10, numberOfDigits / 2));
			secondhalf = (int) (digits %  Math.pow(10, numberOfDigits / 2));
			int sum=firsthalf+secondhalf;
			 square=(int)Math.pow(sum,2);
			if(square==digits) { 
				System.out.println(+digits+" It is a Tech number");
		}else { 
			System.out.println(+digits+" It is not a Tech number\"");
		}	
		  }else { 
				System.out.println(+digits+" It is not a Tech number\"");
			}	
	}   	
	static boolean Keith_number(int num) { 
		int temp=num,numberofDigits=0;;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		while(num>0) { 
			//adding the number to arraylist by fetching last number
			arr.add(num%10);
			num/=10;
			numberofDigits++;
		}
		Collections.reverse(arr);
		
		int nextTerm=0,i=numberofDigits;
		while(nextTerm<temp) { 
			nextTerm=0;
			for(int j=1;j<=numberofDigits;j++) { 
				nextTerm=nextTerm+arr.get(i-j);
			}
			arr.add(nextTerm);
			i++;
		}
		return (temp==nextTerm);
	}

    static void range_Keith_Number(int starting_Number,int ending_Number ) { 
	
	
	for (int i = starting_Number; i <= ending_Number; i++) {
		if(Keith_number(i)) { 
			System.out.print(+i+" ");
		}
	 }
   }

    static void neon_Number(int num) { 
	int square=0,rem,sum = 0;
    	square=(int)Math.pow(num,2);
    	while(square>0) { 
    		 rem=square%10;
    		 sum+=rem;
    		 square/=10;
    	}
    	if(sum==num) { 
    		System.out.println(+sum+" is a neon number");
    	}else { 
    		System.out.println(+sum+" is not a neon number");
    	}
    }

    static boolean spy_Number(int num) {
    	String str=String.valueOf(num);
    	int add=0,multiply=1;
    	for (int i = 0; i < str.length(); i++) {
    	
    	 int  intdigit=Character.getNumericValue(str.charAt(i));
           add += intdigit;      // Calculate sum of digits
           multiply *= intdigit; // Calculate product of digits
		}
    	return multiply==add;

     }

    static void range_Spynumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (spy_Number(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static void atmProgram() {
        int balance = 40000, withdraw, deposit;
        boolean continueTransaction = true;
        Scanner sc = new Scanner(System.in);
        while (continueTransaction) {
        System.out.println("Automated Teller Machine");
        System.out.println("Choose 1 for Withdraw");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for EXIT");
        System.out.print("Choose the operation you want to perform:");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the amount to withdraw: ");
                withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println(withdraw + " Please collect your money");
                } else {
                    System.out.println("Insufficient balance. Available balance : " + balance);
                }
                break;
                
            case 2:
                System.out.print("Enter the amount to deposit: ");
                deposit = sc.nextInt();
                balance += deposit;
                System.out.println("Successfully deposited. Total balance is : " + balance);
                break;
                
            case 3:
                System.out.println("Balance: " + balance);
                break;
                
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                continueTransaction=false;
                System.exit(choice); // Exit the method since we are within a method, not main
              
            default:
                System.out.println("Invalid choice. Please choose a valid operation.");
                continue;
        }
        if (continueTransaction) {
            System.out.print("Do you want to continue (1 for Yes, 0 for No)? ");
            int continueChoice = sc.nextInt();
            if (continueChoice != 1) {
            	System.out.println("Transaction ended");
                continueTransaction = false;
            }
        }
        }
        sc.close();
    }

    static boolean is_Prime(int num) { 
	    //A number is called an emirp number if we get another prime number on reversing the number itself.
	   if(num<=1) { 
		   return false;
	   }else { 
		   for (int i = 2; i < num; i++) {
			  if(num%i==0) { 
				  return false;
			  }
		}
		   return true;
	   }
   } 

    static boolean is_Emrip(int num) { 
	 
	  if(is_Prime(num)==false) { 
		  return false;
	  }else { 
		  int reverse = 0,orginalnumber=num;
		  while(orginalnumber!=0) { 
			 int  rem=orginalnumber%10;
			 reverse=reverse*10+rem; 
			 orginalnumber/=10;
		  }
		return is_Prime(reverse);
	  }
  }

    static double square_Root(int num) { 
	  //Note: You can find simply by using Math.squr(num); or use the below formula
	  //formula  sqrtn+1=(sqrtn+(num/sqrtn))/2.0
	  
	  double t;
      double sqrtroot = num / 2;

      do {
          t = sqrtroot;
          sqrtroot = (t + (num / t)) / 2;
      } while ((t - sqrtroot) != 0);

      return sqrtroot;
  }


  
}
