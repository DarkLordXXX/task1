package Lesson4;

import java.util.Scanner;

public class Exercise_04_02 {
    public static void main(String[] args) {
        // ) Напишіть програму, яка знаходить суму кожного числа від 1 до num. Число завжди
        // буде додатним цілим числом, більшим за 0...
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число більше за 0: ");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Введене число має бути більше за 0.");
        }
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сума чисел від 1 до " + num + " дорівнює " + sum);
    }
}
