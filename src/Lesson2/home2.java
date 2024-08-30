package Lesson2;

import java.util.Scanner;

public class home2 {
    public static void main(String[] args) {
        /*2.урок 2 завдання. Напишіть програму на Java для перетворення десятирічного числа у
         восьмирічне, двійкове,шістнадцятирічне.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть десяткове число: ");
        int decimalNumber = scanner.nextInt();

        String binary = Integer.toBinaryString(decimalNumber);  // Двійкова система
        String octal = Integer.toOctalString(decimalNumber);    // Восьмерична система
        String hexadecimal = Integer.toHexString(decimalNumber); // Шістнадцяткова система

        System.out.println("Двійкове представлення: " + binary);
        System.out.println("Восьмеричне представлення: " + octal);
        System.out.println("Шістнадцяткове представлення: " + hexadecimal);
    }
}
