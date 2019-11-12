import java.util.Random;

/*
General class Calculation. This class is used to display the result of mathematical operations.
 */

/**
 * @author Myhail
 * Generate code in HTML 5
 */

public class Calculator {
    public static void calculator() {
        Random randomNumber = new Random(); //Create class random type
        int randomNumberOne = randomNumber.nextInt(100); // Create variable from 0 to 99
        int randomNumberTwo = randomNumber.nextInt(10); // Create variable from 0 to 9
        System.out.println("Sum of numbers " + Plus.plus(randomNumberOne, randomNumberTwo));
        System.out.println("Number difference " + Minus.minus(randomNumberOne, randomNumberTwo));
        if (randomNumberTwo == 0) { // use check null value
            System.out.println("Second number should be not 0");
        } else {
            System.out.println("Quotient numbers " + Divide.divine(randomNumberOne, randomNumberTwo));
        }
        System.out.println("Multiply of numbers " + Multiply.multiply(randomNumberOne, randomNumberTwo));
        System.out.println("Multiply of number way of adding numbers " + Multiply.multiplyFromSum(randomNumberOne, randomNumberTwo));
    }
}
