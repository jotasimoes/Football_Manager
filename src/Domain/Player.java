package Domain;


public class Player extends Person {

    private int rating;
    private Position position;
    private PreferedFoot preferedFoot;
    private int jerseyNumber;
    private double marketValue;


    public Player(String name, int age, double height, Position position, int rating) {
        super(name, age, height);
        this.position = position;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public PreferedFoot getPreferedFoot() {
        return preferedFoot;
    }

    public Position getPosition() {
        return position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public double getMarketValue() {
        return marketValue;
    }
}
