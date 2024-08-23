package Lesson1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        // Дюйми в сантиметри, як в 4 завданні
        System.out.println("Введіть дюйми : ");
        Scanner scanner = new Scanner(System.in);
        int inches = scanner.nextInt();
        System.out.println(inches + " дюймів рівно");
        double centimetres =  inches* 2.54;
        System.out.println(centimetres+ "  сантиметрам");;
    }
}
