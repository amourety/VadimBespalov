/**
 * Created by amour on 24.10.2017.
 */
public class TractorBelorus extends Transport {
    public TractorBelorus(String name, String number){
        super(name,number);
    }
    public void toParking(ParkingPlace parkingPlace){
        parkingPlace.addTransportToParking(this);
        this.parking = parkingPlace;
        System.out.println("TRACTOR BELORUS EEE BOY");
    }
}
