package Lesson4;

public class Exercise_04_03 {
    public static void main(String[] args) {
        //3) Написати програму на Java для обчислення середнього значення елементів масиву
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        int length = array.length;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = sum / length;

        System.out.println("Середнє значення масиву : " + average);
    }
}
