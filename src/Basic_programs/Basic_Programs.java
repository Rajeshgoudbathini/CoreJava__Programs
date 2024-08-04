package Basic_programs;

import java.util.Random;

import Array_Programs.array_Rotation;

public class Basic_Programs {
	//384 line important
	//Pascal's triangle -  learn these
	//Note - Practice some more number patterns just by refering solved patterns
	
	public static void main(String[] args) {
		

	}
	
	public static void Fibonacci_number(int num) { 
		//Fibonacci Series-- In fibonacci series, next number is the sum of previous two numbers 
		//for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1
		int num1=0,num2=1;
		int range=num;
		System.out.print(num1+" "+num2+" ");
		
		for(int i=1;i<=range;i++) { 
		int num3=num1+num2;
		System.out.print(num3+" ");
		num1=num2;
		num2=num3;
			
		}
	}

//-----------------------------------------------------------------------------------------------------------------
	
	public static void Fibonacci_Series_recursion(int count) { 
	//	 static int n1=0,n2=1,n3=0;       --use these in global during execution
	//System.out.print(n1+" "+n2+" ");    --use these in main method during execution
//		 if(count>0) { 
//			n3= n1+n2;
//			n1=n2;
//			n2=n3;
//			System.out.print(n3+" ");
//			Fibonacci_Series_recursion(count-1);
//		 }
	}
	
//-------------------------------------------------------------------------------------------------------------------
	
	public static void Prime_Number(int num) { 
		 
		int m=num/2,flag=0;
		if(num==0 || num==1) { 
			System.out.println("Not a prime number");
		}else { 
			for(int i=2;i<=m;i++) { 
				if(num%i==0) { 
					System.out.println("Not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("It is a prime number");
		}
	}  
	
//------------------------------------------------------------------------------------------------------------------
	
	public static boolean isPrime(int n) {
		  if (n <= 1) {
		    return false;
		  }
		  for (int i = 2; i < Math.sqrt(n); i++) {
		    if (n % i == 0) {
		      return false;
		    }
		  }
		  return true;
		}
//-----------------------------------------------------------------------------------------------------------------
	
	//A palindrome number is a number that is same after reverse
	
	static void Palindrome_number(int number) { 
		int sum=0,temp=number,remainder;
		while (number>0) { 
			
		 remainder=number%10;
		sum=(sum*10)+remainder;
		number=number/10;
		}
		if(temp==sum) { 
			System.out.println(temp+" -- is a palindrome number");
		}else { 
			System.out.println(temp+" -- is a not palindrome number");
		}
	}
	//----------------------------------------------------------------------------------------------------------
	static void Palindrome_String(String str) {
	
		String temp= str,str1="";
		for(int i=0;i<str.length();i++) { 
			str1=str.charAt(i)+str1;
		}
		if(temp.equals(str1)) { 
			System.out.println(temp+" -- is a palindrome string");
		}else { 
			System.out.println(temp+" -- is a not palindrome string");
		}
	}
	//--------------------------------------------------------------------------------------------------------------
	static void Swap_Two_String(String str1,String str2) { 
		
		str1=str1+str2;
	str2=str1.substring(0, str1.length()-str2.length());
	str1=str1.substring(str2.length());
	System.out.println("After swap str1 = "+str1+" str2 = "+str2);
		
	}
	//---------------------------------------------------------------------------------------------------------------
	public static int largestnumber_of_3numbers() {
		int a=10,b=20,c=30;
		
		int largest= a>b?(a>c?a:c):(b>c?b:c);
		 
		return largest;
	}
	public static int lowestnumber_of_3numbers() {
		int a=10,b=20,c=30;
		
		int lowest= a<b?(a<c?a:c):(b<c?b:c);
		 
		return lowest;
	}
	
	public static String anyNumbersAreEqual() { 
		int a=16,b=15,c=18;
		
		String result=(a==b)?"a="+a+" and b="+b+" are equal":(a==c||b==c)?(a==c?"a ="+a+" and c="+c+" are equal":"b="+b+" and c="+c+" are equal"):"No values are equal";
		return result;
	}
	//------------------------------------------------------------------------------------------------------------------
	
	//Decimal to binary method -1
	
	public static void decima_to_binary(int num) { 
		
		int  i=0;
		int[] decimal=new int[1000];
		
		while (num>0) { 
			decimal[i]=num%2;
			num=num/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) { 
			System.out.print(decimal[j]);
		}
		
	}
	//--------------------------------------------------------------------------------------------------------------
	//Decimal to binary method -2
	public static String decima_to_binary2(int decimal) { 
		int remainder,number=decimal;
		String binarynum="";
		
		while(number>0){ 
			remainder=number%2;
		   binarynum=  Integer.toString(remainder)+binarynum;
		 number=number/2;	
		}
		return binarynum;
	  }
//---------------------------------------------------------------------------------------------------------------	
	//Find Factorial of a Number in Java.
	public static int factorial(int num) { 
		int number =num, factorial=1;
		for (int i = 1; i <=number; i++) {
			factorial=factorial*i;
		}
		return factorial;
	}  
	
	//-----------------------------------------------------------------------------------------------------------------
	
	//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
	//153: 13 + 53 + 33 = 1 + 125+ 27 = 153
	
	static void Armstrong_number(int num) { 
		int sum=0,temp=num,remainder;
		int numberofdigits = String.valueOf(num).length();
	     while(num>0) { 
	    	 
	    	remainder=num%10;
	    	sum+=Math.pow(remainder, numberofdigits);
	    	num=num/10;
	     }
	    if(temp==sum) { 
	    	System.out.println(temp+" is a Amstrong number");
	    }else { 
	    	System.out.println(temp+" is not Amstrong number");
	    }
	}
	//------------------------------------------------------------------------------------------------------------
	static void Armstrong_number2(int num) {  
		//Note these is for onl 3 digit number
		int remainder,temp=num,sum=0;
		
		while(num>0) { 
			remainder=num%10;
			sum=sum+remainder*remainder*remainder;
			num=num/10;
		}
		 if(temp==sum) { 
		    	System.out.println(temp+" is a Amstrong number");
		    }else { 
		    	System.out.println(temp+" is not Amstrong number");
		    }
	}
	//-----------------------------------------------------------------------------------------------------------
	
	//How to generate a random number
	//Using the random() Method
	//Using the Random Class
	//Using the ThreadLocalRandom Class
	//Using the ints() Method (in Java 8)
	
	public static int Random_number(int range) { 
		Random random=new Random();
return (random.nextInt(range));

	}
	public static void Random_number2() {  
		System.out.println(Math.random());
	   }
	public static int Random_number3(int max,int min) {  
		
		double random=(Math.random()*(max-min+1)+min);
		return (int) random;
	}
	//----------------------------------------------------------------------------------------------------------
	
	//Patterns
	
	static void print_rectangle_pattern(int range) { 
		
		for(int i=0;i<range;i++) { 
			for(int j=0;j<range;j++) { 
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void print_increasing_Triangle(int range) { 
		for(int i=0;i<range;i++) { 
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void print_decreasing_Triangle(int range) { 
		for (int i = 0; i <range ; i++) {
			for (int j = i; j < range; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void print_pyramid_updown(int range) { 
		for (int i = 0; i < range; i++) {
			for (int j = i; j < range; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void print_pyramid_downup(int range) { 
		for (int i = 0; i < range; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < range-1; j++) {
				System.out.print("* ");
			}
			for (int j = i; j < range; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void print_diamond_pattern(int range) { 
		for (int i = 0; i < range-1; i++) {
			for (int j = i; j <range; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <i; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 0; i < range; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < range - 1; j++) {
				System.out.print("* ");
			}
			for (int j = i; j < range; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
   static void Right_Pascals_Triangle(int range)	{ 
	for (int i = 0; i < range; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	  }
	for (int i = 0; i < range; i++) {
		for (int j = i+1; j < range; j++) {
			System.out.print("* ");
		}
		System.out.println();
	  }
   }
   static void Left_Pascals_Triangle(int range) { 
	   for (int i = 0; i < range; i++) {
		for (int j = i; j < range; j++) {
			System.out.print("  ");
		}
		for (int j = 0; j <= i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	 }
	   for (int i = 1; i <range; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print("  ");
		}
		for (int j = i; j < range; j++) {
			System.out.print("* ");
		}
		System.out.println();
	 }
   }
   static void  print_SandglassStar_Pattern(int num) { 
	       for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < num-1; j++) {
				System.out.print("* ");
			}
			for (int j = i; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	       for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
   }

//NOTE:- Practice Hollow problems you must understand clearly hollow patterns
   
   //-------------------------------------------------------------------------------------------------------------------------
   //Number patterns
   
        static void continous_number(int num) { 
        	int k=0;
        	for (int i = 0; i < num; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(k++ +" ");
				}
				System.out.println();
			}
        }
        static void pattern_each_row_adds_new_number(int num) { 
        	for (int i = 0; i < num; i++) {
				for (int j = 0,k=1; j <= i; j++) {
					System.out.print(k+++" ");
				}
				System.out.println();
			}
        }
        static void random_pattern(int num) { 
        	for (int i = 0; i < num; i++) {
				for (int j = i; j < num; j++) {
					System.out.print("  ");
				}
				for (int j = 0,k=1; j <= i; j++) {
					System.out.print(k+++" ");
				}
				for (int j = 0,k=1; j < i; j++) {
					System.out.print(k+++" ");
				}
				
				System.out.println();
			}
        }
}
