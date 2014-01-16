package Chapter1.ArrayAndString;

import java.util.Arrays;

/**
 * Write a method to decide if two strings are anagrams or not.
 * @author zfu
 *
 */

public class Q4 {
	public static void main(String[] args){
		System.out.println("The first method: " + isAnagrams1("abccba", "acbacb"));
		System.out.println("The first method: " + isAnagrams1("aa10", "a0a1"));
		//System.out.println("The Second method: " + isAnagrams2("aa10", "a0a1"));
		System.out.println("The Second method: " + isAnagrams2("abcddace", "ecdddcba"));
	}
	
	public static boolean isAnagrams1(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		return sort(str1).equals(sort(str2));
	}
	
	public static String sort(String str){
		char[] c = str.toCharArray();
		Arrays.sort(c);
		
		return new String(c);
	}
	
	/**
	 * Method 2 is in-place
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isAnagrams2(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		int[] letters = new int[256];
		char[] s_array = str1.toCharArray();
		for(char c : s_array){
			letters[c] ++;
		}
		
		//Checking the second array
		for(int i=0; i<str2.length(); i ++){
			int c = str2.charAt(i);
			System.out.println(c);
			System.out.println(letters[c]);
			if(--letters[c] < 0){
				return false;
			}
		}
		
		return true;
	}
}
