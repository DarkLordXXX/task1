package Lesson3;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        //2.7 урок. Напишіть програму для обчислення відстані між двома точками на поверхні землі.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть широту координати 1: ");
        double lat1 = scanner.nextDouble();
        System.out.print("Введіть довготу координати 1: ");
        double lon1 = scanner.nextDouble();

        System.out.print("Введіть широту координати 2: ");
        double lat2 = scanner.nextDouble();
        System.out.print("Введіть довготу координати 2: ");
        double lon2 = scanner.nextDouble();

        System.out.print("Відстань між цими точками дорівнює : " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");
    }
    // Точки будуть перетворені в радіани перед обчисленням
    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
        // Перетворення широти та довготи в радіани
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        // Середній радіус Землі в кілометрах
        double earthRadius = 6371.01;
        // Обчислити відстань за формулою гаверсинуса
        return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }
}
