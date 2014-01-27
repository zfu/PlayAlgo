package Chapter2.LinkedList;
/**
 * Write code to remove duplicates from an unsorted linked list.
 * Follow up
 * How would you solve this problem if a temporary buffer is not allowed?
 * @author zfu
 *
 */

import Chapter2.LinkedList.LinkedListNode;
import java.util.*;
public class DeleteDuplicate {
	public static void main(String[] args){
		
	}
	
	public static void deleteDups(LinkedListNode<Integer> head){
		Set<Integer> set = new HashSet<Integer>();
		LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> prev = null;
		while(current != null){
			if(set.contains(current.data)) {
				if(prev != null){
					prev.next = current.next;
				}
			}
			else{
				set.add(current.data);
				prev = current;
			}
			current = current.next;
		}
	}

}
