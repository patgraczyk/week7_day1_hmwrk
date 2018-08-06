package Attractions;

import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Visitors.Visitor;

public abstract class Attraction implements ITicketed, IReviewed {

    protected String attractionName;
    protected int rating;

    public Attraction(String attractionName, int rating) {
        this.attractionName = attractionName;
        this.rating = rating;
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
}
