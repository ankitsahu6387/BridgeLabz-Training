import java.util.*;
public class ElementFrequency {
	public static void countFrequency(List<String> li) {
		Map<String, Integer> map = new HashMap<>();
		for(String str : li) {
			if(map.containsKey(str)) map.put(str, map.get(str)+1);
			else map.put(str, 1);
		}
		
		System.out.println(map);
	}

	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("apple");
		li.add("banana");
		li.add("apple");
		li.add("orange");
		li.add("orange");
		countFrequency(li);
	}

}
