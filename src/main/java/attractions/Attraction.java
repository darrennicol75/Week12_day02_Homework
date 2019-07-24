package attractions;

public abstract class Attraction {
    private String name;
    private int rating;
    private int visitCount;
    private double price;
    private int agelimit;

    public Attraction(String name, int rating, double price, int agelimit) {
        this.name = name;
        this.rating = rating;
        this.visitCount = 0;
        this.price = price;
        this.agelimit = agelimit;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public double getDefaultPrice(){
         return price;
    }

    public double getAgeLimit(){
        return agelimit;
    }
}
