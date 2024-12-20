
public class LL {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	void printMiddle() {
		Node slowPointer=head;
		Node fastPointer=head;
		
		while(slowPointer!=null && fastPointer!=null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}
		
		System.out.println(slowPointer.data);
	}
	
	void push(int data){
		
		Node newNode = new Node(data);
		
		newNode.next=head;
		head = newNode;
	}
	
	void print() {
		
		Node n = head;
		
		while(n!=null) {
			System.out.println(n.data);
			//n = 
		}
	}

}
