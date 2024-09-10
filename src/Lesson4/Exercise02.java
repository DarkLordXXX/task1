package Lesson4;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        // 4.2) Напишіть програму, яка знаходить суму кожного числа від 1 до num. Число завжди
        // буде додатним цілим числом, більшим за 0...
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число більше за 0: ");
        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println("Введене число має бути більше за 0.");
            scanner.close();
        }
        if (num > 0) {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("Сума чисел від 1 до " + num + " дорівнює " + sum);
            scanner.close();
        }
    }
}
