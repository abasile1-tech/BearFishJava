package org.example;

import java.util.ArrayList;

public class Bear {
    private final String name;
    private final ArrayList<Salmon> belly;

    public Bear(String name) {
        this.name = name;
        this.belly = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int foodCount() {
        return belly.size();
    }

    public void eat(Salmon salmon) {
        belly.add(salmon);
    }

    public void eatFishFromRiver(River river) {
        this.eat(river.removeFish());
    }
}
