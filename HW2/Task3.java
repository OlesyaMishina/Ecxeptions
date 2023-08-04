//Задача3: - по желанию
// Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

// Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
// Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
// Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел 
//слишком мала".Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
// - необходимо создать 3 класса собвстенных исключений

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) throws NumberOutOfRangeException {
        checkAll();
    }
    

    public static void checkAll() throws NumberOutOfRangeException {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double first = Double.parseDouble(iScanner.nextLine());
        System.out.println("Введите второе число:");
        double second = Double.parseDouble(iScanner.nextLine());
        System.out.println("Введите третье число:");
        double third = Double.parseDouble(iScanner.nextLine());
        try {
            checkFirstNumber(first);
        } catch (NumberOutOfRangeException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                checkSecondNumber(second);
            } catch (NumberOutOfRangeException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    checkSumNumber(first, second);
                } catch (NumberSumException e) {
                    System.out.println(e.getMessage());
                } finally {

                    try {
                        checkDivisuinByZero(third);
                    } catch (DivisionByZeroException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }

    public static void checkFirstNumber(double first)
            throws NumberOutOfRangeException {
        if (first > 100)
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона.");
    }

    public static void checkSecondNumber(double second)
            throws NumberOutOfRangeException {
        if (second < 0)
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона.");
    }

    public static void checkSumNumber(double first, double second)
            throws NumberSumException {
        if (first + second < 10)
            throw new NumberSumException("Сумма первого и второго чисел слишком мала.");
    }

    public static void checkDivisuinByZero(double third)
            throws NumberOutOfRangeException, Task3.DivisionByZeroException {
        if (third == 0)
            throw new DivisionByZeroException("Деление на ноль недопустимо.");
    }

    public static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    public static class NumberSumException extends Exception {
        public NumberSumException(String message) {
            super(message);
        }
    }

    public static class NumberOutOfRangeException extends Exception {
        public NumberOutOfRangeException(String message) {
            super(message);
        }
    }

}
