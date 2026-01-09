class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }
}

class TicketCircularList {
    private TicketNode head;
    private TicketNode tail;
    private int count = 0;

    void addTicket(int id, String customer, String movie, String seat, String time) {
        TicketNode node = new TicketNode(id, customer, movie, seat, time);
        if (head == null) {
            head = tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        count++;
    }

    void removeTicket(int id) {
        if (head == null) return;

        TicketNode curr = head;
        TicketNode prev = tail;

        do {
            if (curr.ticketId == id) {
                if (curr == head && curr == tail) {
                    head = tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head) head = curr.next;
                    if (curr == tail) tail = prev;
                }
                count--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void displayTickets() {
        if (head == null) {
            System.out.println("No Tickets Booked");
            return;
        }
        TicketNode temp = head;
        do {
            printTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByCustomer(String customer) {
        if (head == null) return;
        TicketNode temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(customer)) {
                printTicket(temp);
            }
            temp = temp.next;
        } while (temp != head);
    }

    void searchByMovie(String movie) {
        if (head == null) return;
        TicketNode temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                printTicket(temp);
            }
            temp = temp.next;
        } while (temp != head);
    }

    int totalTickets() {
        return count;
    }

    private void printTicket(TicketNode t) {
        System.out.println(
                t.ticketId + " | " +
                t.customerName + " | " +
                t.movieName + " | " +
                t.seatNumber + " | " +
                t.bookingTime
        );
    }
}

public class OnlineTicketReservation {
    public static void main(String[] args) {
        TicketCircularList system = new TicketCircularList();

        system.addTicket(101, "Ankit", "Inception", "A10", "10:30 AM");
        system.addTicket(102, "Rahul", "Avatar", "B05", "10:35 AM");
        system.addTicket(103, "Neha", "Inception", "A11", "10:40 AM");

        system.displayTickets();
        System.out.println();

        system.searchByMovie("Inception");
        System.out.println();

        system.removeTicket(102);
        system.displayTickets();
        System.out.println();

        System.out.println("Total Booked Tickets: " + system.totalTickets());
    }
}
