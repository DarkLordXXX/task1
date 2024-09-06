package Lesson4;

import java.util.Arrays;

public class Exercise_04_10 {
    public static void main(String[] args) {
        //10) Напишіть програму на Java для перевірки рівності двох масивів. (двомірних)
        int[]array1 = { 30, 25, 40 };
        int[]array2 = { 30, 25, 40 };

        // зберегти результат незалежно від того, чи є рівні два масиви
        boolean result = Arrays.equals(array1, array2);

        if (result) {
            System.out.println("Два масиви рівні");
        }
        else {
            System.out.println("Два масиви не рівні");
        }
    }
}
