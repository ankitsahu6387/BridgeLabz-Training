import java.util.*;

class ProcessNode {
    int pid;
    int burst;
    int remaining;
    int waiting;
    int turnaround;
    ProcessNode next;

    ProcessNode(int pid, int burst) {
        this.pid = pid;
        this.burst = burst;
        this.remaining = burst;
    }
}

class RoundRobinScheduler {
    private ProcessNode head;
    private ProcessNode tail;
    private int size = 0;
    private List<ProcessNode> finished = new ArrayList<>();

    void addProcess(int pid, int burst) {
        ProcessNode node = new ProcessNode(pid, burst);
        if (head == null) {
            head = tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }

    void execute(int quantum) {
        if (head == null) return;

        ProcessNode curr = head;

        while (size > 0) {
            int timeUsed = Math.min(curr.remaining, quantum);
            curr.remaining -= timeUsed;

            ProcessNode temp = head;
            do {
                if (temp != curr && temp.remaining > 0) {
                    temp.waiting += timeUsed;
                }
                temp = temp.next;
            } while (temp != head);

            if (curr.remaining == 0) {
                curr.turnaround = curr.waiting + curr.burst;
                finished.add(curr);
                int pid = curr.pid;
                curr = curr.next;
                remove(pid);
                displayQueue();
                continue;
            }

            curr = curr.next;
            displayQueue();
        }
    }

    private void remove(int pid) {
        if (head == null) return;

        ProcessNode curr = head;
        ProcessNode prev = tail;

        do {
            if (curr.pid == pid) {
                if (curr == head && curr == tail) {
                    head = tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head) head = curr.next;
                    if (curr == tail) tail = prev;
                }
                size--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void displayQueue() {
        if (head == null) {
            System.out.println("Queue Empty\n");
            return;
        }
        ProcessNode temp = head;
        do {
            System.out.println("P" + temp.pid + " Remaining: " + temp.remaining);
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    void displayAverageTimes() {
        double wt = 0, tat = 0;
        for (ProcessNode p : finished) {
            wt += p.waiting;
            tat += p.turnaround;
        }
        System.out.println("Average Waiting Time: " + wt / finished.size());
        System.out.println("Average Turnaround Time: " + tat / finished.size());
    }
}

public class RoundRobinScheduling {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10);
        scheduler.addProcess(2, 5);
        scheduler.addProcess(3, 8);

        scheduler.execute(3);
        scheduler.displayAverageTimes();
    }
}
