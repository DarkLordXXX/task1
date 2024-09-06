package MyFreeTime;

import java.math.BigInteger;
import java.util.Scanner;

public class FactExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число для обчислення факторіалу: ");
        int number = scanner.nextInt();
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Факторіал числа " + number + " дорівнює " + factorial);
    }
}
