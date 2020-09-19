package sabir.klm;

public class MyStack {
	static int top=-1;
	int SIZE=100;
	int stack[]=new int[SIZE];
	/*Constructor */
	public MyStack(){
		//top=-1;
	}
	/*push Methods */
	public void push(int data) {
		if(top==SIZE-1) {
			SIZE=2*SIZE;
			stack[++top]=data;
			return;
		}
		stack[++top]=data;
	}
	/*Peek methods */
	public int peek() {
		if(top==-1) {
		System.out.println("Empty Stack" );
		return -1;
		}
		return stack[top];
	}
	/*Pop Methods*/
	public void pop() {
		if(top==-1) {
			System.out.println("Empty Stack Cant pop");
			return;
		}
		top--;
	}
	public String toString() {
		String result="[";
		for(int i=0;i<top;i++) {
			result=result+stack[i]+" ";
		}
		result=result.trim();
		return result+"]";
	}

	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.push(35);
		stack.push(28);
		stack.push(2);
		stack.push(5);
		System.out.println(top);
		System.out.println(stack.peek());
		System.out.println(stack.toString());
		MyQueue queue=new MyQueue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.remove();queue.remove();
		System.out.println(queue.remove());
		System.out.println(queue.element());

	}

}
