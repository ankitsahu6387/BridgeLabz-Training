import java.util.*;
public class RemoveDuplicate {		

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(3);
		li.add(4);		
		List<Integer> unique = new ArrayList<>();
		for(int n: li) {
			if(!unique.contains(n)) unique.add(n);
		}
		System.out.println(unique);
	}
}
