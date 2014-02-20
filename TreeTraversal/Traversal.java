
public class Traversal {
	Node t;
	
	public Traversal(Node t){
		this.t= t;
	}
	
	public void inorder(Node n){
		if (n == null) {return;}
		inorder(n.left);
		System.err.print(n.value + " ");
		inorder(n.right);
	}
	
	public void preorder(Node n){
		if (n == null) {return;}
		System.err.print(n.value  + " ");
		inorder(n.left);
		inorder(n.right);
	}
	
	public void postorder(Node n){
		if (n == null) {return;}
		inorder(n.left);
		inorder(n.right);
		System.err.print(n.value  + " ");
	}
	
	
	public static void main(String args[]){
		Node root = new Node(10);
		Node t1 = new Node(1);
		Node t2 = new Node(2);
		Node t3 = new Node(3);
		Node t4 = new Node(4);
		Node t5 = new Node(5);
		Node t6 = new Node(6);
		Node t7 = new Node(7);
		Node t8 = new Node(8);
		Node t9 = new Node(9);
		
		root.left = t1;
		root.right = t2;
		
		t1.left = t3;
		t1.right = t4;
		
		t2.left = t5;
		t2.right = t6;
		
		t3.left = t7;
		t3.right = t8;
		
		t6.right = t9;
		
		Traversal traversal = new Traversal(root);
		
		traversal.inorder(root);
		System.err.println();
		
		traversal.preorder(root);
		System.err.println();
		
		traversal.postorder(root);
		System.err.println();
	}
}

