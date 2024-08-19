package Lesson1;

public class Homework1 {
    public static void main(String[] args) {
        byte a1 = 10;
        int b1 = 22;
        short c1 = 31;
        long d1 = 423;
        char e1 = 9;
        double f1 = 1.7;
        float g1 = 23.34f; //  1.1  Створити змінні примітивних типів, усіх можливих систем числень для кожного типу.\
        System.out.println((b1+" "+c1+" "+d1+" "+e1)+" "+(f1+g1));

        int a2 = 0b10011010;
        int a3 = 0xFF;
        int a4 = 077;
        System.out.println(a1+" "+a2 +" " +a3+" "+a4);
        System.out.println(a1+a2+a3+a4);

        int sumInt = 1;
        int sumByte = 2;
        int sumDouble = 3;
        int sumLong = 4;
        int sumShort = 5;
        int sumFloat = 6;
        int sumChar = 7;
        long result = sumChar +sumDouble+sumByte+sumFloat+sumLong+sumInt+sumShort;
        //2. Створити нові змінні int sumInt, sumByte, sumDouble, sumLong, sumShort, sumFloat,
        //sumChar, та присвоїти їм значення суми свіх раніше створенних змінних відповідного типу.

        //3. Просумувати результат в змінну long result та результат вивести в консоль.
        System.out.println(result);

    }
}
