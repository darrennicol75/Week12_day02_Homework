package attractions;

import behaviours.IReviewed;

public class Playground extends Attraction implements IReviewed {

    public Playground(String name, int rating, double price, int agelimit) {
        super(name, rating, price, agelimit);
    }

    @Override
    public void reviewed(int rating) {

    }
}
