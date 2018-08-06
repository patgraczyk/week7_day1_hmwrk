package Interfaces;

import Visitors.Visitor;

public interface ISecurity {

    boolean isAllowedTo(Visitor visitor);
}


//    ISecurity promises boolean isAllowedTo(Visitor)

