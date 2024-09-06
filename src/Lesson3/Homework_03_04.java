package Lesson3;

public class Homework_03_04 {
    public static void main(String[] args) {
        //2 урок 4 завдання. Напишіть програму для обчислення суми перших 10 натуральних чисел.
        int i, sum = 0;
        for (i = 1; i <= 10; ++i) {
            sum = sum + i;
        }
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}
