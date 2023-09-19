package org.example;

import java.util.ArrayList;

public class River {
    private final ArrayList<Salmon> stock;

    public River() {
        stock = new ArrayList<>();
    }


    public void add(Salmon salmon) {
        stock.add(salmon);
    }

    public Salmon removeFish() {
        return stock.remove(stock.size() - 1);
    }

    public int getFishCount() {
        return stock.size();
    }
}
