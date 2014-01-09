package Chapter1.ArrayAndString;

/**
 * question 2
 * Write code to reverse a C-Style String. 
 * (C-String means that “abcd” is represented as five characters,
 * including the null character.)
 * 写代码翻转一个C风格的字符串。(C风格的意思是"abcd"需要用5个字符来表示，包含末尾的 结束字符)
 * 
 * 考虑：
 * 字符串是如何存储的，是利用数组存储，还是利用链表来存储？
 * 如果字符串是用数组存储，对于c语言，因为不像java，对数组存储了长度，所以，需要首先遍历到数组的末尾(遇到'\0'字符),找到末尾字符后，
 * 然后交换头尾字符。
 * 
 * 如果字符串是用含有头结点的链表存储(可能性基本没有，这里只是为了尝试头插法，来翻转字符串)，遇到'\0'就结束了。
 * 
 * method1:用数组存储
 * method2:用链表存储
 */
public class Q2 {
	
	public static void main(String[] args)
	{
		System.out.println(ReverseCStyleString1("abcdefg"));
		System.out.println(ReverseCStyleString2("abcdefg"));
		System.out.println(ReverseCStyleString3("abcdefg"));
	}
	
	/**
	 * 1. in-place
	 * time: O(n), space: O(1)
	 * @param s
	 * @return
	 */
	public static String ReverseCStyleString1(String s){
		char[] result = s.toCharArray();
		
		for(int i = 0; i <= (s.length() - 1) / 2; i++){
			char temp = result[i];
			result[i] = result[s.length() - 1 - i];
			result[s.length() - 1 - i] = temp;
		}
		return new String(result);
	}
	
	/**
	 * 2. time: O(n), space: O(n)
	 * @param s
	 * @return
	 */
	public static String ReverseCStyleString2(String s){
		StringBuilder sb = new StringBuilder();
		//sb.append("null");
		for(int i = s.length() - 1; i >= 0; i --){
			char c = s.charAt(i);
			sb.append(c);
		}
		return sb.toString();
	}
	
	public static String ReverseCStyleString3(String s){
		char[] c = s.toCharArray();
		int head = 0;
		int tail = s.length() - 1;
		System.out.println(tail);
		while(head < tail){
			char temp = c[head];
			c[head] = c[tail];
			c[tail] = temp;
			++head;
			--tail;
		}
		
		return new String(c);
	}
	
}
