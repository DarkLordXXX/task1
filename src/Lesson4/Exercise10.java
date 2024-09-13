package Lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise10 {
    public static void main(String[] args) {
        //4.10) Напишіть програму на Java для перевірки рівності двох масивів. (двомірних)
        int[] array1 = {72, 48, 69, 92, 10, 68, 48, 33, 88, 86, 58, 29, 48, 57, 79, 95, 97, 1, 50, 42, 21, 99, 0, 87, 84};
        int[] array2 = {72, 48, 69, 92, 10, 68, 48, 33, 88, 86, 58, 29, 48, 57, 79, 95, 97, 1, 50, 42, 20, 99, 0, 87, 87};

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        Set<Integer> commonElements = new HashSet<>();
        Set<Integer> differentElements = new HashSet<>();

        // Знайдемо спільні елементи
        for (int i = 0; i < array1.length; i++) {
            int finalI = i;
            if (Arrays.stream(array2).anyMatch(x -> x == array1[finalI])) {
                commonElements.add(array1[i]);
            }
        }

        // Знайдемо елементи, які є в array1, але не в array2
        for (int i = 0; i < array1.length; i++) {
            if (!commonElements.contains(array1[i])) {
                differentElements.add(array1[i]);
            }
        }

        // Знайдемо елементи, які є в array2, але не в array1
        for (int i = 0; i < array2.length; i++) {
            if (!commonElements.contains(array2[i])) {
                differentElements.add(array2[i]);
            }
        }

        System.out.println("Спільні елементи: " + commonElements);
        System.out.println("Різні елементи: " + differentElements);

        if (Arrays.equals(array1, array2)) {
            System.out.println("Два масиви рівні");
        } else {
            System.out.println("Два масиви не рівні");
        }
    }
}
