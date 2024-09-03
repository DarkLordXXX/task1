package PracticeLesson5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        //5.4. Написати програму Java яка отримує 1-число типу int як переданий параметр. Знайти суму цифр цього
        //числа, результат вивести в консоль.
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число: ");
        number = sc.nextInt();
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Сума : " + sum);
    }
}
