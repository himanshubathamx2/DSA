package TestTree;

import java.util.LinkedList;
import java.util.Queue;

import Tree.BinarySearchTree.BinaryNode;

public class BinarySearchTree
{
	BinaryNode root;
	public BinarySearchTree()
	{
		this.root=null;
	}
	
	//insert
	public BinaryNode insert(BinaryNode currentNode, int value) {
		if(currentNode==null) {
			BinaryNode newNode = new BinaryNode();
			newNode.value=value;
			return newNode;
		}
		else if(value<=currentNode.value) {
			currentNode.left= insert(currentNode.left, value);
			return currentNode;
		}
		else {
			currentNode.right=insert(currentNode.right,value);
			return currentNode;
		}
	}
	void insert(int value) {
		root=insert(root,value );
	}
	
	
	
	
	//level order trewafesal
	 void levelOrder() {
		    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		    queue.add(root);
		    while (!queue.isEmpty()) {
		      BinaryNode presentNode = queue.remove();
		      System.out.print(presentNode.value + " ");
		      if (presentNode.left != null) {
		        queue.add(presentNode.left);
		      }
		      if (presentNode.right != null) {
		        queue.add(presentNode.right);
		      }
		    }
		  }
	 
	 //preorder tr
	 public void preorder(BinaryNode node) {
		 if(node==null)return;
		 System.out.print(node.value+" ");
		 preorder(node.left);
		 preorder(node.right);
	 }
	 //inorder
	 public void inorder(BinaryNode node) {
		 if(node==null)return;
		 inorder(node.left);
		 System.out.print(node.value+" ");
		 inorder(node.right);
	 }
	 //postorder
	 public void postOrder(BinaryNode node) {
		 if(node==null)return;
		 postOrder(node.left);
		 postOrder(node.right);
		 System.out.print(node.value+" ");
	 }

	 
}
