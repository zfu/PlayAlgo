package Chapter1.ArrayAndString;

import java.util.*;
public class Q3 {
	
	public static void main(String[] args){
		System.out.println("test1: " + RemoveDuplicateChar1("abcabcdefg"));
		System.out.println("test2: " + RemoveDuplicateChar2("abcabcdefg"));
		System.out.println("test3: " + removeDuplicates3("aaaabbbb"));
		System.out.println("test3: " + removeDuplicates3("bbbbbbbbb"));
		System.out.println("test3: " + removeDuplicates3("abcabcabc"));
		System.out.println("test3: " + removeDuplicates3(""));
		System.out.println("test3: " + removeDuplicates3(null));
	}
	
	public static String RemoveDuplicateChar1(String s){
		char[] cc = s.toCharArray();
		
		HashSet<Character> hs = new HashSet<Character>();
		for(char c : cc){
			hs.add(c);
		}
		return hs.toString();
	}
	
	public static String RemoveDuplicateChar2(String s){
		char[] c = s.toCharArray();
		int len = c.length;
		if(len == 0){
			return s;
		}
		
		int flag = 0;
		int i = 0;
		while(i < len){
			int offset  = c[i] - 'a';
			if((flag & (1 << offset)) > 0){
				for(int j=i; j < len - 1; j ++){
					c[j] = c[j + 1];
				}
				--len;
			}
			else{
				i ++;
			}
			flag |= (1 << offset);
		}
		return new String(c, 0, len);
	}
	
	/**
	 * Use additional buffer.
	 * @param s
	 * @return
	 */
	public static String removeDuplicates3(String s){
		if(s == null)
			return null;
		if(s.length() < 2){
			return s;
		}
		
		char[] cc = s.toCharArray();
		boolean[] flag = new boolean[256];
		int tail = 0;
		int cur = 0;
		
		while(cur < cc.length){
			if(!flag[cc[cur]]){
				flag[cc[cur]] = true;
				cc[tail] = cc[cur];
				tail ++ ;
				cur ++;
			}
			else{
				cur++;
			}
		}
		return new String(cc, 0, tail);
		
	}

}
