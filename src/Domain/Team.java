package Domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Team {

    private String name;
    private int foundationYear;
    private String stadiumName;
    private int stadiumCap;
    private Map<String, Player> playersHashMap;
    private List<Player> playersList;

    public Team(String name, int foundationYear, String stadiumName, int stadiumCap) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.stadiumName = stadiumName;
        this.stadiumCap = stadiumCap;
        this.playersHashMap = new HashMap<>();
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

    public Map<String, Player> getPlayersHashMap() {
        return playersHashMap;
    }

    public List<Player> getPlayersList() {
        return playersList;
    }
}
