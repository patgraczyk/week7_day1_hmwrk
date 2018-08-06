package Attractions;

import Visitors.Visitor;

public class Park extends Attraction{

    public Park(String attractionName, int rating) {
        super(attractionName, rating);
    }

//    read the advanced extensions too late, so had to implement with the price 0
    @Override
    public double defaultprice() {
        return 0;
    }

    @Override
    public double priceForVisitor(Visitor visitor) {
        return 0;
    }

    @Override
    public int getRating(int rating) {
        return 0;
    }

    @Override
    public String getName(String name) {
        return "Park";
    }
}
