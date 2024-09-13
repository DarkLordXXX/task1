package Lesson4;

import java.util.Arrays;

public class Exercise05 {
    public static void main(String[] args) {
        //5) Напишіть програму на Java для видалення певного елемента з масиву.
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};//myArray

        System.out.println("Оригінальний масив : " + Arrays.toString(myArray));
        int removeIndex = 1;

        for (int i = removeIndex; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i + 1];
        }

        System.out.println("Після видалення другого елемента: " + Arrays.toString(myArray));
    }
}
