package entities;

public class Car {
    private String carName = "DEFAULT CAR";
    private String carNumber = "DEFAULT NUMBER";
    private ParkingPlace parking = null;

    public Car(String name, String number){
        setCarName(name);
        setCarNumber(number);
    }
    public void toParking(ParkingPlace parking){
        parking.addCarToParking(this);
        this.parking = parking;
    }
    public void fromParking(ParkingPlace parking){
        parking.removeCarFromParking(this);
        this.parking = null;
    }
    public void setParking(ParkingPlace parking) {
        this.parking = parking;
    }
    public ParkingPlace getParking(){ return parking; }
    public String getCarName() { return carName; }
    public void setCarName(String carName) { this.carName = carName; }
    public String getCarNumber() { return carNumber; }
    public void setCarNumber(String carNumber) {
        if (carNumber.length() == 6) {
            this.carNumber = carNumber;
        }
        else{
            this.carNumber = "A000AA";
            System.err.println("WRONG NUMBER");
        }
    }
}
