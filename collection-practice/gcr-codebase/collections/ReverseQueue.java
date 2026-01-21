import java.util.*;
public class ReverseQueue {
	public static void reverseQ(Queue<Integer> q) {
		if(q.isEmpty()) return;
		int x = q.remove();
		reverseQ(q);
		q.add(x);			
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		reverseQ(queue);
		System.out.println(queue);		
	}
}
