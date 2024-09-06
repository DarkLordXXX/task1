package Lesson4;

import java.util.Arrays;

public class Exercise_04_05 {
    public static void main(String[] args) {
        //5) Напишіть програму на Java для видалення певного елемента з масиву.
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Оригінальний масив : " + Arrays.toString(my_array));
        int removeIndex = 1;

        for (int i = removeIndex; i < my_array.length - 1; i++) {
            my_array[i] = my_array[i + 1];
        }

        System.out.println("Після видалення другого елемента: " + Arrays.toString(my_array));
    }
}
