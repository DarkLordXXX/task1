package Lesson4;

import java.util.Scanner;

public class Exercise_04_06 {
    public static void main(String[] args) {
        //6) Напишіть програму на Java для знаходження максимального та мінімального
        //значення масиву.
        System.out.println("Введіть довжину масиву : ");
        Scanner scanner = new Scanner(System.in);
        int theLengthOfTheArray = scanner.nextInt();//userNum

        short[] nums = new short[theLengthOfTheArray];
        for (int i = 0; i < theLengthOfTheArray; i++) {//for (short num : nums)
            System.out.println("Введіть елемент " + (i + 1) + " :");
            nums[i] = scanner.nextShort();
        }

        short max_num = nums[0];
        for (short num : nums) {        //for (short num : nums) {
            if (num > max_num)          //if (num > max_num)
                max_num = num;          //max_num = num;
        }
        for (int i = 0; i < theLengthOfTheArray; i++) {
            if (nums[i] > max_num)
                max_num = nums[i];
        }
        System.out.println("Максимальний елемент :" + max_num);

        short min_num = nums[0];                //short min_num = nums[0];
        for (int i = 0; i < theLengthOfTheArray; i++) {    //for (short num : nums) {
            if (nums[i] < min_num)              //if (num < min_num)
                min_num = nums[i];              // min_num = num;
        }
        System.out.println("Мінімальний елемент :" + min_num);

        for (int i = 0; i < nums.length; i++) {//for (short num : nums) {
            System.out.println(nums[i]);// System.out.println(num);
        }                               //}
        scanner.close();
    }
}
