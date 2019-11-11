import java.util.Random;
/*
Вторая задача домашнего задания
 */
public class TaskWithSum {
    public static void sumInputOutput() {
        Random randomNumber = new Random();
        int randomNumberOne = randomNumber.nextInt(10);
        int randomNumberTwo = randomNumber.nextInt(10);
        System.out.println("Одинарная/Двойная сумма двух чисел " + resolution(randomNumberOne, randomNumberTwo));
    }

    public static int resolution(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) // здесь решил использовать if без else так тоже можно
            return (firstNumber + secondNumber)*2;
        return firstNumber + secondNumber;
    }
}
