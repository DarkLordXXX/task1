package Lesson4;

import java.util.Arrays;

public class Exercise07 {
    public static void main(String[] args) {
        // 7) Напишіть програму на Java для обчислення середнього значення масиву цілих
        // чисел, крім найбільшого та найменшого значень.
        int[] arrayNumbers = {5, 7, 2, 4, 9};
        System.out.println("Оригінальний масив : " + Arrays.toString(arrayNumbers));

        float x = getX(arrayNumbers);

        // Виведіть розраховане середнє значення з двома знаками після коми.
        System.out.printf("Обчисліть середнє значення масиву цілих чисел, крім найбільшого та найменшого значень: %.2f", x);
        System.out.print("\n");
    }
    private static float getX(int[] arrayNumbers) {
        int max = arrayNumbers[0];
        int min = arrayNumbers[0];
        float sum = arrayNumbers[0];

        for (int i = 1; i < arrayNumbers.length; i++) {
            sum += arrayNumbers[i];
            if (arrayNumbers[i] > max)
                max = arrayNumbers[i];
            else if (arrayNumbers[i] < min)
                min = arrayNumbers[i];
        }
        float x = ((sum - max - min) / (arrayNumbers.length - 2));
        return x;
    }
}
