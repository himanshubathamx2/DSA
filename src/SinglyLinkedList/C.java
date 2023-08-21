package SinglyLinkedList;

public class C
{
	public static void main(String[] args)
	{
		SinglyLL sll = new SinglyLL();
		sll.createLL(5);
		sll.insertLL(2, 1);
		sll.insertLL(67, 0);
		sll.insertLL(12, 3);
		sll.insertLL(25, 8);
		sll.insertLL(90, 0);
		
		sll.deleteANode(4);
		sll.clearSLL();
		sll.traverse();
	}
}
//90 67 5 2 12 25 