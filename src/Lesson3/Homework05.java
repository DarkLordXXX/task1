package Lesson3;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        //2 урок 5 завдання. Напишіть програму для обчислення суми цифр цілого числа.

        int number, digit, sum;
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        number = sc.nextInt();
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Сума : " + sum);
    }
}

