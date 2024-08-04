package String_Programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class General_string_programs {

	public static void main(String[] args) throws IOException {
		String str = "This is a string with multiple words.";		
		Mostrepeated_word_in_a_file_2("src\\String_Programs\\datatxt");
		
		
	}
	
	static void count_the_total_number_of_characters_in_a_string(String str) { 
		
		int stringlength = str.length(),count=0;
		for(int i=0;i<stringlength;i++) { 
			if(str.charAt(i)!=' ') { 
				count++;
			}	
		}
		System.out.println(count);
		}

    static int count_the_total_number_of_characters_in_a_string2(String str) { 
		
	   return str.replaceAll(" ", "").length();
    }

    static int count_the_total_number_of_characters_in_a_string3(String str) {
    	int count=0;
    	for(char Char_iterator:str.toCharArray()) { 
    		if(Char_iterator==' ') { 
    			continue;
    		}
    		count++;
    	}
		return count; 
    	
    }

    static  int Count_the_Punctuations(String str) {
    	//If the character (ch) is found in the punctuation string, indexOf returns the position (index)
    	//of that character within the string. For example, if ch is '.' (period) and it's the second character
    	//in punctuation, indexOf would return 1 (since indexing starts from 0).
    //	Crucially, if the character (ch) is not found in punctuation, indexOf returns a special value: -1.
    	//This -1 signifies that the character was not present in the string you searched.
    	System.out.println("These code must work but not working need to go through find a solution");
        String punctuation = "!.'-\"?;"; // Predefined punctuation string
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (punctuation.indexOf(ch) != -1) { // Check if in punctuation string
                count++;
            }
        }
        return count;
    }
   
    static int Count_the_Punctuations2(String str){ 
	   System.out.println("Dont know wy must check the java environment");
	   String punctuation = "!.'-\"?;"; // Predefined punctuation string
       int count = 0;
       for(char ch:str.toCharArray()) { 
    	   
    	   switch(ch) {
    	   case '!':
           case '.':
           case '\'':
           case '-':
           case '?':
           case ';':
               count++;
    		   default:
    			break; 
    	       
    	       }
       }
       return count;
      
    }
        
    static void vowels_and_consonants_in_a_string(String str) { 
    	
    	int consonants=0;
    	int vowels=0;
    	
    	char[] ch = str.toCharArray();
    	for(char loop:ch) { 
    		if(loop=='a'||loop=='e'||loop=='i'||loop=='o'||loop=='u') { 
    			vowels++;
    		}else { 
    			consonants++;
    		}
    	}
    	System.out.println("vowels :"+vowels);
    	System.out.print("consonants :"+consonants);
    }
    
    static boolean is_two_strings_are_the_anagram(String str1,String str2) { 
    	
    	    String s1=  str1.replace("//s", "");
    	    String s2=  str2.replace("//s", "");
    	    
    	  char[] char1 = s1.toCharArray();
    	  char[] char2 = s2.toCharArray();
    	  
    	  Arrays.sort(char1);
    	  Arrays.sort(char2);
    	  
    	  return Arrays.equals(char1, char2);
    }
      
    static boolean is_two_strings_are_the_anagram2(String str1,String str2){ 
    	
    	String char1 = str1.replace("\\s", "");
    	String char2 = str2.replace("\\s", "");
    	
    	char[] charArray = char1.toCharArray();
    	char[] charArray2 = char2.toCharArray();
    	
    	int[] charCount=new int[256];
    	
    	for(char arr:charArray) { 
    		
    		charCount[arr]++;
    	}
         for(char arr1:charArray2) { 
    		
    		charCount[arr1]--;
    	}	
         
         for (int i : charCount) {
			if(i!=0) { 
				return false;
			}
		}
		return true;
    }
        
    static void divide_a_string_in_N_equal_parts(String str,int parts){ 
    	
    	int length = str.length();
    	
    	if(length%parts!=0) { 
    		throw new IllegalArgumentException(" : Cannot divide the string with input parts");
    	}
    	
    	int count = length/parts;
    	for (int i = 0; i <parts ; i++) {
			String equalParts = str.substring(i*count,(i+1)*count);
			System.out.println("Parts "+(i+1)+":"+equalParts);
			/*//or
			int startingindex = i*count;
			int endindex = (i+1)*count;
			
			String equalpart = str.substring(startingindex, endindex);
			System.out.println("Part "+(i+1)+" : "+equalpart);
			*/
		}
    	
    } 
    
    static ArrayList<String> divideStringInEqualParts(String str, int parts) {
        int length = str.length();
        ArrayList<String> dividedParts = new ArrayList<>();

        // Calculate the size of each part
        int partLength = length / parts;
        int startIndex = 0;

        // Divide the string into parts
        for (int i = 0; i < parts; i++) {
            // Calculate endIndex for the current part
            int endIndex = startIndex + partLength;

            // Adjust endIndex for the last part
            if (i == parts - 1) {
                endIndex = length;
            }

            // Extract the current part and add to ArrayList
            String part = str.substring(startIndex, endIndex);
            dividedParts.add(part);

            // Update startIndex for the next part
            startIndex = endIndex;
        }

        return dividedParts;
    }
     
    static String[] add_new_element_to_stringArray(String[] str,String element) { 
	   
	  String[] newArray=new String[str.length+1];
	  
	  for (int i = 0; i < str.length; i++) {		
		newArray[i] = str[i];		 
	}
	  newArray[str.length-1]=element;
	  
	  System.out.println("If you got an error use for loop and iterate the string in main method");
	  
//	  for (int i = 0; i < str.length; i++) {
//          System.out.println("Element " + (i + 1) + ": " + str[i]);
//      }
	  return newArray;
	  
   }
    //For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
    
    static void find_all_subsets_of_a_string(String str) { 
     //For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
        int temp=0;
    	String[] str1=new String[str.length()*2];
    	System.out.println(str1.length);
    	for(int i=0;i<str.length();i++) { 		
    		for(int j=i;j<str.length();j++) { 
    			str1[temp]=str.substring(i,j+1);
    			temp++;
    		}
    	}
    	for(int i=0;i<str1.length;i++) { 
    		System.out.print(str1[i]+",");
    	}
    }
    
    static void longest_repeating_sequence_in_a_string(String str) {  	
    	//str=raaajeeshhhhh
    	int count=0;
    	Map<Character,Integer> map=new HashMap<Character, Integer>();
    	for(int i=0;i<str.length();i++) { 
    		 char ch = str.charAt(i);
             map.put(ch, map.getOrDefault(ch, 0) + 1);
    	}
    	
    	Character ch=null;
    	int maxValue=0;
    	for (Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			if(ch==null|| val>maxValue) { 
			ch=	key;
			maxValue=val;
			}
		}
    	System.out.println("Maximum repeating character in the String is "+ch+" :"+maxValue);
    }
 
  //https://www.javatpoint.com/java-program-to-ind-all-the-permutations-of-a-string
	//Go through the above link to get clarification
    // Recursive function to generate permutations
     static void permute(char[] array, int currentIndex, List<String> result) {
    	 System.out.println("Gothrouh these again");
        // Base case: If currentIndex reaches the end of the array
        if (currentIndex == array.length - 1) {
            result.add(new String(array)); // Add current permutation to result list
            System.out.println("Added permutation: " + new String(array)); // Print added permutation
        } else {
            // Iterate through array from currentIndex to end
            for (int i = currentIndex; i < array.length; i++) {
                // Swap characters at currentIndex and i
                swap(array, currentIndex, i); // Swap step
                // Print current array state for visualization
                System.out.println("Current array state: " + new String(array));
                // Recursively generate permutations for remaining characters
                permute(array, currentIndex + 1, result); // Recursive call
                // Backtrack: Undo the swap to restore original array state
                swap(array, currentIndex, i); // Backtracking step
            }
        }
    }

    // Helper function to swap characters at positions i and j in the array
     static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static String remove_all_the_white_spaces(String str) { 
    	
    	return str.replaceAll("\\s", "");
    }
    
    
    static void replace_lower_case_characters_with_upper_case_and_vice_versa(String str){ 
    	
    char[] charArray = str.toCharArray();
   for (int i = 0; i < str.length(); i++) {
	
	 char currentChar = charArray[i];
	 if(Character.isLowerCase(currentChar)) { 
		charArray[i]=Character.toUpperCase(currentChar);
	     }else if(Character.isUpperCase(currentChar)){ 
	    	 charArray[i]=Character.toLowerCase(currentChar);
	     }
       }
           for(char arr:charArray) { 
	   
        	   System.out.print(arr);
            }
    }
    
   static void  replace_lower_case_characters_with_upper_case_and_vice_versa_2(String str){ 
    	
	 StringBuffer sbr=new StringBuffer(str);
	  
	  for(int i=0;i<str.length();i++) { 
		  if(Character.isLowerCase(str.charAt(i))) { 
			  
			sbr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
		  }else if(Character.isUpperCase(str.charAt(i))) { 
			  sbr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
		  }	  
	  }
	  System.out.println(sbr);
    }
    
    static String replace_the_spaces_of_a_string_with_a_specific_character(String str) { 
    	
    //	return str.replace(" ", "-");
    	//or
    	return str.replace(' ', '-');
    }
  
    
    static void is_palindrome(String str) { 
    	
    	//StringBuffer sbr=new StringBuffer();
    	StringBuilder sbr=new StringBuilder();
    	for (int i = str.length()-1; i >=0; i--) {
			
			sbr.append(str.charAt(i));
		}
    	if(str.equals(sbr.toString())) { 
    		System.out.println(str+" : is a Palindrome String");
    	}else { 
    		System.out.println(str+" : is not a Palindrome String");
    	}
    }

    static void rotation_of_a_string(String str1,int rotation) { 
    	
    		int length = str1.length()/rotation;
        	char[] charArray = str1.toCharArray();
        	
        	for (int i = 0; i < length; i++) {
        		char startIndex = str1.charAt(i);
    			for (int j =0; j <charArray.length-1; j++) {			
    				charArray[j]= charArray[j+1];
    			}
    			charArray[charArray.length-1]=startIndex;
    		}
        	
        	for(char ch:charArray) { 
        		System.out.print(ch);
        	}   		
    	}
    
    
    static boolean whether_one_string_is_a_rotation_of_another(String str,String str1) { 
    	
//    	String combinationstr = str+str;    	
//    return combinationstr.contains(str1);
    
    //or
    	String combinationstr = str.concat(str);
    	return combinationstr.indexOf(str1)!=-1;
    }
    
    static void maximum_and_minimum_occurring_character_in_a_string(String str) { 
    	
    	HashMap<Character,Integer> map=new HashMap<>();
    	char[] charArray = str.toCharArray();
    	for(char arr:charArray) { 
    		if(map.containsKey(arr)) { 
    			map.put(arr,map.get(arr)+1);
    		}else { 
    			map.put(arr, 1);
    		}
    	}
    	int minCount=Integer.MAX_VALUE,maxCount=0;
    	char minChar=' ';
		char maxChar=' ';
    	for(Map.Entry<Character,Integer> entry: map.entrySet()){ 
    		
    		int count = entry.getValue();
    		if(count>maxCount) { 
    			maxChar=entry.getKey();
    			       maxCount= count;
    		  }
    		if(count<minCount) { 
    			minChar=entry.getKey();
    			minCount=count;
    		}
    	}
    	
    	System.out.println("Maximum occurance character is : "+maxChar+", Count : "+maxCount);
    	System.out.println("Minimum occurance character is : "+minChar+", Count : "+minCount);
    }
    
    static void reverse_a_String(String str) { 
    	
      String temp="";
      
      for (int i = str.length()-1; i>=0; i--) {
		
    	  temp+=str.charAt(i);
	   }
      System.out.println(temp);
    }
    
    static void duplicate_characters_in_a_string(String str) { 
    	
    	boolean[] boo=new boolean[256];
    	for (int i = 0; i < str.length(); i++) {
    		if(boo[str.charAt(i)]) { 
    			continue;
    		}
			for (int j = i+1; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) { 
					System.out.println("Duplicate found : "+str.charAt(i));
					boo[str.charAt(i)]=true;
					break;
				}
			}
		}
    }
    
    static void duplicate_characters_in_a_string_2(String str){ 
    	boolean[]boo=new boolean[256];
    	HashSet<Character> set=new HashSet<Character>();
    	for(char arr:str.toCharArray()) { 
    		if(!set.add(arr)) { 
    			if(boo[arr]) { 
    				continue;
    			}else { 
    				System.out.println("Duplicate found : " +arr);
    				boo[arr]=true;
    			}
    			
    		}
    	}
    }
    
    static void frequency_of_characters(String str) { 
    	HashMap<Character,Integer> map=new HashMap<Character, Integer>();
    	
    	for(char arr : str.toCharArray()) { 
    		map.put(arr, map.getOrDefault(arr, 0)+1);
    		}
    	for(Entry<Character, Integer> enteryset :map.entrySet()) { 
    		Character key = enteryset.getKey();
    		Integer value = enteryset.getValue();
    		System.out.println("Character : "+key+" Frequency : "+value);
    	}
    }

    static void largest_and_smallest_word_in_a_string(String str) { 
    	
   String[] words = str.split("\\s+");
    	
           int minValue=Integer.MAX_VALUE, maxValue=0;
    	   String largestword="",smallestword="";
    	   	
    	   for(String arr:words) { 
    		int length = arr.trim().length();
    		   if(length>maxValue) { 
    			  largestword= arr;
    			  maxValue= length;
    		   }
    		   if(length<minValue) { 
    			  smallestword= arr;
    			 minValue= length;
    		   }
    	   }
    	System.out.println("Largestword : "+largestword);
    	System.out.println("Smallestword : "+smallestword);
    }
    
    static void Mostrepeated_word_in_a_file(String path) throws FileNotFoundException{ 
    	
    	BufferedReader reader=new BufferedReader(new FileReader(path));
    	
    	ArrayList<String>words=new ArrayList<String>();
    	String line,word="";
    	int count,maxCount=0;
    	
    	try {
			while((line=reader.readLine()) != null) { 
				String[] string = line.toLowerCase().split("[\\s+]");
			//	String[] string = line.toLowerCase().split("\\P{L}+");  
			//Note use above expression if there is more spaces between words because there might
				//be other non-breaking space characters or special characters that aren't getting trimmed. 
				for(String s:string) { 
					words.add(s);
				}
			}
			for(int i=0;i<words.size();i++) { 
				count=1;
				for (int j = i+1; j < words.size(); j++) {
					if(words.get(i).equals(words.get(j))) { 
						count++;
					}				
				}
				if(count>maxCount) { 
					maxCount=count;
					word=words.get(i);
				}
			}
			System.out.println("Most repeated word : "+word);
			reader.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
    
    
   static void  Mostrepeated_word_in_a_file_2(String path) throws IOException{
	   BufferedReader reader = new BufferedReader(new FileReader(path));
	    HashMap<String, Integer> wordCountMap = new HashMap<>();
	    String line;
	    String mostRepeatedWord = "";
	    int maxCount = 0;

	    try {
	        while ((line = reader.readLine()) != null) {
	            // Preprocess line (optional): lowercase
	        	String[] words = line.toLowerCase().split("\\P{L}+");

	            for (String word : words) {
	                // Trim leading/trailing spaces
	                word = word.trim(); // Remove extra spaces

	                if (!word.isEmpty()) { // Skip empty words
	                    int count = wordCountMap.getOrDefault(word, 0) + 1;
	                    wordCountMap.put(word, count);

	                    if (count > maxCount) {
	                        maxCount = count;
	                        mostRepeatedWord = word;
	                    }
	                }
	            }
	        }

	        System.out.println("Most repeated word: " + mostRepeatedWord);
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	}
   }
//    static  int Count_the_Punctuations2(String str1) { //these mut also must recheck
//    	int count=0;
//    	 String punctuation = "!.'\\-\"?;"; 
//    	 
//    	 Pattern pattern=Pattern.compile("["+punctuation+"]");
//    	 Matcher matcher = pattern.matcher(str1);
//    	 while(matcher.find()) { 
//    		 count++;
//    	 }
//    	 return count;
//    }
}
