package assignment;

import assignment.Q7_miscLib.GenLib;
import assignment.Q7_miscLib.SimpleInput;

public class Q7_TestQueue {

    public static void main(String[] args) {
		Q7_ListQueue q = new Q7_ListQueue();
//		ArrayQueue q = new ArrayQueue(20);
		byte barray[] = new byte[20];
		int n;
		do {
			n = SimpleInput.getInteger("How many to enqueue? ");
			for (int i = 0; i < n; i++) {
				q.enqueue(new Integer(GenLib.genInt(1, 100)));
				System.out.println(q);
			}
			n = SimpleInput.getInteger("How many to dequeue? ");
			for (int i = 0; i < n; i++) {
				if (q.empty()) {
					System.out.println("Queue is now empty, dequeue ignored.");
					break;
				} else {
					System.out.println("dequeued:"+q.dequeue());
					System.out.println(q);
				}
			}
		} while (SimpleInput.getChar("more (y/n)? ") == 'y');

		System.out.println("Bye now.");
		System.exit(0);
    }

} 