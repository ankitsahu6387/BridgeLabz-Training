class ItemNode {
    int id;
    String name;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

class InventoryList {
    private ItemNode head;
    private int size = 0;

    void addAtBeginning(int id, String name, int quantity, double price) {
        ItemNode node = new ItemNode(id, name, quantity, price);
        node.next = head;
        head = node;
        size++;
    }

    void addAtEnd(int id, String name, int quantity, double price) {
        ItemNode node = new ItemNode(id, name, quantity, price);
        if (head == null) {
            head = node;
        } else {
            ItemNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
        }
        size++;
    }

    void addAtPosition(int pos, int id, String name, int quantity, double price) {
        if (pos <= 1) {
            addAtBeginning(id, name, quantity, price);
            return;
        }
        if (pos > size) {
            addAtEnd(id, name, quantity, price);
            return;
        }
        ItemNode node = new ItemNode(id, name, quantity, price);
        ItemNode temp = head;
        for (int i = 1; i < pos - 1; i++) temp = temp.next;
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    void removeById(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            size--;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            if (temp.next.id == id) {
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }
    }

    void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.id == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
    }

    void searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                printItem(temp);
            }
            temp = temp.next;
        }
    }

    void displayTotalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
    }

    void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
    }

    private ItemNode mergeSort(ItemNode node, boolean asc, boolean byName) {
        if (node == null || node.next == null) return node;

        ItemNode mid = getMiddle(node);
        ItemNode nextMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(node, asc, byName);
        ItemNode right = mergeSort(nextMid, asc, byName);

        return merge(left, right, asc, byName);
    }

    private ItemNode merge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (byName) {
            condition = asc ? a.name.compareToIgnoreCase(b.name) <= 0
                            : a.name.compareToIgnoreCase(b.name) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        ItemNode result;
        if (condition) {
            result = a;
            result.next = merge(a.next, b, asc, byName);
        } else {
            result = b;
            result.next = merge(a, b.next, asc, byName);
        }
        return result;
    }

    private ItemNode getMiddle(ItemNode node) {
        ItemNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void displayAll() {
        ItemNode temp = head;
        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }

    private void printItem(ItemNode i) {
        System.out.println(i.id + " | " + i.name + " | " + i.quantity + " | " + i.price);
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();

        inventory.addAtEnd(101, "Laptop", 5, 55000);
        inventory.addAtBeginning(102, "Mouse", 20, 500);
        inventory.addAtPosition(2, 103, "Keyboard", 10, 1500);

        inventory.displayAll();
        System.out.println();

        inventory.updateQuantity(101, 7);
        inventory.searchByName("Laptop");
        System.out.println();

        inventory.sortByPrice(true);
        inventory.displayAll();
        System.out.println();

        inventory.displayTotalValue();
    }
}
