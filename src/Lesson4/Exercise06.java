package Lesson4;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        //4.6) Напишіть програму на Java для знаходження максимального та мінімального
        //значення масиву.
        System.out.println("Введіть довжину масиву : ");
        Scanner scanner = new Scanner(System.in);
        int theLengthOfTheArray = scanner.nextInt();//userNum

        short[] nums = new short[theLengthOfTheArray];
        for (int i = 0; i < theLengthOfTheArray; i++) {//for (short num : nums)
            System.out.println("Введіть елемент " + (i + 1) + " :");
            nums[i] = scanner.nextShort();
        }

        short maxNum = nums[0];
        for (short num : nums) {        //for (short num : nums) {
            if (num > maxNum)          //if (num > maxNum)
                maxNum = num;          //maxNum = num;
        }
        for (int i = 0; i < theLengthOfTheArray; i++) {
            if (nums[i] > maxNum)
                maxNum = nums[i];
        }
        System.out.println("Максимальний елемент :" + maxNum);

        short minNum = nums[0];                //short minNum = nums[0];
        for (int i = 0; i < theLengthOfTheArray; i++) {    //for (short num : nums) {
            if (nums[i] < minNum)              //if (num < minNum)
                minNum = nums[i];              // minNum = num;
        }
        System.out.println("Мінімальний елемент :" + minNum);

        for (int i = 0; i < nums.length; i++) {//for (short num : nums) {
            System.out.println(nums[i]);// System.out.println(num);
        }                               //}
        scanner.close();
    }
}
