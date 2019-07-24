package stalls;

public abstract class Stall {

    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;
    private int rating;
    private int agelimit;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot, int rating, int agelimit) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
        this.agelimit = agelimit;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public int getRating(){ return rating; }

    public int getAgeLimit(){ return agelimit; }

}
