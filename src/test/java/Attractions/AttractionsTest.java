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
        dodgem = new Dodgem("Dodgem", 2, 4.50);
        park = new Park("Park", 3, 6.20);
        playground = new Playground("Playground", 4, 5.50);
        rollerCoaster = new RollerCoaster("Rollercoaster", 2, 3.50);
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
    public void hasPrice(){
        assertEquals(4.50, dodgem.getPrice(),0);
        assertEquals(6.20, park.getPrice(),0);
        assertEquals(5.50, playground.getPrice(), 0);
        assertEquals(3.50, rollerCoaster.getPrice(),0);
    }

    @Test
    public void getPriceFroVisitor(){

    }

}
