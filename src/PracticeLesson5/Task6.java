package PracticeLesson5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Написати програму Java яка отримує 1-число типу int як переданий параметр. Порахувати чи це
        //“щасливий номер квитка чи ні».
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число виграшного білету: ");
          int number = sc.nextInt();
          if(number == 513090){
              System.out.println("Congratulations! true! Ви переможець!");
          }if(number != 513090){
            System.out.println("На превеликий жаль, у вас не вийшло, але ми  віримо у вашу удачу, тому купіть ще один білет і попробуйте ще раз = ) ");
        }
    }
}
