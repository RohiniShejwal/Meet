package Queue;

import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> q= new PriorityQueue<>();
		q.add(10);
		q.add(30);
		q.add(45);
		q.add(12);
		q.offer(56); 
		q.offer(34);
		q.offer(89);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}
}
