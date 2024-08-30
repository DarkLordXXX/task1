package Lesson2;

import java.util.Scanner;

public class home6 {
    public static void main(String[] args) {
        //2 урок 6 завдання. Напишіть програму для знаходження факторіалу будь-якого числа, введеного з клавіатури.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число для обчислення факторіалу: ");
        int number = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Факторіал числа " + number + " дорівнює " + factorial);
    }
}
