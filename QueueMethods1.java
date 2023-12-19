package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods1 {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList();
		q.add(10);
		q.add(30);
		q.add(45);
		q.add(12);
		q.offer(56);
		q.offer(34);
		q.offer(89);
		System.out.println(q);
		//q.clear();
		System.out.println("First element is:" + q.element());
		System.out.println("First element is:" +q.peek());
		System.out.println("Remove First element:" +q.remove());
		System.out.println("Updated elements are:" +q);
		System.out.println("Remove First element:" +q.remove(12));
		System.out.println("Updated elements are:" +q);
		System.out.println("Remove First element:" +q.poll());
		System.out.println("Updated elements are:" +q);
		System.out.println(q.size());
		System.out.println(q.isEmpty());
		System.out.println(q.hashCode());
		System.out.println(q.toString());
		System.out.println(q.getClass());
		System.out.println(q.toArray());
		
	}
}
