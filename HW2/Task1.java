import java.util.Scanner;

/**
 * Task1
 * Задача 1:
 * Напишите программу, которая запрашивает у пользователя число и проверяет,
 * является ли оно положительным. Если число отрицательное
 * или равно нулю, программа должна выбрасывать исключение
 * InvalidNumberException с сообщением "Некорректное число".
 * В противном случае, программа должна выводить сообщение "Число корректно".
 */
public class Task1 {
    public static void main(String[] args) throws InvalidNumberException {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число:");
        double number=Double.parseDouble(iScanner.nextLine());
        checkNumber(number);
    }

    public static void checkNumber(double number) throws InvalidNumberException {

        if (number > 0) {
            System.out.println("Число корректно.");
        } else
            throw new InvalidNumberException("Некорректное число.");
    }

    public static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }
}