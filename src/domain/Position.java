package domain;

import java.util.ArrayList;
import java.util.Arrays;

public enum Position {
    GOALKEEPER("GK"),
    DEFENDER("DEF"),
    MIDFIELDER("MID"),
    FORWARD("FW");

    private String label;

    Position(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }

    public static ArrayList<Position> getPositions(){
        ArrayList<Position> positions = new ArrayList<Position>();
        positions.addAll(Arrays.asList(Position.values()));

        return positions;
    }

    public static void displayPositions(){
        ArrayList<Position> positions = getPositions();
        int i=1;
        for(Position position : positions){
            System.out.println(i + ". " + position.toString());
            i++;
        }
    }
}
