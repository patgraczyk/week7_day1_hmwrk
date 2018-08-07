package Attractions;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class Dodgem extends Attraction  {


    public Dodgem(String attractionName, int rating, double attractionPrice) {
        super(attractionName, rating, attractionPrice);
    }

    @Override
    public double defaultprice() {
        return attractionPrice;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        if (visitor.getAge() <= 12) {
            return this.defaultprice() /2;
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
        return "Dodgem";
    }
}
