package Lesson2;

import java.util.Scanner;

public class home8 {
    public static void main(String[] args) {
        // 2 урок 8 завдання. Напишіть програму, яка пропонує користувачеві ввести ціле число, а потім виводить число з
        // перевернутими цифрами. Наприклад, якщо введено 12345, вихід має бути 54321.
        System.out.print("Введіть ціле число: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int secondNumber = number % 10;
            reversedNumber = reversedNumber * 10 + secondNumber;
            number /= 10;
        }
        System.out.println("Число з перевернутими цифрами: " + reversedNumber);
    }
}
