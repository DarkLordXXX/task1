package Lesson2;

import java.util.Scanner;

public class home7 {
    public static void main(String[] args) {
        //7. Напишіть програму для обчислення відстані між двома точками на поверхні землі.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть  x1 ціле число: ");
        int x1 = scanner.nextInt();

        System.out.println("Введіть  x2 ціле число: ");
        int x2 = scanner.nextInt();

        System.out.println("Введіть  y1 ціле число: ");
        int y1 = scanner.nextInt();

        System.out.println("Введіть  у2 ціле число: ");
        int y2 = scanner.nextInt();

        int sum1 = x1 - x2;
        int sum2 = y1 - y2;

        System.out.println("Відстань мінь між кординатами х-сів : " + sum1);
        System.out.println("Відстань мінь між кординатами у-гриків : " + sum2);
    }
}
