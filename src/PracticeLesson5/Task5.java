package PracticeLesson5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Написати програму Java яка отримує 1-число типу int як переданий параметр. Програма виводить
        //запрошену кількість простих чисел в консоль через пробіл.
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int N;
        N = sc.nextInt();
        int x;
        int y;
        int flg;

        System.out.println("Усі прості числа в межах 1 і " + N + " are:");
        for (x = 1; x <= N; x++) {
            if (x == 1 || x == 0)
                continue;
            flg = 1;
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print(x + " ");
        }
    }
}
