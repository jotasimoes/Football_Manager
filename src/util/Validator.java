package util;

import java.util.Scanner;

public class Validator {

    private static Scanner sc = new Scanner(System.in);

    public static int getValidChoice(int choices){
        while(true){
            System.out.println("Please enter your choice: ");

            String input = sc.nextLine();

            try{
                int choice = Integer.parseInt(input);

                if(choice >= 0 && choice <= choices){
                    return choice;
                }else{
                    System.out.println("Choice must be between 0 and "+choices);
                }

            } catch(NumberFormatException e){
                System.out.println("Invalid choice!");
            }
        }
    }

    public static String getValidName(Scanner sc) {
        while(true) {
            System.out.println("Insert player's name: ");
            String name = sc.nextLine();

            if(!name.trim().isEmpty() && name.matches("[a-zA-ZáàâãéèêíìîóòôõúùûçÁÀÂÃÉÈÊÍÌÎÓÒÔÕÚÙÛÇ]+( [a-zA-ZáàâãéèêíìîóòôõúùûçÁÀÂÃÉÈÊÍÌÎÓÒÔÕÚÙÛÇ]+)*")) {
                return name;
            }
            else{
                System.out.println("Invalid name!");
            }
        }
    }

    public static int getValidAge(Scanner sc) {
        int age = 0;
        while(true) {
            System.out.println("Insert age: ");
            String input = sc.nextLine();

            try{
                age = Integer.parseInt(input);

                if(age >= 16 && age <= 45){
                    return age;

                }else{
                    System.out.println("Age must be between 16 and 45!");
                }

            } catch(Exception e) {
                System.out.println("Invalid age!");
            }


        }
    }

    public static int getValidHeight(Scanner sc) {
        int height = 0;
        while(true) {
            System.out.println("Insert height(in cm): ");
            String input = sc.nextLine();

            try{
                height = Integer.parseInt(input);

                if(height >= 147 && height <= 208){
                    return height;

                }else{
                    System.out.println("Height must be between 147 and 208!");
                }

            } catch(Exception e) {
                System.out.println("Invalid Height!");
            }
        }
    }

    public static double getValidWeight(Scanner sc) {
        double weight = 0;
        while(true) {
            System.out.println("Insert weight(in kg): ");
            String input = sc.nextLine();

            try{
                weight = Double.parseDouble(input);

                if(weight >= 55.0 && weight <= 152.0){
                    return weight;

                }else{
                    System.out.println("Weight must be between 55 and 152!");
                }

            } catch(Exception e) {
                System.out.println("Invalid Weight!");
            }
        }
    }

    public static int getValidRating(Scanner sc) {
        int rating = 0;

        while(true) {
            System.out.println("Insert rating: ");
            String input = sc.nextLine();

            try{
                rating = Integer.parseInt(input);

                if(rating <=99 && rating > 0){
                    return rating;

                } else{
                    System.out.println("Rating must be between 0 and 99!");
                }
            }
            catch(Exception e) {
                System.out.println("Invalid Rating!");
            }
        }



    }


}
