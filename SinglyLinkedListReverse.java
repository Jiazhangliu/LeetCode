
public class SinglyLinkedListReverse {

	public Node reverse(Node head){
		Node temp;
		Node previous = null;
		while(head != null) {
		    temp = head.next;
		    head.next = previous;
		    previous = head;
		    head = temp;
		}
		    return previous;
	}
	
	public static void main(String [] args){
		Node root = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		
		root.next = n1;
		n1.next = n2;
		n2.next = n3;
		
		
		SinglyLinkedListReverse slr = new SinglyLinkedListReverse();
		
		Node n = slr.reverse(root);

		while (n != null){
			System.err.println(n.value);
			n = n.next;
		}
	}
}

