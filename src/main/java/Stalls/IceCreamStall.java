package Stalls;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class IceCreamStall extends Stall implements ITicketed {

    public IceCreamStall(String stallName, String stallOwnerName, int parkingSpot, int rating) {
        super(stallName, stallOwnerName, parkingSpot, rating);
    }

    @Override
    public double defaultprice() {
        return 2.80;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        return defaultprice();
    }
}
