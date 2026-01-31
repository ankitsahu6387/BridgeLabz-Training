package junit_testing;

import java.util.List;

public class ListManager {
	//add
	public void addElement(List<Integer> list, int element) {
		list.add(element);
	}
	//remove
	public void removeElement(List<Integer> list, int element) {
		list.remove(Integer.valueOf(element));
	}
	//get size
	public int getSize(List<Integer> list) {
		return list.size();
	}
	
}
