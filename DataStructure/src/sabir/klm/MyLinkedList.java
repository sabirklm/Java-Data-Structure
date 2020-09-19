package sabir.klm;
import java.util.Scanner;

public class MyLinkedList {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }
        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);
            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head) {
    	SinglyLinkedListNode temp=head;
    	if(head==null)return;
    	while(temp.next!=null) {
    		System.out.print(temp.data+" ");
    		temp=temp.next;
    	}
    	System.out.println(temp.data);
    }
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
            if (head == null || head.next == null)  
                return head;
            SinglyLinkedListNode rest = reverse(head.next);  
            head.next.next = head;
            head.next = null;  
            return rest;  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();
/*
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            llist.insertNode(llistItem);
        }
        */
        for(int i=36;i<40;i++) {
        	llist.insertNode(i);
        }
        printLinkedList(llist.head);
        reverse(llist.head);
        printLinkedList(llist.head);
        scanner.close();
    }
}
