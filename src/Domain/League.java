package Domain;

import java.util.*;

public class League {

    private String name;
    private Locale.IsoCountryCode country;
    private Map<String, Team> teamsHashpMap;
    private List<Team> teamsList;

    public League() {
        teamsHashpMap = new HashMap<>();
        teamsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Locale.IsoCountryCode getCountry() {
        return country;
    }

    public Map<String, Team> getTeamsHashpMap() {
        return teamsHashpMap;
    }

    public List<Team> getTeamsList() {
        return teamsList;
    }
}
