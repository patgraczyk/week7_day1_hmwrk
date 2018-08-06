package Visitor;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVisitor {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(12,179,30);
    }

    @Test
    public void checkAge(){
        assertEquals(12, visitor.getAge());
    }

    @Test
    public void checkHeight(){
        assertEquals(179, visitor.getHeight());
    }

    @Test
    public void checkMoney(){
        assertEquals(30, visitor.getMoney());
    }
}
