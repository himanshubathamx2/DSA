package Stack.UsingLinkedList;

public class StackLinkedListMain
{

	public static void main(String[] args)
	{
		Stack stack = new Stack(4);
		stack.push(23);
		stack.push(13);
		stack.push(2);
		stack.push(27);
		stack.travarsal();
		
		stack.pop();
		stack.travarsal();
	}
//4 23 13 2 27
}
