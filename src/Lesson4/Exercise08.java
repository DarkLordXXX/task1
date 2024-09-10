package Lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise08 {
    public static void main(String[] args) {
        //4.8) Напишіть програму на Java для пошуку спільних елементів між двома масивами цілих чисел
        int[] array1 = {1, 2, 3, 3, 3, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 3, 3, 3, 6, 15, 6, 4, 7, 0};

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        Set<Integer> commonElements = new HashSet<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == (array2[j])) {
                    if (!commonElements.contains(array1[i])) {
                        commonElements.add(array1[i]);
                        System.out.println("Спільний елемент: " + array1[i]);
                    }
                }
            }
        }
    }
}
