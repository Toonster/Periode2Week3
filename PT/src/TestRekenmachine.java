import rekenen.*;
import rekenen.plugins.*;

import java.util.Scanner;

/**
 * PEER TUTORING
 * P2W3
 */
public class TestRekenmachine {
    private static Rekenmachine mijnCalc = new Rekenmachine();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Opgave 3.1

        mijnCalc.installeer(new Optelling());
        mijnCalc.installeer(new Aftrekking());
        mijnCalc.installeer(new Vermenigvuldiging());
        mijnCalc.installeer(new Deling());
        mijnCalc.installeer(new Macht());

        Plugin minimum = new Plugin() {
            @Override
            public String getCommand() {
                return "MIN";
            }

            @Override
            public double bereken(double x, double y) {
                return Math.min(x, y);
            }
        };

        Plugin maximum = new Plugin() {
            @Override
            public String getCommand() {
                return "MAX";
            }

            @Override
            public double bereken(double x, double y) {
                return Math.max(x, y);
            }
        };

        mijnCalc.installeer(minimum);
        mijnCalc.installeer(maximum);


        doeBerekeningEnDrukAf("+", 5, 2);
        doeBerekeningEnDrukAf("-", 5, 2);
        doeBerekeningEnDrukAf("*", 5, 2);
        doeBerekeningEnDrukAf("/", 5, 2);
        doeBerekeningEnDrukAf("^", 5, 2);
        doeBerekeningEnDrukAf("?", 5, 2);
        System.out.println(mijnCalc.toString());


        //Opgave 3.2

        System.out.println("Welkom bij de dynamische rekenmachine!");
        System.out.println(mijnCalc.toString());
        boolean isRunning = true;
        while (isRunning) {
            System.out.print("Welke berekening wenst U uit te voeren (<ENTER> om te stoppen)?: ");
            String command = input.nextLine();
            if (command.isEmpty()) {
                isRunning = false;
            } else {
                System.out.print("Geef twee getallen in (gescheiden door een spatie): ");
                String cijfersInput = input.nextLine();
                int eersteCijfer = Integer.parseInt(cijfersInput.substring(0, cijfersInput.indexOf(" ")));
                int tweedeCijfer = Integer.parseInt(cijfersInput.substring(cijfersInput.indexOf(" ") + 1));
                String berekeningAlsString = String.format("%.2f %s %.2f = %.2f\n", (double) eersteCijfer, command, (double) tweedeCijfer, mijnCalc.bereken(command, eersteCijfer, tweedeCijfer));
                System.out.println(berekeningAlsString);
                mijnCalc.addDateToLog();
                mijnCalc.addCalcToLog(berekeningAlsString);
            }
        }
        System.out.println(mijnCalc.getLog());
    }

    //Opgave 3.1
    private static void doeBerekeningEnDrukAf(String commando, double getal1, double getal2) {
        System.out.printf("%f %s %f = %f\n", getal1, commando, getal2, mijnCalc.bereken(commando, getal1, getal2));
    }
}
