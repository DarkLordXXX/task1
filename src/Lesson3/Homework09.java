package Lesson3;

import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {
       /* 9. Напишіть програму для друку всіх чисел Армстронга від 1 до 500. Якщо сума кубів кожної
        цифри числа дорівнює самому числу, то це число називається числом Армстронга.
                Наприклад, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
        */
        System.out.println("Введіть  число від 1-500 : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();//
        int a = i / 100;
        int b = i / 10 % 10;
        int c = i % 10;
        double kub = ((a * a * a) + (b * b * b) + (c * c * c));
        if (kub == i && i <= 500) {
            System.out.println(a + " a");
            System.out.println(b + " a");
            System.out.println(c + " a");
            System.out.println("Це число Армстронга " + i + " == " + kub);
        }
        if (kub != i) {
            System.out.println(a + " a");
            System.out.println(b + " a");
            System.out.println(c + " a");
            System.out.println("Це число не є числом Армстронга : " + i + " != " + kub);
        }
    }
}
