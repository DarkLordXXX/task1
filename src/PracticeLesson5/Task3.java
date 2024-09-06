package PracticeLesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //5.3. Написати програму Java яка отримує 2-числа типу int як передані параметри. Знайти найбільший
        //спільний дільник , результат вивести в консоль.
        int x, y;
        int gcd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи 1 число: ");
        x = sc.nextInt();
        System.out.print("Введи 2 число: ");
        y = sc.nextInt();
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
//спільний дільник у змінній gcd
                gcd = i;
        }
        System.out.printf("Спільний дільник : " + gcd);
    }
}
