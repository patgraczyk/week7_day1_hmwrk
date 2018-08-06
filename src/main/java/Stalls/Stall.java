package Stalls;

import Interfaces.ITicketed;
import Visitors.Visitor;

public abstract class Stall implements ITicketed {

    private String stallName;
    private String stallOwnerName;
    private int parkingSpot;
    private int rating;

    public Stall(String stallName, String stallOwnerName, int parkingSpot, int rating) {
        this.stallName = stallName;
        this.stallOwnerName = stallOwnerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
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

    public int getRating() {return rating;}


}
