package Attractions;

import Interfaces.ISecurity;
import Visitors.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String attractionName, int rating, double attractionPrice)
    { super(attractionName, rating, attractionPrice);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15) {
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
        return defaultprice();
    }


    @Override
    public int getRating(int rating) {
        return 0;
    }

    @Override
    public String getName(String name) {
        return "Playground";
    }
}
