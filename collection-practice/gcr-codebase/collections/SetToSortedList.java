import java.util.*;
public class SetToSortedList {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(3,2,4,1));
		List<Integer> li = new ArrayList<>(set);
		Collections.sort(li);
		System.out.println(li);		
	}
}
