import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, result;
        int sourceUnit;

        System.out.println("Volume Conversions:");
        System.out.println("1. Milliliters to Liters");
        System.out.println("2. Milliliters to Teaspoons");
        System.out.println("3. Milliliters to Tablespoons");
        System.out.println("4. Milliliters to Fluid Ounces");
        System.out.println("5. Milliliters to Cups");
        System.out.println("6. Milliliters to Pints");
        System.out.println("7. Milliliters to Quarts");
        System.out.println("8. Milliliters to Gallons");
        System.out.println("9. Liters to Milliliters");
        System.out.println("10. Liters to Teaspoons");
        System.out.println("11. Liters to Tablespoons");
        System.out.println("12. Liters to Fluid Ounces");
        System.out.println("13. Liters to Cups");
        System.out.println("14. Liters to Pints");
        System.out.println("15. Liters to Quarts");
        System.out.println("16. Liters to Gallons");
        System.out.println("17. Teaspoons to Milliliters");
        System.out.println("18. Teaspoons to Liters");
        System.out.println("19. Teaspoons to Tablespoons");
        System.out.println("20. Teaspoons to Fluid Ounces");
        System.out.println("21. Teaspoons to Cups");
        System.out.println("22. Teaspoons to Pints");
        System.out.println("23. Teaspoons to Quarts");
        System.out.println("24. Teaspoons to Gallons");
        System.out.println("25. Tablespoons to Milliliters");
        System.out.println("26. Tablespoons to Liters");
        System.out.println("27. Tablespoons to Teaspoons");
        System.out.println("28. Tablespoons to Fluid Ounces");
        System.out.println("29. Tablespoons to Cups");
        System.out.println("30. Tablespoons to Pints");
        System.out.println("31. Tablespoons to Quarts");
        System.out.println("32. Tablespoons to Gallons");
        System.out.println("33. Fluid Ounces to Milliliters");
        System.out.println("34. Fluid Ounces to Liters");
        System.out.println("35. Fluid Ounces to Teaspoons");
        System.out.println("36. Fluid Ounces to Tablespoons");
        System.out.println("37. Fluid Ounces to Cups");
        System.out.println("38. Fluid Ounces to Pints");
        System.out.println("39. Fluid Ounces to Quarts");
        System.out.println("40. Fluid Ounces to Gallons");
        System.out.println("41. Cups to Milliliters");
        System.out.println("42. Cups to Liters");
        System.out.println("43. Cups to Teaspoons");
        System.out.println("44. Cups to Tablespoons");
        System.out.println("45. Cups to Fluid Ounces");
        System.out.println("46. Cups to Pints");
        System.out.println("47. Cups to Quarts");
        System.out.println("48. Cups to Gallons");
        System.out.println("49. Pints to Milliliters");
        System.out.println("50. Pints to Liters");
        System.out.println("51. Pints to Teaspoons");
        System.out.println("52. Pints to Tablespoons");
        System.out.println("53. Pints to Fluid Ounces");
        System.out.println("54. Pints to Cups");
        System.out.println("55. Pints to Quarts");
        System.out.println("56. Pints to Gallons");
        System.out.println("57. Quarts to Milliliters");
        System.out.println("58. Quarts to Liters");
        System.out.println("59. Quarts to Teaspoons");
        System.out.println("60. Quarts to Tablespoons");
        System.out.println("61. Quarts to Fluid Ounces");
        System.out.println("62. Quarts to Cups");
        System.out.println("63. Quarts to Pints");
        System.out.println("64. Quarts to Gallons");
        System.out.println("65. Gallons to Milliliters");
        System.out.println("66. Gallons to Liters");
        System.out.println("67. Gallons to Teaspoons");
        System.out.println("68. Gallons to Tablespoons");
        System.out.println("69. Gallons to Fluid Ounces");
        System.out.println("70. Gallons to Cups");
        System.out.println("71. Gallons to Pints");
        System.out.println("72. Gallons to Quarts");
        System.out.println("73. Cubic Centimeters to Cubic Meters");
        System.out.println("74. Cubic Centimeters to Cubic Inches");
        System.out.println("75. Cubic Centimeters to Cubic Feet");
        System.out.println("76. Cubic Meters to Cubic Centimeters");
        System.out.println("77. Cubic Meters to Cubic Inches");
        System.out.println("78. Cubic Meters to Cubic Feet");
        System.out.println("79. Cubic Inches to Cubic Centimeter");
        System.out.println("80. Cubic Inches to Cubic Meters");
        System.out.println("81. Cubic Inches to Cubic Feet");
        System.out.println("82. Cubic Feet to Cubic Centimeters");
        System.out.println("83. Cubic Feet to Cubic Meters");
        System.out.println("84. Cubic Feet to Cubic Inches");


        System.out.print("Enter your source volume unit (1-84): ");
        sourceUnit = scanner.nextInt();

        System.out.print("Enter your source volume value: ");
        num1 = scanner.nextDouble(); //volume

        switch (sourceUnit) {
            case 1:
                result = num1 / 1000;
                System.out.println("Result: " + result);
                break;

            case 2:
                result = num1 / 4.929;
                System.out.println("Result: " + result);
                break;

            case 3:
                result = num1 / 14.787;
                System.out.println("Result: " + result);
                break;

            case 4:
                result = num1 / 29.574;
                System.out.println("Result: " + result);
                break;

            case 5:
                result = num1 / 240;
                System.out.println("Result: " + result);
                break;

            case 6:
                result = num1 / 473.2;
                System.out.println("Result: " + result);
                break;

            case 7:
                result = num1 / 946.4;
                System.out.println("Result: " + result);
                break;

            case 8:
                result = num1 / 3785;
                System.out.println("Result: " + result);
                break;

            case 9:
                result = num1 * 1000;
                System.out.println("Result: " + result);
                break;

            case 10:
                result = num1 * 202.9;
                System.out.println("Result: " + result);
                break;

            case 11:
                result = num1 * 67.628;
                System.out.println("Result: " + result);
                break;

            case 12:
                result = num1 / 33.814;
                System.out.println("Result: " + result);
                break;

            case 13:
                result = num1 * 4.167;
                System.out.println("Result: " + result);
                break;

            case 14:
                result = num1 * 2.113;
                System.out.println("Result: " + result);
                break;

            case 15:
                result = num1 * 1.057;
                System.out.println("Result: " + result);
                break;

            case 16:
                result = num1 / 3.785;
                System.out.println("Result: " + result);
                break;

            case 17:
                result = num1 * 4.929;
                System.out.println("Result: " + result);
                break;

            case 18:
                result = num1 / 202.9;
                System.out.println("Result: " + result);
                break;

            case 19:
                result = num1 / 3;
                System.out.println("Result: " + result);
                break;

            case 20:
                result = num1 / 6;
                System.out.println("Result: " + result);
                break;

            case 21:
                result = num1 / 48.692;
                System.out.println("Result: " + result);
                break;

            case 22:
                result = num1 / 96;
                System.out.println("Result: " + result);
                break;

            case 23:
                result = num1 / 192;
                System.out.println("Result: " + result);
                break;

            case 24:
                result = num1 / 768;
                System.out.println("Result: " + result);
                break;

            case 25:
                result = num1 * 14.787;
                System.out.println("Result: " + result);
                break;

            case 26:
                result = num1 / 67.628;
                System.out.println("Result: " + result);
                break;

            case 27:
                result = num1 * 3;
                System.out.println("Result: " + result);
                break;

            case 28:
                result = num1 / 2;
                System.out.println("Result: " + result);
                break;

            case 29:
                result = num1 / 16.231;
                System.out.println("Result: " + result);
                break;

            case 30:
                result = num1 / 32;
                System.out.println("Result: " + result);
                break;

            case 31:
                result = num1 / 64;
                System.out.println("Result: " + result);
                break;

            case 32:
                result = num1 / 256;
                System.out.println("Result: " + result);
                break;

            case 33:
                result = num1 * 29.574;
                System.out.println("Result: " + result);
                break;

            case 34:
                result = num1 / 33.814;
                System.out.println("Result: " + result);
                break;

            case 35:
                result = num1 * 6;
                System.out.println("Result: " + result);
                break;

            case 36:
                result = num1 * 2;
                System.out.println("Result: " + result);
                break;

            case 37:
                result = num1 / 8.115;
                System.out.println("Result: " + result);
                break;

            case 38:
                result = num1 / 16;
                System.out.println("Result: " + result);
                break;

            case 39:
                result = num1 / 32;
                System.out.println("Result: " + result);
                break;

            case 40:
                result = num1 / 128;
                System.out.println("Result: " + result);
                break;

            case 41:
                result = num1 * 240;
                System.out.println("Result: " + result);
                break;

            case 42:
                result = num1 / 4.167;
                System.out.println("Result: " + result);
                break;

            case 43:
                result = num1 * 48.692;
                System.out.println("Result: " + result);
                break;

            case 44:
                result = num1 * 16.231;
                System.out.println("Result: " + result);
                break;

            case 45:
                result = num1 * 8.115;
                System.out.println("Result: " + result);
                break;

            case 46:
                result = num1 / 1.972;
                System.out.println("Result: " + result);
                break;

            case 47:
                result = num1 / 3.943;
                System.out.println("Result: " + result);
                break;

            case 48:
                result = num1 / 15.772;
                System.out.println("Result: " + result);
                break;

            case 49:
                result = num1 * 473.2;
                System.out.println("Result: " + result);
                break;

            case 50:
                result = num1 / 2.113;
                System.out.println("Result: " + result);
                break;

            case 51:
                result = num1 * 96;
                System.out.println("Result: " + result);
                break;

            case 52:
                result = num1 * 32;
                System.out.println("Result: " + result);
                break;

            case 53:
                result = num1 * 16;
                System.out.println("Result: " + result);
                break;

            case 54:
                result = num1 * 1.972;
                System.out.println("Result: " + result);
                break;

            case 55:
                result = num1 / 2;
                System.out.println("Result: " + result);
                break;

            case 56:
                result = num1 / 8;
                System.out.println("Result: " + result);
                break;

            case 57:
                result = num1 * 946.4;
                System.out.println("Result: " + result);
                break;

            case 58:
                result = num1 / 1.057;
                System.out.println("Result: " + result);
                break;

            case 59:
                result = num1 * 192;
                System.out.println("Result: " + result);
                break;

            case 60:
                result = num1 * 64;
                System.out.println("Result: " + result);
                break;

            case 61:
                result = num1 * 32;
                System.out.println("Result: " + result);
                break;

            case 62:
                result = num1 * 3.943;
                System.out.println("Result: " + result);
                break;

            case 63:
                result = num1 * 2;
                System.out.println("Result: " + result);
                break;

            case 64:
                result = num1 / 4;
                System.out.println("Result: " + result);
                break;

            case 65:
                result = num1 * 3785;
                System.out.println("Result: " + result);
                break;

            case 66:
                result = num1 * 3.785;
                System.out.println("Result: " + result);
                break;

            case 67:
                result = num1 * 768;
                System.out.println("Result: " + result);
                break;

            case 68:
                result = num1 * 256;
                System.out.println("Result: " + result);
                break;

            case 69:
                result = num1 * 128;
                System.out.println("Result: " + result);
                break;

            case 70:
                result = num1 * 15.773;
                System.out.println("Result: " + result);
                break;

            case 71:
                result = num1 * 8;
                System.out.println("Result: " + result);
                break;

            case 72:
                result = num1 * 4;
                System.out.println("Result: " + result);
                break;

            case 73:
                result = num1 / 1e+6;
                System.out.println("Result: " + result);
                break;

            case 74:
                result = num1 / 16.387;
                System.out.println("Result: " + result);
                break;

            case 75:
                result = num1 / 28320;
                System.out.println("Result: " + result);
                break;

            case 76:
                result = num1 * 1e+6;
                System.out.println("Result: " + result);
                break;

            case 77:
                result = num1 * 61020;
                System.out.println("Result: " + result);
                break;

            case 78:
                result = num1 * 35.315;
                System.out.println("Result: " + result);
                break;

            case 79:
                result = num1 * 16.387;
                System.out.println("Result: " + result);
                break;

            case 80:
                result = num1 / 61020;
                System.out.println("Result: " + result);
                break;

            case 81:
                result = num1 / 1728;
                System.out.println("Result: " + result);
                break;

            case 82:
                result = num1 * 28320;
                System.out.println("Result: " + result);
                break;

            case 83:
                result = num1 / 35.315;
                System.out.println("Result: " + result);
                break;

            case 84:
                result = num1 * 1728;
                System.out.println("Result: " + result);
                break;


            default:
                System.out.println("Invalid conversion type.");

        }

        scanner.close();
    }
}