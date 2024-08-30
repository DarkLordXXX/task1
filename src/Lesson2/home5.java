package Lesson2;

import java.util.Scanner;

public class home5 {
    public static void main(String[] args) {
        //2 урок 5 завдання. Напишіть програму для обчислення суми цифр цілого числа

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть  1 ціле число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введіть  2 ціле число: ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        System.out.println("Сума цифр: " + sum);
    }
}

