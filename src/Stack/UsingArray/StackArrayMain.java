package Stack.UsingArray;

public class StackArrayMain
{
	public static void main(String[] args)
	{
		Stack stack = new Stack(4);
		stack.push(2);
		stack.push(5);
		stack.push(1);
		stack.push(9);
		
//		int pop = stack.pop();
//		System.out.println("Popped"+pop);
//		stack.printStack();
//		System.out.println(stack.isEmpty());
		boolean full = stack.isFull();
		System.out.println(full);
		stack.printStack();
	}
}
