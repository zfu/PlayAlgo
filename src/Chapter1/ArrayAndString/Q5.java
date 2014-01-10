package Chapter1.ArrayAndString;
/**
 * Write a method to replace all spaces in a string with ¡®%20¡¯.
 * @author zfu
 *
 */
public class Q5 {
	public static void main(String[] args){
		String test1 = " I have a dream ";
		String test2 = "";
		String test3 = null;
		//char[] c = test3.toCharArray();
		//System.out.println(replaceString1(c));
		System.out.println(replaceString1(test2));
		System.out.println(replaceString2(test1));
	}
	
	public static String replaceString1(String s){
		if(s == null) return null;
		if(s.length() == 0) return "Empty";
		char[] str = s.toCharArray();
		int spaceCount = 0;
		int length = str.length;
		for(char c : str){
			if(c == ' '){
				spaceCount ++;
			}
		}
		System.out.println(spaceCount);
		
		char[] newArray = new char[length + 2*spaceCount];
		
		for(int i = length - 1; i >= 0; i --){
			if(str[i] == ' '){
				newArray[spaceCount * 2 + i] = '0';
				newArray[spaceCount * 2 + i-1] = '2';
				newArray[spaceCount * 2 + i -2] = '%';
				spaceCount --;
			}
			else
			{
				newArray[i + spaceCount * 2] = str[i];
			}
		}
		
		return new String(newArray);
	}
	
	public static String replaceString2(String s){
		if(s == null || s.length() == 0) return null;
		
		int spaceCount = 0;
		char[] str = s.toCharArray();
		for(char c : str){
			if(c == ' ')
				spaceCount ++;
		}
		System.out.println(spaceCount);		
		char[] newArray = new char[str.length + 2 * spaceCount];
		int j = 0;
		for(int i = 0; i < str.length; i ++){
			if(str[i] == ' '){
				newArray[i + j] = '%';
				newArray[i + j + 1] = '2';
				newArray[i + j + 2] = '0';
				j += 2;
 			}
			else{
				newArray[i + j] = str[i];
			}
		}
		return new String(newArray);
	}
}
