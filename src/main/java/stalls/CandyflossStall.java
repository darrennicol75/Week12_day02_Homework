package stalls;

import behaviours.IReviewed;

public class CandyflossStall extends Stall implements IReviewed {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot, int rating, int agelimit) {
        super(name, ownerName, parkingSpot, rating, agelimit);
    }

    @Override
    public void reviewed(int rating) {

    }
}
