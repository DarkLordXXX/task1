package Lesson3;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        //3 урок 3 завдання.Напишіть програму для порівняння двох чисел.
        System.out.println("Введіть 1 число : ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Введіть 2 число : ");
        double b = scanner.nextDouble();
        if (a > b) {
            System.out.println("a, більше b");
        }
        else if (b > a) {
            System.out.println("b, більше а");
        } else {
            System.out.println("a рівно b");
        }
    }
}


