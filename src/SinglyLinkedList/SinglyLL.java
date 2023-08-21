package SinglyLinkedList;

public class SinglyLL
{
	int size;
	Node head;
	Node tail;
	
	public Node createLL(int value)
	{
		Node node= new Node();
		node.value=value;
		node.next=null;
		
		tail=node;
		head= node;
		size++;
		return node;
	}
	
	public void insertLL(int value, int loc)
	{
		Node node = new Node();
		node.value=value;
		
		if(head==null)
			createLL(value);
		else if(loc==0)
		{
			node.next=head;
			head =node;
		}
		else if(loc>=size)
		{
			tail.next=node;
			tail = node;
		}
		else
		{
			int index=0;
			Node tmpNode = head;
			while(index<loc-1)  //0 1   2 
			{
				tmpNode= tmpNode.next;
				index++;
			}
			node.next= tmpNode.next;
			tmpNode.next= node;
		}
		size++;
	}
	
	  public void traverse()
	  {
		  int index=0;
		  Node node= head;
		  if(head==null)
			  return;
		  while(index<size-1)
		  {
			  System.out.print("->"+node.next.value);
			  node= node.next;
			  index++;
		  }
	  }
	  
	  
	  public void search(int value)
	  {
		  int index=0;
		  Node node = head;
		  while(index<size)
		  {
			  if(node.value==value)
				  System.out.println("At: "+index);
			  node= node.next;
			  index++;
		  }
			  
	  }
	  
	  public void deleteANode(int loc)
	  {
		  Node tmpNode= head;
		  if(loc==0)
		  {
			  head= tmpNode.next;
			  tmpNode.next=null;
		  }
		  else if(loc>=size-1)
		  {
			  int index=0;
			  while(index<size-2)
			  {
				  tmpNode= tmpNode.next;
				  index++;
				  //0 1 2 3
			  }
			  tmpNode.next=null;
			  tail = tmpNode;
		  }
		  else 
		  {
			  //0 1 2 3
			  int index=0;
			  while(index<loc-1)
			  {
				  tmpNode= tmpNode.next;
			  	  index++;
			  }
			  tmpNode.next= tmpNode.next.next;
		  }
		  size--;
	  }
	  
	  public void clearSLL()
	  {
		  head= null;
		  tail= null;
		  System.out.println("SLL is empty now");
	  }
	  
	  
	  
	  
}
