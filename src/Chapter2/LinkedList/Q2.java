package Chapter2.LinkedList;
import CTCILibrary.LinkedListNode;
import CTCILibrary.AssortedMethods;;

public class Q2 {
	public static void main(String[] args){
		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		int nth = 3;
		//nthToLastR2(head, nth);
		nthToLastR3(head, nth);
	}
	
	public static int nthToLastR1(LinkedListNode head, int n){
		if(n == 0 || head == null)
			return 0;
		
		int k = nthToLastR1(head.next, n) + 1;
		if(k == n){
			System.out.println(n + "the to last node is " + head.data);
		}
		
		return k;
	}
	
	public static void nthToLastR2(LinkedListNode head, int n){
		if(head == null) return;
		
		nthToLastR2(head.next, n -1);
		if(n == 1) {
			System.out.println(head.data);
		}
	}
	
	public static void nthToLastR3(LinkedListNode head, int n){
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
		for(int i=0; i < n - 1; i ++){
			if(p2 == null) return;
			p2 = p2.next;
		}
		System.out.println(p2.data);
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		System.out.println(p1.data);
	}
}
