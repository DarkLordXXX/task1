package Lesson4;

import java.util.Scanner;

public class Exercise_04_06_02 {
    public static void main(String[] args) {
        //4.6) Напишіть програму на Java для знаходження максимального та мінімального
        //значення масиву.
        System.out.println("Введіть довжину масиву : ");
        Scanner scanner = new Scanner(System.in);
        int lengthOfTheArray = scanner.nextInt();

        short[] nums = new short[lengthOfTheArray];
        for (int i = 0; i < lengthOfTheArray; i++) {//for (short num : nums)
            System.out.println("Введіть елемент " + (i + 1) + " :");
            nums[i] = scanner.nextShort();
        }

        short maxNum = nums[0];
        for (short num : nums) {
            if (num > maxNum)
                maxNum = num;
        }
        for (int i = 0; i < lengthOfTheArray; i++) {
            if (nums[i] > maxNum)
                maxNum = nums[i];
        }
        System.out.println("Максимальний елемент :" + maxNum);

        short minNum = nums[0];
        for (short num : nums) {
            if (num < minNum)
                minNum = num;
        }
        System.out.println("Мінімальний елемент :" + minNum);

        for (short num : nums) {
             System.out.println(num);
        }
        scanner.close();
    }
}
