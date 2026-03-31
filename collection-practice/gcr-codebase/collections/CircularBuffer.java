class CircularBuffer {
    private int[] buffer;
    private int front, rear, size, capacity;

    CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    // Insert element (overwrite if full)
    void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % capacity;

        if (size < capacity) {
            size++;
        } else {
            // buffer full → overwrite oldest
            front = (front + 1) % capacity;
        }
    }

    // Display buffer elements in correct order
    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display(); // 1 2 3

        cb.insert(4);
        cb.display(); // 2 3 4
    }
}
