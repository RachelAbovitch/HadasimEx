import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        while (true) {
            System.out.print(
                    "\nHello:) \n for rectangle press 1. for triangular press 2. for EXIT press 3"
            );
            int userInput = sc.nextInt();
            if (userInput == 1) {
                rectangle(sc);
            } else if (userInput == 2) {
                triangle(sc);
            } else if (userInput == 3) {
                System.out.println("ByeBye");
                break;
            } else {
                System.out.println("invalid input. try again");
            }
        }
    }

    private static void rectangle(Scanner scanner) {
        System.out.print("Please enter the rectangle's height: ");
        int height = scanner.nextInt();
        System.out.print("Please enter the rectangle's width: ");
        int width = scanner.nextInt();

        int area = height * width;
        int perimeter = 2 * (height + width);

        if (height == width || Math.abs(height - width) > 5) {
            System.out.println("The area of the rectangle is: " + area);
        } else {
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
    }

    private static void triangle(Scanner scanner) {
        System.out.print("Please enter the triangle's base: ");
        double base = scanner.nextDouble();
        System.out.print("Please enter the triangle's height: ");
        double height = scanner.nextDouble();

        double side =  Math.sqrt((double)Math.pow((base/2),2)+(double) Math.pow(height,2));
        double perimeter=(2*side)+base;

        System.out.println("Please choose an option:");
        System.out.println("1. Calculation of the perimeter of the triangle");
        System.out.println("2. Printing the triangle");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else if (option == 2) {
            if (base % 2 == 0 || base > 2 * height) {
                System.out.println("The triangle cannot be printed.");
            } else {
                int numSpaces = (int)base / 2;
                int numStars = 1;
                //first loop to print top
                for (int j = 0; j < numSpaces; j++) {
                    System.out.print(" ");
                }
                System.out.print("*\n");

                //handle middle
                int numOfOdds = ((int)base / 2) - 1;
                int expectedMiddleRows = (int)height - 2;
                int rows = (expectedMiddleRows / numOfOdds) + (expectedMiddleRows % numOfOdds);
                numStars += 2;
                numSpaces -= 1;
                if (expectedMiddleRows >= 2) {
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < numSpaces; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < numStars; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }
                while (numStars < base - 2) {
                    numStars += 2;
                    numSpaces -= 1;
                    rows = expectedMiddleRows / numOfOdds;
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < numSpaces; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < numStars; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                }

                //base case
                for (int j = 0; j < base; j++) {
                    System.out.print("*");
                }
            }
        } else {
            System.out.println("Invalid option selected. Please try again.");
        }
    }
}