package Lesson4;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise10_2 {
    public static void main(String[] args) {
        //10) Напишіть програму на Java для перевірки рівності двох масивів. (двомірних)
        int[][] array1 = {
                { 72, 48, 69, 92, 10, 68, 48, 33, 88, 86, 58, 29, 48, 59,},
                { 72, 48, 69, 92, 10, 68, 48, 33, 88, 86, 58, 29, 48, 57,}
        };

        int[][] array2 = {
                { 72, 48, 69, 92, 10, 68, 48, 33, 88, 86, 58, 29, 48, 59},
                { 71, 48, 66, 92, 10, 69, 48, 33, 88, 86, 59, 29, 48, 57,}
        };

        System.out.println("Array1 : " + Arrays.deepToString(array1));
        System.out.println("Array2 : " + Arrays.deepToString(array2));

        Set<String> commonElements = new HashSet<>();
        Set<String> differentElements = new HashSet<>();

        for (int[] row1 : array1) {
            for (int[] row2 : array2) {
                if (Arrays.equals(row1, row2)) {
                    commonElements.add(Arrays.toString(row1));
                }
            }
        }

        // Елементи, які є в array1, але не в array2
        for (int[] row1 : array1) {
            if (!commonElements.contains(Arrays.toString(row1))) {
                differentElements.add(Arrays.toString(row1));
            }
        }

        // Елементи, які є в array2, але не в array1
        for (int[] row2 : array2) {
            if (!commonElements.contains(Arrays.toString(row2))) {
                differentElements.add(Arrays.toString(row2));
            }
        }

        System.out.println("Спільні елементи: " + commonElements);
        System.out.println("Різні елементи: " + differentElements);

        // Перевірка рівності масивів
        if (Arrays.deepEquals(array1, array2)) {
            System.out.println("Два масиви рівні");
        } else {
            System.out.println("Два масиви не рівні");
        }
    }
}
