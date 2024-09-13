package Lesson6;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        //1) Створити клас прямокутник з полями довжина, ширина. Додати методи обчислення площі, периметру.
        System.out.println("Вважай що прямокутник створено");
        Scanner sc = new Scanner(System.in);
        System.out.println("Програма сама обрахує площу ");
        System.out.print("Введіть розмір одної із сторін прямокутника : ");
        int line1 = sc.nextInt();
        System.out.print("Введіть розмір другої сторони прямокутника : ");
        int line2 = sc.nextInt();
        int area = line1 * line2;
        System.out.println("Периметр прямокутника дорівнює " + area + " см.");
    }
}
