package attractions;

import behaviours.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating, double price, int agelimit) {
        super(name, rating, price, agelimit);
    }

    @Override
    public void reviewed(int rating) {

    }
}
