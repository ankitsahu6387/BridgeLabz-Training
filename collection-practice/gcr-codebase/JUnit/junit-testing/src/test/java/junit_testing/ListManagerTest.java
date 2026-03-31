package junit_testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;
public class ListManagerTest {
	ListManager manager = new ListManager();
	@Test
	public void testAddElement() {
		List<Integer> list = new ArrayList<>();
		manager.addElement(list, 10);
		manager.addElement(list, 20);
		assertEquals(2, manager.getSize(list));
		assertTrue(list.contains(10));
		
	}
	@Test
	public void testRemoveElement() {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
		manager.removeElement(list, 20);
		assertEquals(2, manager.getSize(list));
		assertFalse(list.contains(20));
	}
	@Test
	public void testGetSize() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
		assertEquals(3, manager.getSize(list));
	}
}
