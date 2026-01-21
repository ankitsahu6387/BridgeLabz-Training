import java.util.*;
public class RotateListElements {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		Collections.rotate(li, -2);
		System.out.println(li);
	}
}
