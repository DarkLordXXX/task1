package Lesson1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(100));
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double tF = celsius * 5 / 9 + 32;
        return tF;
    }
}
