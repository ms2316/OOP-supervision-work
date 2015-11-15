package linkedlist;
public class Node {
		
	/*Node stores data, and a reference to the next node*/
	public int data;
	public Node next;
	
	public Node( int data, Node next){
		this.data = data;
		this.next = next;
		
	}
	public String toString(){
		return data+"";
	}
	public int get(){
		return data;
	}
	
}
