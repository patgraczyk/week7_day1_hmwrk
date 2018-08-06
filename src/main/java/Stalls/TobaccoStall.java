package Stalls;

import Interfaces.ISecurity;
import Visitors.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String stallName, String stallOwnerName, int parkingSpot, int rating) {
        super(stallName, stallOwnerName, parkingSpot, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        } else {
            return false;
        }
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
