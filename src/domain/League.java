package domain;

import java.util.*;

public class League {

    private String name;
    private Locale.IsoCountryCode country;
    private List<Team> teamsList;

    public League(String name, Locale.IsoCountryCode country, List<Team> teamsList) {
        this.name = name;
        this.country = country;
        this.teamsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Locale.IsoCountryCode getCountry() {
        return country;
    }

    public List<Team> getTeamsList() {
        return teamsList;
    }
}
