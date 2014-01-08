package Chapter1.ArrayAndString;

import java.util.HashSet;
/**
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 * @author zfu
 *
 *method1：
 *使用 hash来操作：顺序访问字符串中的每一个元素，访问每一个字符前，判断该字符是否存在于hash表内，
 *如果不存在，则加入hash表中，如果存在，表明有重复字符，返回false。
 *
 *method2：
 *如果是ASCII编码的话，那么一共只有256个数，可以考虑使用位图来实现，java中一个int占4个字节，32位。那么只需要一个长度为8的int数组
 *即可表示所有的字符，随后顺序访问字符串中的字符，如果存在将对应字符的ASCII码编号的位设置为1即可。
 */
public class Q1 {
	public static boolean IsUnique1(String str){
		char[] ss = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for (char s : ss){
			if(set.contains(s)){
				return false;
			}
			set.add(s);
		}
		return true;
	}
	
	public static boolean IsUnique2(String str){
		if(str.length() > 256){
			return false;
		}
		
		boolean[] char_set = new boolean[256];
		for(int i=0; i < str.length(); i ++){
			int val = str.charAt(i);
			if(char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	/**
	 * Only for 26 characters.
	 * @param str
	 * @return
	 */
	public static boolean IsUnique3(String str){
		if(str.length() > 0xff){
			return false;
		}
		
		int checker = 0;
		for (int i=0; i < str.length(); i ++){
			char ch = str.charAt(i);
			if(((i << ch) & checker) > 0){
				return false;
			}
			else
			{
				checker |= (1 << ch);
			}
		}
		return true;
	}
	
	public static boolean IsUnique4(String str){
		if(str.length() > 256){
			return false;
		}
		
		char[] cc = str.toCharArray();
		int[] bitmap = new int[8];
		for(char c : cc){
			int i = c;
			int idx = i/32;
			int offset = i&(32-1); //i%32 = i & (32-1)
			if(((bitmap[idx])&(1<<offset))!=0){
				return false;
			}
			bitmap[idx] |= (1 << offset);
		}
		return true;
	}
	
	public static void main(String[] args){
		String s = "abcdefg%^*$";
		System.out.println("The first method: " + IsUnique1(s));
		System.out.println("The second method: " + IsUnique2(s));
		int i = '$';
		System.out.println(i);
		System.out.println("The third method: " + IsUnique3(s));
		System.out.println("The third method: " + IsUnique4(s));
	}
}
