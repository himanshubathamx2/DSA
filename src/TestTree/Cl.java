package TestTree;

public class Cl
{
	public static void main(String[] args)
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		bst.insert(20);
		bst.insert(40);
		bst.insert(45);
		bst.insert(85);
		
//		70 50 90 30 60 80 100 20 40 85 45 
		bst.levelOrder();System.out.println();
		bst.preorder(bst.root); System.out.println();
		bst.inorder(bst.root); System.out.println();
		bst.postOrder(bst.root);System.out.println();
	}
}
