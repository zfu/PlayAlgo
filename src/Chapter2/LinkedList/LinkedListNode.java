package Chapter2.LinkedList;

public class LinkedListNode<T extends Comparable<T>> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data){
		this.data = data;
	}
	
	public LinkedListNode(T data, LinkedListNode<T> next){
		this.data = data;
		this.next = next;
	}
	
	public LinkedListNode(){
		this.data = null;
	}
	
	@Override
	public String toString(){
		return "LinkedListNode{" + 
				"data=" + data + 
				"}";
	}
}
