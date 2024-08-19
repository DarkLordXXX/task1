package Lesson1;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(1));
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        //напишите тут ваш код
        double TempFahrenheit = 300;
        double TempCelcius = (TempFahrenheit - 32.0) * 5/9;
        System.out.println(TempFahrenheit + " Фаренгейти");
        System.out.println(TempCelcius + " Цельсії ");
        return TempCelcius;
    }
}
