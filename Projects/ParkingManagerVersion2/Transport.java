/**
 * Created by amour on 24.10.2017.
 */
public class Transport {
    protected String transportName = "DEFAULT TRANSPORT";
    protected String transportNumber = "DEFAULT NUMBER";
    protected ParkingPlace parking = null;

    public Transport(String transportName, String transportNumber) {
        this.transportName = transportName;
        this.transportNumber = transportNumber;
    }

    public String getTransportName() {
        return transportName;
    }
    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }
    public String getTransportNumber() {
        return transportNumber;
    }
    public void setTransportNumber(String transportNumber) {
        this.transportNumber = transportNumber;
    }
    public ParkingPlace getParking() {
        return parking;
    }

    public void setParking(ParkingPlace parking) {
        this.parking = parking;
    }
    public void toParking(ParkingPlace parking){
        parking.addTransportToParking(this);
        this.parking = parking;
    }
    public void fromParking(ParkingPlace parking) {
        parking.removeCarFromParking(this);
        this.parking = null;
    }
}
