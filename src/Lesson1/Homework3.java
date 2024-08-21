package Lesson1;

public class Homework3 {
    public static void main(String[] args) {
        // Дюйми в сантиметри, як в 4 завданні
        System.out.println(convertInchesToCentimeters(100));
    }

    public static double convertInchesToCentimeters (double centimetres) {
        double Inches = centimetres * 2.54;
        return Inches;
    }
}
