import java.util.Scanner;

import static java.lang.System.*;

public class Car {


    String carName = "Hybrid";
    int fuelPerLiter = 30;   // 30 km per litre = 3 l for 100 km
    int fuelTank = 0;
    int reFuelTank;
    int distance = 100;

    Scanner scanner = new Scanner(System.in);

    public Car() {
    }
    public int addFuelTank() {
        reFuelTank = scanner.nextInt();
        return reFuelTank;
    }

    public int consumption() {
        return distance / fuelPerLiter;  // 3
    }

    public int fuelLeft() {
        return reFuelTank - consumption();
    }

    public void showCarController() {
        out.println(
                "Select one option from the given list: " + "\n" +
                        "1. Refuel your tank: " + "\n" +
                        "2. Check fuel left: " + "\n"

        );
        int userChoice = scanner.nextInt();
        switch (userChoice) {
            case 1:
                out.println("Insert amount of fuel litres: ");
                addFuelTank();
                out.println("Now you have fuel: " + reFuelTank + " litres");
                break;
            case 2:
                out.println("You have fuel left: " + fuelLeft());
                break;
            default:
                break;
        }
        showCarController();
    }

    @Override
    public String toString() {
        return "My car is: " + carName + "\n" +
                "Fuel consumption is: " + fuelPerLiter + " km per litre. " + "\n" +
                "Planned distance is: " + distance + " km" + "\n" +
                "Fuel left now is: " + fuelTank + "\n" +
                "========================================";

    }
}