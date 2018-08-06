package Interfaces;

import Visitors.Visitor;

public interface ITicketed {

    double defaultprice();
    double priceForVisitor(Visitor visitor);

}

//ITicketed promises double defaultPrice() and double priceFor(Visitor)
