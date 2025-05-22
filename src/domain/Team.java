package domain;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private int foundationYear;
    private String stadiumName;
    private int stadiumCap;
    private List<Player> playersList;



    public Team(String name, int foundationYear, String stadiumName, int stadiumCap) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.stadiumName = stadiumName;
        this.stadiumCap = stadiumCap;
        this.playersList = new ArrayList<>();
    }

    public Team(){
        this.playersList = new ArrayList<>();
    }



    public String getName() {
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public int getStadiumCap() {
        return stadiumCap;
    }

    public List<Player> getPlayersList() {
        return playersList;
    }
}
