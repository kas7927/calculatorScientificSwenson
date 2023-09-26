import java.util.Scanner;
//import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, result;

        System.out.print("Enter your number: ");
        num1 = scanner.nextDouble(); //volume

        System.out.print("Enter your conversion (Example being liters to milliliters): ");
        String conversion = scanner.next();

        switch (conversion) {
            case "liters to milliliters":
                result = num1 * 1000;
                System.out.println("Result: " + result);
                break;

            case "milliliters to liters":
                result = num1 / 1000;
                System.out.println("Result" + result);
                break;

            case "tablespoons to teaspoons":
                result = num1 * 3;
                System.out.println("Result" + result);
                break;

            case "teaspoons to tablespoons":
                result = num1 / 3;
                System.out.println("Result" + result);
                break;

        }
    }
}