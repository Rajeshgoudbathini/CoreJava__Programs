package Basic_programs;

public class Begineer_level {

	public static void main(String[] args) {
		int i=5;
		
		System.out.println(factorial(i));
		
	}
	
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
	
	//Find Factorial of a Number in Java.
	public static int factorial(int num) { 
		int number =num, factorial=1;
		for (int i = 1; i <=number; i++) {
			factorial=factorial*i;
		}
		return factorial;
	}  
	

}
