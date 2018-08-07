package Attractions;

import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Visitors.Visitor;

public abstract class Attraction implements ITicketed, IReviewed {

    protected double attractionPrice;
    protected String attractionName;
    protected int rating;

    public Attraction(String attractionName, int rating, double attractionPrice) {
        this.attractionName = attractionName;
        this.rating = rating;
        this.attractionPrice = attractionPrice;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public int getAttractionRating(){
        return rating;
    }

    public boolean visit(Visitor visitor) {
        return true;
    }

    public double getPrice() {return attractionPrice; }

}
