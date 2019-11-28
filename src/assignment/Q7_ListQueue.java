package assignment;

public class Q7_ListQueue extends Q6_LinkedList {

	public Q7_ListQueue() {
		super();
	}

	public void enqueue(Object item) {
		if (head == null) {
			head = new ListNode(item);
			tail = head;
		} else {
			tail.setNext(new ListNode(item));
			tail = tail.getNext();
		}
	}

	public Object dequeue() {
		Object item;

		if (head == null)
			return null;
		item = head.getData();
		head = head.getNext();
		if (head == null)
			tail = null;
		return item;
	}

	public boolean empty() {
		return (head == null);
	}
}