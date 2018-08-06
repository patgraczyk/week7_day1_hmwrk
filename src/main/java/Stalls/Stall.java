package Stalls;

public abstract class Stall {

    private String stallName;
    private String stallOwnerName;
    private int parkingSpot;

    public Stall(String stallName, String stallOwnerName, int parkingSpot) {
        this.stallName = stallName;
        this.stallOwnerName = stallOwnerName;
        this.parkingSpot = parkingSpot;
    }

//    NO TEST ON ABSTRACT CLASS

    public String getName() {
        return stallName;
    }

    public String getOwnerName() {
        return stallOwnerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }
}
