package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {

	public static void main(String[] args) {
		
		// Deque (Double Ended Queue): A deque is a linear collection that 
		//supports insertion and deletion of elements from both the ends. 
		
		Deque<Integer> d = new ArrayDeque<>();
		d.add(3);
		d.add(7);
		d.add(9);
		d.addLast(4);
		d.addFirst(8);
		d.offerLast(11);
		d.offerFirst(1);
		System.out.println(d);
		d.addFirst(13);
		d.offerFirst(15);
		System.out.println(d);
        System.out.println(d.removeFirst());
        System.out.println(d);
        System.out.println(d.removeLast());
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
	}
}
