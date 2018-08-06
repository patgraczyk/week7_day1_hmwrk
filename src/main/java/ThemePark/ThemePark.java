package ThemePark;

import Attractions.Attraction;
import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Stalls.Stall;
import Visitors.Visitor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ThemePark {
    private ArrayList<IReviewed> reviewedItems;
    private ArrayList<ITicketed> ticketedItems;
    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark() {
        this.reviewedItems = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.attractions = new ArrayList<>();
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void addAttractions(Attraction attraction) {
        attractions.add(attraction);
    }

    public void addStalls(Stall stall) {
        stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed(){
//        reviewedItems.addAll((Collection<? extends IReviewed>) stalls);
        reviewedItems.addAll(attractions);
        return reviewedItems;
    }



//VISIT ATTRACTION - INCLUDE VISIT IN ATTRACTION

    public boolean visit(Visitor visitor, Attraction attraction){
        return attraction.visit(visitor);
    }

//    VIEW ITICKETED ITEMS THAT VISITOR CAN AFFORD :
//
// public ArrayList<ITicketed> getAllAlllowed(Visitor visitor){
// new array (items visitor can afford) --> write function in visitor
// for ticketed in ticketeditems
//        if visitor.afford = true
//        itemsvisitorcanafford.add(ticketeditem)
//        return ticketedItems
//    }


}
