package Lesson4;

import java.util.Scanner;

public class Experiment1 {
    public static void main(String[] args) {
        ////4.1) Створити функцію, яка може перетворити рядок на число.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть цифри більші за 0: ");
        String myString1 = scanner.nextLine();
        System.out.print("Введіть букви : ");
        String myString2 = scanner.nextLine();
        System.out.print("Введіть пустий рядок : ");
        String myString3 = scanner.nextLine();

        System.out.println("Перетворення чисел введених з консолі у вигляді рядка : " + stringToInt(myString1, 0));  // Виведе 123
        System.out.println("Перетворення 'abc': " + stringToInt(myString2, 0));  // Виведе 0
        System.out.println("Перетворення порожнього рядка: " + stringToInt(myString3, 0));  // Виведе 0
    }

    // Перетворення рядка в ціле число вручну
    public static int stringToInt(String str, int defaultValue) {
        if (str == null || str.isEmpty()) {
            return defaultValue;
        }

        int result = 0;// оголошшення змінної типу інт із назвою result яка рівна 0
        boolean isNegative = false;//оголошшення змінної типу boolean із назвою isNegative
        int startIndex = 0;//оголошшення змінної типу інт із назвою  startIndex для перевірки індексів

        // Перевіряємо, чи починається число зі знака мінус
        if (str.charAt(0) == '-') {
            isNegative = true;
            startIndex = 1; // Пропускаємо перший символ, бо це мінус
        }

        for (int i = startIndex; i < str.length(); i++) {
            char currentChar = str.charAt(i);//створення змінної currentChar типу char = і, котрає є лічильником кругів циклу
            //str.charAt(i) що це поки не зрозуміло
            // Перевіряємо, чи є символ цифрою
            if (currentChar >= '0' && currentChar <= '9') {//наявний символ має бути більший 0 але менше 9
                result = result * 10 + (currentChar - '0');// 0 = 0 * 10 +(наявний символ - 0)
            } else {
                // Якщо зустрічаємо не цифру, повертаємо значення за замовчуванням
                return defaultValue;
            }
        }

        // Якщо число негативне, робимо його від'ємним
        if (isNegative) {
            result = -result;
        }

        return result;
    }
}

