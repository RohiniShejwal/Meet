package Queue;

import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		q.offer(22);
		q.offer(89);
		q.offer(45);
		q.offer(34);
		q.offer(21);
		q.offer(47);
		q.offer(87);
		q.offer(99);
		q.offer(59);
		q.offer(48);
		q.offer(29);
		q.offer(77);
		System.out.println(q);
	}
}
