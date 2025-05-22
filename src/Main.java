import domain.Position;
import domain.PreferedFoot;
import ui.Ui;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ui ui = new Ui(scanner);
        ui.mainMenu();


    }
}