import java.util.*;
public class NthElementEnd {

	public static void main(String[] args) {
		LinkedList<Character> ll = new LinkedList<>();
		ll.add('A');	
		ll.add('B');
		ll.add('C'); 
		ll.add('D');
		int n=2;
		Iterator<Character> fast = ll.iterator();
		Iterator<Character> slow = ll.iterator();
		for(int i=0; i<n; i++) {
			if(fast.hasNext()) fast.next();
			else {
				System.out.println("n is larger than list size");
				return;
			}
		}
		while(fast.hasNext()) {
			fast.next();
			slow.next();
		}
		System.out.println("nth element from end is: " + slow.next());		
	}
}
