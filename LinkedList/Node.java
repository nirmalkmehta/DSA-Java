package LinkedList;

public class Node<T> {
	
	private Node<T> nextNode;
	private T data;
	
	public Node(T data) {
		super();
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Data: " + this.data ;
	}
	
	
	
	
}
