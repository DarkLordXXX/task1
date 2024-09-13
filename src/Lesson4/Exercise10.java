package Lesson4;

import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args) {
        //10) Напишіть програму на Java для перевірки рівності двох масивів. (двомірних)
        int[]array1 = { 30, 25, 40 };
        int[]array2 = { 30, 25, 40 };

        if (Arrays.equals(array1, array2)) {
            System.out.println("Два масиви рівні");
        }
        else {
            System.out.println("Два масиви не рівні");
        }
    }
}
