package SinglyLinkedList;

public class Client
{

	public static void main(String[] args)
	{	
		//testing creation
		SinglyLinkedList sll= new SinglyLinkedList();
	    sll.createSinglyLinkedList(5);
		//System.out.println(sll.head.value);

		//insertion
		sll.insertInLinkedList(6, 0);
	//	System.out.println(sll.head.next.value);
	//	System.out.println(sll.head.value);
		sll.insertInLinkedList(7, 2);
		sll.insertInLinkedList(8, 9);
		sll.insertInLinkedList(1, 5);
		
		sll.traverseSinglyLinkedList();// 6 5 7  8 1
	    //sll.deleteSLL(); 
	    
	    sll.deletionOfNode(2);
	    sll.traverseSinglyLinkedList();
	    
	    sll.searchNode(8);
	    sll.traverseSinglyLinkedList();
	    
	    sll.deletionOfNode(3);
	    sll.traverseSinglyLinkedList();
		
		
		
		
		
	}

}
