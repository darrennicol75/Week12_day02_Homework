package stalls;


import behaviours.IReviewed;
import behaviours.ISecurity;

public class TobaccoStall extends Stall implements IReviewed, ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating, int agelimit) {
        super(name, ownerName, parkingSpot, rating, agelimit);
    }

    @Override
    public void reviewed(int rating) {

    }

    @Override
    public void TobaccoStall() {

    }


}

