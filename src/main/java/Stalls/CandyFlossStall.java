package Stalls;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class CandyFlossStall extends Stall implements ITicketed {

    public CandyFlossStall(String stallName, String stallOwnerName, int parkingSpot, int rating) {
        super(stallName, stallOwnerName, parkingSpot, rating);
    }

    @Override
    public double defaultprice() {
        return 2.00;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        return defaultprice();
    }
}
