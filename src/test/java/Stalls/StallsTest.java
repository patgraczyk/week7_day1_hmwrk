package Stalls;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StallsTest {
    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy Floss Stall", "Mr Grumpy", 5, 7);
        iceCreamStall = new IceCreamStall("Ice Cream Stall", "Mr Happy", 4, 3);
        tobaccoStall = new TobaccoStall("Tobacco Stall", "Mr Busy", 2, 5);
    }

    @Test
    public void hasStallName(){
        assertEquals("Candy Floss Stall", candyFlossStall.getName());
        assertEquals("Ice Cream Stall", iceCreamStall.getName());
        assertEquals("Tobacco Stall", tobaccoStall.getName());
    }

    @Test
    public void hasStallOwner(){
        assertEquals("Mr Grumpy", candyFlossStall.getOwnerName());
        assertEquals("Mr Happy", iceCreamStall.getOwnerName());
        assertEquals("Mr Busy", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSlot(){
        assertEquals(5, candyFlossStall.getParkingSpot());
        assertEquals(4, iceCreamStall.getParkingSpot());
        assertEquals(2, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(7, candyFlossStall.getRating());
        assertEquals(3, iceCreamStall.getRating());
        assertEquals(5, tobaccoStall.getRating());
    }


}
