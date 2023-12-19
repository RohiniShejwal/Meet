package Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class QueueConst4 {

	public static void main(String[] args) {
		
		ArrayList q = new ArrayList();
		q.add(22);
		q.add(89);
		q.add(45);
		q.add(34);
		q.add(21);
		q.add(47);
		q.add(87);
		q.add(99);
		q.add(59);
		System.out.println(q);
		
		PriorityQueue q1 = new PriorityQueue(q);
		System.out.println(q1);


	}
}
