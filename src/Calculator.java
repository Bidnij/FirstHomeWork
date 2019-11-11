import java.util.Random;

/*
Основной класс калькулятора в котором вызываются все методы вычислений с других классов
 */

/**
 * @author Myhail
 * Генерация комментария в HTML 5
 */

public class Calculator {
    public static void calculator() {
        Random randomNumber = new Random(); //создания класса типа рендом
        int randomNumberOne = randomNumber.nextInt(100); // присвоения переменной случайного значения от 0 до 99
        int randomNumberTwo = randomNumber.nextInt(10); // присвоения переменной случайного значения от 0 до 9
        System.out.println("Сумма чисел " + Plus.plus(randomNumberOne, randomNumberTwo));
        System.out.println("Разница чисел " + Minus.minus(randomNumberOne, randomNumberTwo));
        if (randomNumberTwo == 0) { // решил добавить проверку так как на 0 делить нельзя
            System.out.println("Частное посчитать нельзя так делимое 0");
        } else {
            System.out.println("Частное чисел " + Divide.divine(randomNumberOne, randomNumberTwo));
        }
        System.out.println("Произведение чисел " + Multiply.multiply(randomNumberOne, randomNumberTwo));
        System.out.println("Произведение чисел через сумму " + Multiply.multiplyFromSum(randomNumberOne, randomNumberTwo));
    }
}
