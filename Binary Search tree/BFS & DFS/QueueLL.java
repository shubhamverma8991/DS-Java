
public class QueueLL {

	private Node front,rear;
	public void enqueue(Node ref) {
		if(front==null) {
			front=rear=ref;
		}
		else {
			rear.setNext(ref);
			rear=ref;
		}
	}
	public int dequeue() {
		Node temp=front;
		if(front==null) {
			throw new RuntimeException("Empty List");
		}
		else {
			front=front.getNext();
			temp.setNext(null);
			return temp.getInfo();
		}
	}
	public Node getFront() {
		return front;
	}
	public void setFront(Node front) {
		this.front = front;
	}
	public boolean isEmpty() {
		return front==null;
	}
}
