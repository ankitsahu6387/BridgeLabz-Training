class TaskNode {
    int id;
    String name;
    String priority;
    String dueDate;
    TaskNode next;

    TaskNode(int id, String name, String priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class CircularTaskList {
    private TaskNode head;
    private TaskNode current;
    private int size = 0;

    void addAtBeginning(int id, String name, String priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = node;
            node.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            node.next = head;
            temp.next = node;
            head = node;
        }
        size++;
    }

    void addAtEnd(int id, String name, String priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = node;
            node.next = head;
            current = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }
        size++;
    }

    void addAtPosition(int pos, int id, String name, String priority, String dueDate) {
        if (pos <= 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }
        if (pos > size) {
            addAtEnd(id, name, priority, dueDate);
            return;
        }
        TaskNode node = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    void removeById(int id) {
        if (head == null) return;

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.id == id) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                    current = head;
                } else {
                    prev.next = temp.next;
                }
                size--;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void viewCurrentTask() {
        if (current != null) {
            printTask(current);
            current = current.next;
        }
    }

    void displayAll() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            printTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(String priority) {
        if (head == null) return;
        TaskNode temp = head;
        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                printTask(temp);
            }
            temp = temp.next;
        } while (temp != head);
    }

    private void printTask(TaskNode t) {
        System.out.println(t.id + " | " + t.name + " | " + t.priority + " | " + t.dueDate);
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        CircularTaskList tasks = new CircularTaskList();

        tasks.addAtEnd(1, "Design Module", "High", "10-01-2026");
        tasks.addAtEnd(2, "Code Review", "Medium", "12-01-2026");
        tasks.addAtBeginning(3, "Requirement Analysis", "High", "08-01-2026");

        tasks.displayAll();
        System.out.println();

        tasks.viewCurrentTask();
        tasks.viewCurrentTask();
        System.out.println();

        tasks.searchByPriority("High");
        System.out.println();

        tasks.removeById(2);
        tasks.displayAll();
    }
}
