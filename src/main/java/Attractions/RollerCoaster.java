package Attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {


    public RollerCoaster(String attractionName, int rating, double attractionPrice) {
        super(attractionName, rating, attractionPrice);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double defaultprice() {
        return attractionPrice;
    }


    @Override
    public double priceForVisitor(Visitor visitor) {
        if (visitor.getHeight() >= 200) {
            return this.defaultprice() * 2;
        } else {
            return defaultprice();
        }
    }


    @Override
    public int getRating(int rating) {
        return 0;
    }

    @Override
    public String getName(String name) {
        return "Rollercoaster";
    }
}
