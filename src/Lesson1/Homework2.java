package Lesson1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(100));
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double TF = celsius * 5 / 9 + 32;
        return TF;
    }
}
