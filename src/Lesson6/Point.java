package Lesson6;

import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        //4) Створити клас Point з полями X, Y та методом підрахунку відстані з іншим об'єктом даного типу.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть широту координати 1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введіть довготу координати 1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Введіть широту координати 2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введіть довготу координати 2: ");
        double y2 = scanner.nextDouble();
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Відстань = "+ distance);
    }
}


