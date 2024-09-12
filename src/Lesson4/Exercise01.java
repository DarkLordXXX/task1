package Lesson4;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        //4.1) Створити функцію, яка може перетворити рядок на число.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть  цифри більші за 0: ");
        String myString1  = scanner.nextLine();
        System.out.print("Введіть  букви : ");
        String myString2 = scanner.nextLine();
        System.out.print("Введіть  пустий рядок : ");
        String myString3 = scanner.nextLine();

        System.out.println("Перетворення чисел введених з консолі  у вигляді рядка : " + stringToInt(myString1, 0));  // Виведе 123
        System.out.println("Перетворення 'abc': " + stringToInt(myString2, 0));  // Виведе 0
        System.out.println("Перетворення порожнього рядка: " + stringToInt(myString3, 0));  // Виведе 0
    }
    public static int stringToInt(String str, int defaultValue) {
        if (str == null || str.isEmpty()) {
            return defaultValue;
        }

        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}
//21 рядок Якщо рядок порожній або null, повертаємо значення за замовчуванням
//26 Спроба перетворення рядка на число
//28 Якщо рядок не можна перетворити, повертаємо значення за замовчуванням
