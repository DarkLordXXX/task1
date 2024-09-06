package Lesson3;

import java.util.Scanner;

public class Homework_02_03 {
    public static void main(String[] args) {
        //2 урок 3 завдання.Напишіть програму для порівняння двох чисел.
        System.out.println("Дана програма призначається для порівння чисел введених з клавіатури.");
        System.out.println("Введи перше число : ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Введи друге число : ");
        float b = sc.nextFloat();
        if (a > b) {
            System.out.println(a + " > " + b);
        }
        if (b > a) {
            System.out.println(b + " > " + a);
        }
        if (a == b) {
            System.out.println(a + " = " + b);
        }
    }
}
