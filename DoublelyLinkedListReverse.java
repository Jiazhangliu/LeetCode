
public class DoublelyLinkedListReverse {

	public Node reverse(Node head){
		Node n = head, next;
		while(n.next != null){
			next = n.next;
			n.next = n.prev;
			n.prev = next;
			n = next;
		}
		
		n.next = n.prev;
		n.prev = null;
		// n is the new head.
		return n;
	}
	
	public static void main(String args[]){
		Node t1 = new Node(1);
		Node t2 = new Node(2);
		Node t3 = new Node(3);
		Node t4 = new Node(4); 
		
		t1.next = t2;
		t2.next = t3;
		t3.next = t4;
		
		t2.prev = t1;
		t3.prev = t2;
		t4.prev = t3;
		
		Node n = t1;
		while(n != null){
			System.err.print(n.value + " ");
			n = n.next;
		}
		System.err.println();
		
		
		DoublelyLinkedListReverse dlr = new DoublelyLinkedListReverse();
		
		n = dlr.reverse(t1);
		while(n != null){
			System.err.print(n.value + " ");
			n = n.next;
		}
	}
	
}

