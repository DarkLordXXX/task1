package Lesson3;

import java.util.Scanner;

public class Homework_03_01 {
    public static void main(String[] args) {
        //2 урок 1 завдання. Напишіть програму на Java для друку суми додавання, множення, віднімання, ділення та
        //залишку двох чисел.
        System.out.println("Дана програма призначається для порівння чисел введених з клавіатури.");
        System.out.println("Введи перше число : ");
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        System.out.println("Введи друге число : ");
        int a2 = sc.nextInt();
        int addition = a1 + a2;
        int subtraction = a1 - a2;
        int multiplication = a1 * a2;
        int division = a1 / a2;
        int remainder = a1 % a2;
        System.out.println("Сума додавання " + addition );
        System.out.println("Результат віднімання " + subtraction );
        System.out.println("Сума множення " + multiplication);
        System.out.println("Сума ділення " + division);
        System.out.println("Сума залишку " + remainder);
    }
}
