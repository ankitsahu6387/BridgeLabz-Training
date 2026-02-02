import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Goods Transport details as RTS120A:12/8/21:5:BrickTransport:6:800:40");
        String input = sc.nextLine();

        GoodsTransport gt = Utility.parseDetails(input);

        if (!Utility.validateTransportId(gt.getTransportId())) {
            System.out.println("Transport id " + gt.getTransportId() + " is invalid");
            System.out.println("Please provide a valid record");
            return;
        }

        String type = Utility.findObjectType(gt);

        System.out.println("\nTransporter id : " + gt.getTransportId());
        System.out.println("Date of transport : " + gt.getTransportDate());
        System.out.println("Rating of the transport : " + gt.getTransportRating());

        if (type.equals("BrickTransport")) {
            BrickTransport bt = (BrickTransport) gt;
            System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
            System.out.println("Brick price : " + bt.getBrickPrice());
        } else {
            TimberTransport tt = (TimberTransport) gt;
            System.out.println("Type of the timber : " + tt.getTimberType());
            System.out.println("Timber price per kilo : " + tt.getTimberPrice());
        }

        System.out.println("Vehicle for transport : " + gt.vehicleSelection());
        System.out.println("Total charge : " + gt.calculateTotalCharge());
    }
}