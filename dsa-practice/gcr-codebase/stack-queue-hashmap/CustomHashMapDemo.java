public class CustomHashMapDemo {

    static class MyHashMap<K, V> {
        // Node for separate chaining
        class Node {
            K key;
            V value;
            Node next;
            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        private int capacity = 16;
        private Node[] table;
        public MyHashMap() {
            table = new MyHashMap.Node[capacity];
        }
        // Hash function
        private int hash(K key) {
            return Math.abs(key.hashCode()) % capacity;
        }
        // PUT operation
        public void put(K key, V value) {
            int index = hash(key);
            Node head = table[index];
            while (head != null) {
                if (head.key.equals(key)) {
                    head.value = value; // update
                    return;
                }
                head = head.next;
            }
            Node newNode = new Node(key, value);
            newNode.next = table[index];
            table[index] = newNode;
        }
        // GET operation
        public V get(K key) {
            int index = hash(key);
            Node head = table[index];
            while (head != null) {
                if (head.key.equals(key)) {
                    return head.value;
                }
                head = head.next;
            }
            return null;
        }
        // REMOVE operation
        public void remove(K key) {
            int index = hash(key);
            Node head = table[index];
            Node prev = null;
            while (head != null) {
                if (head.key.equals(key)) {
                    if (prev == null)
                        table[index] = head.next;
                    else
                        prev.next = head.next;
                    return;
                }
                prev = head;
                head = head.next;
            }
        }
    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        System.out.println(map.get("A")); // 10
        System.out.println(map.get("B")); // 20
        map.remove("B");
        System.out.println(map.get("B")); // null
    }
}
