import java.util.*;
public class ReverseList {
	public static void reverseList(List<Integer> li) {
		int end = li.size()-1;
		int start = 0;
		while(start < end) {
			int temp = li.get(start);
			li.set(start, li.get(end));
			li.set(end, temp);
			start++;
			end--;
		}
		for(int i=0; i<li.size(); i++) {
			System.out.print(li.get(i)+" ");
		}
		System.out.println();
	}
	public static void reverseLinkedList(LinkedList<Integer> ll) {
		int llEnd = ll.size()-1;
		int llstart = 0;
		while(llstart < llEnd) {
			int temp = ll.get(llstart);
			ll.set(llstart, ll.get(llEnd));
			ll.set(llEnd, temp);
			llstart++;
			llEnd--;
		}
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		reverseList(li);
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(6);
		ll.add(7);
		ll.add(8);
		ll.add(9);
		ll.add(10);
		reverseLinkedList(ll);				
	}
}
