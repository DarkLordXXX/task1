package Lesson1;

public class Homework1 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 0b110101;
        byte b3 = 0xF;
        byte b4 = 012;
        int a1 = 22;
        int a2 = 0b100;
        int a3 = 0xFF;
        int a4 = 023;
        short s1 = 31;
        short s2 = 025;
        short s3 = 0xF;
        short s4 = 0b101;
        long l1 = 423;
        long l2 = 035;
        long l3 = 0xef;
        long l4 = 0b111;
        char c1 = 9;
        char c2 = 033;
        char c3 = 0xfe;
        char c4 = 0b1010;
        double d1 = 1.7;
        double d2 = 065;
        double d3 = 0xE;
        double d4 = 0b1011;
        float f1 = 23.34f;
        float f2 = 067;
        float f3 = 0xff;
        float f4 = 0b101110;//  1.1  Створити змінні примітивних типів, усіх можливих систем числень для кожного типу.\

        int sumInt = a1+a2+a3+a4;
        int sumByte = b1+b2+b3+b4;
        long sumLong = l1+l2+l3+l4;
        int sumShort = s1+s2+s3+s4;
        int sumChar = c1+c2+c3+c4;
        double sumDouble = d1+d2+d3+d4;
        float sumFloat = f1+f2+f3+f4;
        long result1 = sumChar +sumByte+sumLong+sumInt+sumShort;
        double result2 = sumDouble+ sumFloat;
        //2. Створити нові змінні int sumInt, sumByte, sumDouble, sumLong, sumShort, sumFloat,
        //sumChar, та присвоїти їм значення суми свіх раніше створенних змінних відповідного типу.

        //3. Просумувати результат в змінну long result та результат вивести в консоль.
        System.out.println((result1+" тут суми інтів, байтів, чарів,шортів і лонгів "));
        System.out.println((result2)+ " тут дабли і флоати");
        System.out.println(a1+" "+a2+" "+a3+" "+a4+" тут байти");
        System.out.println(b1+" "+b2+" "+b3+" "+b4+" тут інти");
        System.out.println(l1+" "+l2+" "+l3+" "+l4+" тут лонги");
        System.out.println(s1+" "+s2+" "+s3+" "+s4+" тут шорти");
        System.out.println(d1+" "+d2+" "+d3+" "+d4+" тут дабли");
        System.out.println(f1+" "+f2+" "+f3+" "+f4+" тут флоати");
        System.out.println(c1+" "+c2+" "+c3+" "+c4+" тут чари");
    }
}
