
import java.time.LocalTime;

public class ParkingPlace {
    private String parkingName;
    private int maxCount = 10;
    private int count = 0;
    private Transport[] parkingTransports = new Transport[maxCount];
    private LocalTime openTime = LocalTime.of(6, 00, 00, 00);
    private LocalTime closeTime = LocalTime.of(23, 00, 00, 00);
    public ParkingPlace(String name) {
        setParkingName(name);
    }
    public void addTransportToParking(Transport transport) {
        if (LocalTime.now().isBefore(closeTime) && LocalTime.now().isAfter(openTime)) {
            if (count < maxCount) {
                int i = 0;
                while (parkingTransports[i] != null) {
                    i++;
                }
                parkingTransports[i] = transport;
                transport.setParking(this);
                System.out.println(transport.getTransportName() + " " + transport.getTransportNumber() + " parked in parking lot <" + getParkingName() + " " + i + ">");
                count++;

            } else {
                System.err.println("Parking " + getParkingName() + "  is full");
            }
        }
            else{
                System.err.println("Parking " + getParkingName() + " does not work");
            }
        }

    public void removeCarFromParking(Transport transport) {
        if (LocalTime.now().isBefore(closeTime) && LocalTime.now().isAfter(openTime)) {
            for (int i = 0; i < count; i++) {
                if (parkingTransports[i] == transport) {
                    parkingTransports[i] = null;
                    transport.setParking(null);
                    System.out.println(transport.getTransportName() + " " + transport.getTransportNumber() + " removed from parking lot <" + getParkingName() + " " + i + ">");
                }
                count--;
            }
        } else {
            System.err.println("Parking " + getParkingName() + " does not work");
        }
    }
    public String getParkingName() {
        return parkingName;
    }
    public void setParkingName(String parkingName) {
        this.parkingName = parkingName;
    }

}
