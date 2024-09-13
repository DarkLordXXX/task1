package PracticeLesson5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // 7. Написати програму Java яка отримує 1-число типу int як переданий параметр. Порахувати для нього суму
        // ряда чисел Фібоначчі. (кожне число рівне сумі двох попередніх)
        // Task7. Fibonacci(5) -> Ряд “0 1 1 2 3” сума –> 7
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.println("Ряд Фібоначчі до " + number + " умови :");

        for (int i = 1; i <= number; ++i) {
            System.out.print(first + ", ");

            int sum = first + second;
            first = second;
            second = sum;
        }
    }
}
