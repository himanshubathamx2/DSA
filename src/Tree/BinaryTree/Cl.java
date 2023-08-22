package Tree.BinaryTree;

public class Cl
{	public static void main(String[] args)
	{
		//checking preorder travarsal
		BinaryTreeLL binaryTree = new BinaryTreeLL();
		BinaryNode N1= new BinaryNode();
		N1.value="N1";
		BinaryNode N2= new BinaryNode();
		N2.value="N2";
		BinaryNode N3= new BinaryNode();
		N3.value="N3";
		BinaryNode N4= new BinaryNode();
		N4.value="N4";
		BinaryNode N5= new BinaryNode();
		N5.value="N5";
		BinaryNode N6= new BinaryNode();
		N6.value="N6";
		BinaryNode N7= new BinaryNode();
		N7.value="N7";
		BinaryNode N8= new BinaryNode();
		N8.value="N8";
		BinaryNode N9= new BinaryNode();
		N9.value="N9";
		N1.left= N2;
		N1.right=N3;
		N2.left= N4;
		N2.right=N5;
		N3.left= N6;
		N3.right=N7;
		N4.left= N8;
		N4.right=N9;
		binaryTree.root= N1;
		binaryTree.preOrder(binaryTree.root);//N1 N2 N4 N8 N9 N5 N3 N6 N7 
		binaryTree.search("N5");
		
		
		System.out.println();
		//checking insertion
		BinaryTreeLL binaryTree1= new BinaryTreeLL();
		binaryTree1.insert("N1");
		binaryTree1.insert("N2");
		binaryTree1.insert("N3");
		binaryTree1.insert("N4");
		binaryTree1.insert("N5");
		binaryTree1.insert("N6");
		binaryTree1.insert("N7");
		binaryTree1.insert("N8");
		binaryTree1.levelOrder();
		
		
		
		
		
	}
}
