package service;

import domain.Team;

import java.util.HashMap;
import java.util.Map;

public class TeamManager {

    private Map<String, Team> teams;

    public TeamManager() {
        this.teams = new HashMap<>();
    }

    private void addTeam(Team team) {
        this.teams.put(team.getName().toLowerCase(), team);
    }

    private Team getTeam(String teamName) {
        return this.teams.get(teamName);
    }

    private boolean teamExists(String teamName) {
        return this.teams.containsKey(teamName.toLowerCase());
    }

    public void loadTeams() {

    }
}
