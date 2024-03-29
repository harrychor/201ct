package assignment;


class Q4_ListNode {

	Object data;
	Q4_ListNode next;

	public Q4_ListNode(Object o) { data = o; next = null; }
	public Q4_ListNode(Object o, Q4_ListNode nextNode)
		{ data = o; next = nextNode; }

	public Object getData() { return data; }
	public void setData(Object o) { data = o; }

	public Q4_ListNode getNext() { return next; }
	public void setNext(Q4_ListNode next) { this.next = next; }

} // class ListNode

class EmptyListException extends RuntimeException {
	public EmptyListException ()
		{ super("List is empty"); }
} // class EmptyListException

public class Q4_LinkedList {

	protected Q4_ListNode head;   // <== chnage to protected for inheriting
	protected Q4_ListNode tail;      // <== change to protected for inheriting

	protected  int length;		// the length of the list   <== chnage to protected for inheriting

	public Q4_LinkedList() {
		head = tail = null;
		length = 0;
	}

	public boolean isEmpty() { return head == null; }

	public void addToHead(Object item) {
		if (isEmpty())
			head = tail = new Q4_ListNode(item);
		else
			head = new Q4_ListNode(item, head);
		length++;
	}

	public void addToTail(Object item) {
		if (isEmpty())
			head = tail = new Q4_ListNode(item);
		else {
			tail.setNext(new Q4_ListNode(item));
			tail = tail.getNext();
		}
		length++;
	}

	public Object removeFromHead() throws EmptyListException {
		Object item = null;
		if (isEmpty())
			throw new EmptyListException();
		item = head.getData();
		if (head == tail)
			head = tail = null;
		else
			head = head.getNext();
		length--;
		return item;
	}

	public Object removeFromTail() throws EmptyListException {
		Object item = null;
		if (isEmpty())
			throw new EmptyListException();
		item = tail.getData();
		if (head == tail)
			head = tail = null;
		else {
			Q4_ListNode current = head;
			while (current.getNext() != tail)
				current = current.getNext();
			tail = current;
			current.setNext(null);
		}
		length--;
		return item;
	}

	public String toString() {
		String str = "[ ";
		Q4_ListNode current = head;
		while (current != null) {
			str = str + current.getData() + " ";
			current = current.getNext();
		}
		return str + " ]";
	}

	public int count() {
		return length;
	}

	public Object remove(int n) {
		Object item = null;
		if (n <= length) { // make sure there is nth node to remove
			// special treatment for first and last nodes
			if (n == 1) return removeFromHead();
			if (n == length) return removeFromTail();
			// removal of nth node which has nodes in front and behind
			Q4_ListNode current = head;
			Q4_ListNode previous = null;
			for (int i = 1; i < n; i++) { // current will point to nth node
				previous = current;
				current = current.getNext();
			}
			// data to be returned
			item = current.getData();
			// remove the node by adjusting two pointers (object reference)
			previous.setNext(current.getNext());
		}
		length--;
		return item;
	}

	public void add(int n, Object item) {
		// special treatment for insert as first node
		if (n == 1) {
			addToHead(item);
			return;
		}
		// special treatment for insert as last node
		if (n > length) {
			addToTail(item);
			return;
		}
		// locate the n-1th node
		Q4_ListNode current = head;
		for (int i = 1; i < n-1; i++)	// current will point to n-1th node
			current = current.getNext();
		// create new node and insert at nth position
		current.setNext(new Q4_ListNode(item, current.getNext()));
		length++;
	}

	public Object get(int n) {
		// n is too big, no item can be returned
		if (length < n) return null;
		// locate the nth node
		Q4_ListNode current = head;
		for (int i = 1; i < n; i++)
			current = current.getNext();
		return current.getData();
	}

} // class LinkedList