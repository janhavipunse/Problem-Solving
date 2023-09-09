package practice;
import java.util.*;

class Node{
	
	int data;
	Node left;
	Node right;
	Node(int d){
		Node left, right=null;
		data=d;
	}
}
class tree{
	Node root;
	boolean lTr=false;
	tree(){
		root=null;
	}
	void printZigZagTraversal()
	{
		Stack<Node> curr=new Stack<>();
		Stack<Node> next=new Stack<>();
		
		curr.push(root);
		lTr=true;
		while(!curr.isEmpty()) {
			
			Node x=curr.pop();
			System.out.print(x.data+" ");
			
			if(lTr) {
				if(x.left!=null)
					next.push(x.left);
				if(x.right!=null)
					next.push(x.right);
				
			}
			else {
				if(x.right!=null)
					next.push(x.right);
				if(x.left!=null)
					next.push(x.left);
				
			}
			
			if(curr.isEmpty()) {
				lTr=!lTr;
				Stack<Node> temp=curr;
				curr=next;
				next=temp;
			}
			
		}
		
	}
}
public class Zigzag {

	public static void main(String[] args) {
		tree tree = new tree();
	    tree.root = new Node(2);
	    tree.root.left = new Node(5);
	    tree.root.right = new Node(7);
	    tree.root.left.left = new Node(3);
	    tree.root.left.right = new Node(1);
	    tree.root.right.left = new Node(9);
	    tree.root.right.right = new Node(8);
	 
	    System.out.println("ZigZag Order traversal of binary tree is");
	    tree.printZigZagTraversal();
		
	}

}
