package Lesson4;

import java.util.Arrays;

public class Exercise05 {
    public static void main(String[] args) {
        //4.5) Напишіть програму на Java для видалення певного елемента з масиву.
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Оригінальний масив : " + Arrays.toString(myArray));
        int removeIndex = 1;
        int[] newArray = new int[myArray.length - 1];

        for (int i = 0, j = 0; i < myArray.length; i++) {// j відовідає за новий масив.
            if (i != removeIndex) {
                newArray[j++] = myArray[i];
            }
        }
        System.out.println("Після видалення другого елемента: " + Arrays.toString(newArray));
    }
}
