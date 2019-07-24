package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;


public class Dodgems extends Attraction implements IReviewed, ITicketed {


    public Dodgems(String name, int rating, double price, int agelimit) {
        super(name, rating, price, agelimit);

    }

    @Override
    public void reviewed(int rating) {

    }

    @Override
    public void ticket(double price) {

    }
}
