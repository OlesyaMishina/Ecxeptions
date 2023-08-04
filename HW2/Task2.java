//Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число равно нулю, программа 
// должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо". В противном случае, программа 
// должна выводить результат деления. Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются 
// от класса Exception. Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей 
// обработки.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Task2.DivisionByZero {
        division();
    }

    public static void division() throws DivisionByZero {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите делимое:");
        double divisible = Double.parseDouble(iScanner.nextLine());
        System.out.println("Введите делитель:");
        double divider = Double.parseDouble(iScanner.nextLine());
        if (divider != 0)
            System.out.println(divisible / divider);
        else throw new DivisionByZero("Деление на ноль недопустимо.");
    }

    public static class DivisionByZero extends Exception {
        public DivisionByZero(String message) {
            super(message);
        }
    }
}
