package Lesson2;

public class Homework1 {
    public static void main(String[] args) {
        //2 урок 1 завдання. Напишіть програму на Java для друку суми додавання, множення, віднімання, ділення та
        //залишку двох чисел.
        int a1 = 10;
        int a2 = 10;
        int addition = a1 + a2;
        int subtraction = a1 - a2;
        int multiplication = a1 * a2;
        int division = a1 / a2;
        int remainder = a1 % a2;
        System.out.println("Сума додавання " + addition );
        System.out.println("Результат віднімання " + subtraction );
        System.out.println("Сума множення " + multiplication);
        System.out.println("Сума ділення " + division);
        System.out.println("Сума залишку " + remainder);
    }
}
