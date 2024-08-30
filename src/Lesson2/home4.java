package Lesson2;

public class home4 {
    public static void main(String[] args) {
        //2 урок 4 завдання. Напишіть програму для обчислення суми перших 10 натуральних чисел.
        int i, num = 10, sum = 0;
        for(i = 1; i <= num; ++i)
        {
            sum = sum + i;
        }
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}

