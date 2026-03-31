public class HotelService {

    PricingStrategy pricingStrategy = new SeasonalPricing();

    public void checkIn(Reservation reservation) throws RoomNotAvailableException {
        if (!reservation.room.available) {
            throw new RoomNotAvailableException("Room is not available");
        }
        reservation.room.available = false;
        System.out.println("Check-in successful for " + reservation.guest.getName());
    }

    public double generateInvoice(Reservation reservation) {
        return pricingStrategy.calculatePrice(
                reservation.room.basePrice,
                reservation.days
        );
    }

    public void checkOut(Reservation reservation) {
        reservation.room.available = true;
        System.out.println("Check-out successful for " + reservation.guest.getName());
    }
}
