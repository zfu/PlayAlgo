package Chapter1.ArrayAndString;
import java.util.*;
/**
 * 一个字符串中找到第一个只出现一次的字符
 * @author zfu
 *
 */
public class Q9 {
	public static void main(String[] args){
		char[] str = {'a','b','c','b','d','d','a','f','a','g'};
		HashMap<Character ,Integer> hash = new HashMap<Character ,Integer>();
		Queue<Character> queue = new LinkedList<Character>();
		for(int i=0;i<str .length;i++){
			hash.put(str[i], hash.get(str[i]) != null ? hash.get(str[i]) + 1 : 1);
			if(hash.get(str[i])==1){
				queue.add(str[i]);
			}
			
			while(hash.get(queue.peek()) >= 2){
					queue.poll();
				}
		}
		System.out.println(queue.poll());
	}
}
