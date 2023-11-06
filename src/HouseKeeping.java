public class HouseKeeping implements HotelService{
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    private String cleanRoom(int roomNumber) {
        return "The Room " + roomNumber + " has been completely cleaned!";
    }

    public String provideService() {
        return cleanRoom(roomNumber);
    }
}

