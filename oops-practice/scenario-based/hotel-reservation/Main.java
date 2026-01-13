public class Main {
    public static void main(String[] args) {
        try {
            Room room = new DeluxeRoom(101);
            Guest guest = new Guest("Ankit");
            Reservation reservation = new Reservation(guest, room, 3);

            HotelService service = new HotelService();

            service.checkIn(reservation);
            System.out.println("Total Bill: " + service.generateInvoice(reservation));
            service.checkOut(reservation);

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
