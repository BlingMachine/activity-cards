package com.cs205activity.cards;

import jdk.dynalink.Operation;

import javax.naming.OperationNotSupportedException;

public interface Deck {

    void shuffle();
    void cut(int index);
    Card deal();
    Card turnover();
    int search(Card card);
    void newOrder();
    int size();

    default int newSize() throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }


}
