package MyFreeTime;

import java.util.Scanner;

public class FactorialExample2 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число для обчислення факторіалу: ");
        int number = scanner.nextInt();
        int factorial1 = 0;
        int factorial2 = 1 * 2;
        int factorial3 = 1 * 2 * 3;
        int factorial4 = 1 * 2 * 3 * 4;
        int factorial5 = 1 * 2 * 3 * 4 *5;
        int factorial6 = 1 * 2 * 3 * 4 * 5 * 6;
        int factorial7 = 1 * 2 * 3 * 4 * 5 * 6 * 7;
        int factorial8 = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8;
        int factorial9 = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9;
        int factorial10 = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10;

        if (number == 1) {
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial1);
        }
        if (number == 2) {
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial2);
        }
        if (number == 3) {
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial3);
        }
        if (number == 4) {
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial4);
        }
        if (number == 5) {
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial5);
        }
        if (number == 6) {
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial6);
        }
        if (number == 7) {
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial7);
        }
        if (number == 8) {
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial8);
        }
        if (number == 9) {
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial9);
        }
        if (number == 10) {
            System.out.println("Факторіал числа " + number + " дорівнює " + factorial10);
        }
    }
}


