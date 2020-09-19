package sabir.klm;

public class MyQueue {
	int head=-1;int tail=-1;
	int SIZE=5;
	int queue[]=new int[SIZE];
	
		/*Constructor */
	public MyQueue() {
	}
	/*Add method */
	public void add(int data) {
		if(tail==SIZE-1) {
			SIZE*=2;
		}
		queue[++tail]=data;
		head=0;
	}/*Element Method*/
	public int element() {
		if(head==tail) {
			return -1;
		}
		return queue[0];
	}/*Remove Method*/
	public int remove() {
		if(head==tail) {
			return -1;
		}
		int removed=queue[0];
		for(int i=0;i<tail;i++) {
			queue[i]=queue[i+1];
		}
		tail--;
		return removed;
	}

	public static void main(String[] args) {
		

	}

}
/*boolean	add(E e)
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
E	element()
Retrieves, but does not remove, the head of this queue.
boolean	offer(E e)
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
E	peek()
Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
E	poll()
Retrieves and removes the head of this queue, or returns null if this queue is empty.
E	remove()
Retrieves and removes the head of this queue.*/