package domain;

public class Player extends Person {

    private int rating;
    private Position position;
    private PreferedFoot preferedFoot;
    private double marketValue;

    private Team team;
    private int jerseyNumber;


    public static final Team FREE_AGENT = new Team();

    public Player(String name, int age, int height,double weight, int rating, Position position,PreferedFoot preferedFoot, double marketValue,Team team, int  jerseyNumber) {
        super(name, age, height, weight);
        this.rating = rating;
        this.position = position;
        this.preferedFoot = preferedFoot;
        this.marketValue = marketValue;

        this.team = team;
        this.jerseyNumber = jerseyNumber;

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
