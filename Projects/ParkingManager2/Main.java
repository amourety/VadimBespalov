public class Main {
    public static void main(String[] args) {
        ParkingPlace parking1 = new ParkingPlace("Parking #1");
        ParkingPlace parking2 = new ParkingPlace("Parking #2");
        Car car1 = new Car("MATIZ","G023QD");
        Car car3 = new Car("MATIZ","J111QD");
        Car car4 = new Car("MATIZ","B063QD");
        Car car5 = new Car("MATIZ","Q023SW");
        Car car2 = new Car("BMW", "A666AA");
        TractorBelorus tractorBelorus1 = new TractorBelorus("RZHAVII", "W444RR");
        Transport [] transports = {car1,car2,car3,car4,car5,tractorBelorus1};
        for (Transport t: transports){
            t.toParking(parking1);
        }

    }
}
