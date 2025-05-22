package ui;

import domain.Position;
import util.Validator;

import java.util.ArrayList;
import java.util.Scanner;

public class Ui {

    private final Scanner sc;

    public Ui(Scanner scanner) {
        this.sc = scanner;
    }



    public void mainMenu() {
        int choice;
        do{
            System.out.println("--- Football Manager ---");
            System.out.println("1. Players");
            System.out.println("2. Teams");
            System.out.println("3. Leagues");
            System.out.println("0. Exit");

            choice = Validator.getValidChoice(3);

            switch(choice){
                case 1: playerMenu(); break;
                case 2: teamMenu(); break;
                case 3: leagueMenu(); break;
                case 0: System.out.println("Goodbye!");
            }
        }
        while(choice != 0);



    }

    public void playerMenu() {
        int choice = -1;
        while(choice != 0) {
            System.out.println("--- Football Manager ---");
            System.out.println("1. Add player");
            System.out.println("2. Remove player");
            System.out.println("3. List all players");
            System.out.println("0. Back");

            choice = Validator.getValidChoice(3);

            switch(choice){
                case 1: addPlayerMenu(); break;
                case 2: break;
                case 3: break;
                case 0: break;
            }

        }
    }

    public void teamMenu() {
        int choice = -1;
        while(choice != 0){
            System.out.println("--- Football Manager ---");
            System.out.println("1. Add team");
            System.out.println("2. Remove team");
            System.out.println("3. List all teams");
            System.out.println("0. Back");

            choice = Validator.getValidChoice(3);

            switch(choice){
                case 1:
                case 2:
                case 3:
                case 0: break;
            }
        }
    }

    public void leagueMenu() {
        int choice = -1;
        while(choice != 0){
            System.out.println("--- Football Manager ---");
            System.out.println("1. Add league");
            System.out.println("2. Remove league");
            System.out.println("3. List all leagues");
            System.out.println("0. Back");

            choice = Validator.getValidChoice(3);

            switch(choice){
                case 1:
                case 2:
                case 3:
                case 0: break;
            }

        }
    }

    public void addPlayerMenu() {
        String name = Validator.getValidName(sc);
        int age = Validator.getValidAge(sc);
        int height = Validator.getValidHeight(sc);
        double weight = Validator.getValidWeight(sc);
        int rating = Validator.getValidRating(sc);


        Position.displayPositions();
        System.out.println("Choose the position you would like to add: ");
        Validator.getValidChoice(Position.getPositions().size());


    }

}
