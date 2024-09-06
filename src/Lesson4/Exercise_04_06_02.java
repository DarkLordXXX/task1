package Lesson4;

import java.util.Scanner;

public class Exercise_04_06_02 {
    public static void main(String[] args) {
        //6) Напишіть програму на Java для знаходження максимального та мінімального
        //значення масиву.
        System.out.println("Введіть довжину масиву : ");
        Scanner scanner = new Scanner(System.in);
        int user_num = scanner.nextInt();

        short[] nums = new short[user_num];
        for (int i = 0; i < user_num; i++) {//for (short num : nums)
            System.out.println("Введіть елемент " + (i + 1) + " :");
            nums[i] = scanner.nextShort();
        }

        short max_num = nums[0];
        for (short num : nums) {
            if (num > max_num)
                max_num = num;
        }
        for (int i = 0; i < user_num; i++) {
            if (nums[i] > max_num)
                max_num = nums[i];
        }
        System.out.println("Максимальний елемент :" + max_num);

        short min_num = nums[0];
        for (short num : nums) {
            if (num < min_num)
                min_num = num;
        }
        System.out.println("Мінімальний елемент :" + min_num);

        for (short num : nums) {
             System.out.println(num);
        }
        scanner.close();
    }
}
