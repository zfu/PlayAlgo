package Chapter1.ArrayAndString;

/**
 * question 2
 * Write code to reverse a C-Style String. 
 * (C-String means that ��abcd�� is represented as five characters,
 * including the null character.)
 * д���뷭תһ��C�����ַ�����(C������˼��"abcd"��Ҫ��5���ַ�����ʾ������ĩβ�� �����ַ�)
 * 
 * ���ǣ�
 * �ַ�������δ洢�ģ�����������洢�����������������洢��
 * ����ַ�����������洢������c���ԣ���Ϊ����java��������洢�˳��ȣ����ԣ���Ҫ���ȱ����������ĩβ(����'\0'�ַ�),�ҵ�ĩβ�ַ���
 * Ȼ�󽻻�ͷβ�ַ���
 * 
 * ����ַ������ú���ͷ��������洢(�����Ի���û�У�����ֻ��Ϊ�˳���ͷ�巨������ת�ַ���)������'\0'�ͽ����ˡ�
 * 
 * method1:������洢
 * method2:������洢
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
