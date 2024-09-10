package Lesson3;


public class Homework09 {
    public static void main(String[] args) {
       /* 9. Напишіть програму для друку всіх чисел Армстронга від 1 до 500. Якщо сума кубів кожної
        цифри числа дорівнює самому числу, то це число називається числом Армстронга.
                Наприклад, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
        */
        for (int i = 0; i <= 500; i++) {
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            double numberOfArmstrong = ((a * a * a) + (b * b * b) + (c * c * c));
            if (numberOfArmstrong == i) {
                System.out.println("Це число Армстронга " + i + " == " + numberOfArmstrong);
            }
        }
    }
}
