package Attractions;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttractionsTest {

    Dodgem dodgem;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void before(){
        dodgem = new Dodgem("Dodgem", 2);
        park = new Park("Park", 3);
        playground = new Playground("Playground", 4);
        rollerCoaster = new RollerCoaster("Rollercoaster", 2);
        visitor = new Visitor(16, 189, 25);
    }

    @Test
    public void hasName(){
        assertEquals("Dodgem", dodgem.getAttractionName());
        assertEquals("Park", park.getAttractionName());
        assertEquals("Playground", playground.getAttractionName());
        assertEquals("Rollercoaster", rollerCoaster.getAttractionName());
    }

    @Test
    public void hasRating(){
        assertEquals(2, dodgem.getAttractionRating());
        assertEquals(3, park.getAttractionRating());
        assertEquals(4, playground.getAttractionRating());
        assertEquals(2, rollerCoaster.getAttractionRating());
    }

    @Test
    public void canBuyTicket(){

    }


}
