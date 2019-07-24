package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;

public class RollerCoaster  extends Attraction implements ITicketed, IReviewed {

    public RollerCoaster(String name, int rating, double price, int agelimit) {
        super(name, rating, price, agelimit);
    }


    @Override
    public void ticket(double price) {

    }

    @Override
    public void reviewed(int rating) {

    }
}
