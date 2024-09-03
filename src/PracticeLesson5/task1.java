package PracticeLesson5;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class task1 {
    public static void main(String[] args) {
        //5.1. Написати програму Java яка отримує n- чисел типу int як передані параметри. Порахувати їх суму,
        //результат вивести в консоль.
        int x, y,c,d, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи 1 число: ");
        x = sc.nextInt();
        System.out.print("Введи 2 число: ");
        y = sc.nextInt();
        System.out.print("Введи 3 число: ");
        c = sc.nextInt();
        System.out.print("Введи 4 число: ");
        d = sc.nextInt();
        sum = x + y + c + d;
        System.out.println("Сума : " + sum);
    }
}
