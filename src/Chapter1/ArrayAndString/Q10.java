package Chapter1.ArrayAndString;
//Implement a method to perform basic string compression using the counts of
//repeated characters. For example, the string aabcccccaaa would become
//a2blc5a3. If the "compressed" string would not become smaller than the original
//string, your method should return the original string.
public class Q10 {
	public static void main(String[] args){
		System.out.println(compress("aabcccccaaa"));
	}
	
	public static String compress(String str){
		if(str.length() == 0 || str == null) return null;
		
		char prev = str.charAt(0);
		int count = 1;
		StringBuilder sb = new StringBuilder();
		sb.append(prev);
		for(int i = 0; i < str.length(); ++i ){
			if(str.charAt(i) == prev){
				++count;
			}
			else{
				prev = str.charAt(i);
				sb.append(count).append(prev);
				count = 1;
			}
		}
		
		sb.append(count);
		
		return sb.toString().length() >= str.length() ? str : sb.toString();
	}
}
