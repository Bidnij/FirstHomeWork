public class Multiply {
    static public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    static public int multiplyFromSum(int firstNumber, int secondNumber) {
        int Result = 0;
        for (int i = 0; i < secondNumber; i++)
            Result = Result + firstNumber;
        return Result;
    }
}
