package Chapter1.ArrayAndString;
/**
 * Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and s2, 
 * write code to check if s2 is a rotation of s1 using only one call to isSubstring ( i.e., ¡°waterbottle¡± is a rotation of ¡°erbottlewat¡±).
 * @author zfu
 *
 */
public class Q8 {
	public static void main(String[] args){
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		System.out.println(isRotation1(s1, s2));
	}
	
	public static boolean isRotation1(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		
		String temp = s1 + s2;
		if(temp.contains(s2)){
			return true;
		}
		
		return false;
	}

}
