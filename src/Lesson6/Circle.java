package Lesson6;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        //2) Створити клас коло з полями, радіус, та константа PI. Додати методи обчислення площі, периметру.
        System.out.println("Вважай що коло створено");
        Scanner sc = new Scanner(System.in);
        System.out.println("Програма сама обрахує площу за формулою (area = P * r2;)");
        System.out.print("Введіть радіус, : ");
        int radius = sc.nextInt();
        double P = 3.14;
        int r2 = radius * radius;
        double area = P * r2;
        System.out.println("Площа кола становить : " + area);

    }
}
