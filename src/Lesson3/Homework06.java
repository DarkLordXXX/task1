package Lesson3;

import java.math.BigInteger;
import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        //2 урок 6 завдання. Напишіть програму для знаходження факторіалу будь-якого числа, введеного з клавіатури.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для обчислення факторіалу: ");
        int number = scanner.nextInt();
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Факторіал числа " + number + " дорівнює " + factorial);
    }
}
