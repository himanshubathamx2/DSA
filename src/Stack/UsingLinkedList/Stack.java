package Stack.UsingLinkedList;

public class Stack
{
	int  size;
	Node head;
	Node tail;
	
	Stack(int value)
	{
		Node node = new Node();
		node.value= value;
		node.next=null;
		head= node;
		tail= node;
		size++;
	}
	
	//push
	public void push(int value)
	{
		Node node= new Node();
		node.value=value;
		node.next=null;
		tail.next= node;
		tail =node;
		size++;
	}
	
	//pop
	public int pop()
	{
		Node node= head;
		int index=0;//0  1  2  3  
		while(index< size-2)
		{
			node= node.next;
			index++;
		}
		int popped= node.next.value;
		tail = node;
		size--;
		return popped;
	}
	
	
	//traversal of stack   //0 1 2
	public void travarsal()
	{	
		Node tmpNode=head; 
		int index=0;
		while(index < size)
		{
			System.out.print(tmpNode.value+" ");
			tmpNode= tmpNode.next;
			index++;
		}
	}
	
}

