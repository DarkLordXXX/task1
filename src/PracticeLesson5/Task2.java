package PracticeLesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //5.2. Написати програму Java яка виводить в консоль передані їй аргументи розділені знаком “ ” як один
        //рядок.
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи 1 число: ");
        x = sc.nextInt();
        System.out.print("Введи 2 число: ");
        y = sc.nextInt();
        System.out.println(x + " " + y);
    }
}
