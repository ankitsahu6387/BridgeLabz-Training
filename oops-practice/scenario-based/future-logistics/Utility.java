public class Utility {

    public static GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");

        String transportId = data[0];
        String transportDate = data[1];
        int transportRating = Integer.parseInt(data[2]);
        String transportType = data[3];

        if (transportType.equalsIgnoreCase("BrickTransport")) {
            float brickSize = Float.parseFloat(data[4]);
            int brickQuantity = Integer.parseInt(data[5]);
            float brickPrice = Float.parseFloat(data[6]);

            return new BrickTransport(transportId, transportDate, transportRating,
                    brickSize, brickQuantity, brickPrice);
        }

        if (transportType.equalsIgnoreCase("TimberTransport")) {
            float timberLength = Float.parseFloat(data[4]);
            float timberRadius = Float.parseFloat(data[5]);
            String timberType = data[6];
            float timberPrice = Float.parseFloat(data[7]);

            return new TimberTransport(transportId, transportDate, transportRating,
                    timberLength, timberRadius, timberType, timberPrice);
        }

        return null;
    }

    public static boolean validateTransportId(String transportId) {
        return transportId.matches("RTS\\d{3}[A-Z]");
    }

    public static String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof TimberTransport)
            return "TimberTransport";
        else
            return "BrickTransport";
    }

    public static float getVehiclePrice(String vehicle) {
        if (vehicle.equalsIgnoreCase("Truck"))
            return 1000;
        if (vehicle.equalsIgnoreCase("Lorry"))
            return 1700;
        return 3000;
    }
}