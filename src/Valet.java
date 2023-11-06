public class Valet implements HotelService{
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    private String pickUpVehicle(String plateNumber) {
        return "Valet has taken the car with the license plate number of " + plateNumber + "!";
    }

    @Override
    public String provideService() {
        return pickUpVehicle(plateNumber);
    }
}

