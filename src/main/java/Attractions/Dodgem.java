package Attractions;

import Interfaces.ITicketed;
import Visitors.Visitor;

public class Dodgem extends Attraction  {

    public Dodgem(String attractionName, int rating) {
        super(attractionName, rating);
    }

    @Override
    public double defaultprice() {
        return 4.50;
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
