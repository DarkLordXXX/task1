package Lesson7;

public class TestAnimal {
    public static void main(String[] args) {
        Animal Horse = new Animal("Кінь", "їсть сіно", "І-го-І-го", "деколи спить", 10);
        Animal Lion = new Animal("Лев", "їсть м'єсо", "Роар", "деколи спить", 60);
        Animal Mouse = new Animal("Миша", "їсть зерно", "Скві", "деколи спить", 5);
        Animal Piton = new Animal("Зміюка", "їсть м'ясо", "Хеа-хеа, хей лала лей", " спить довго", 10);

        System.out.print(Horse.getName() + " ");
        System.out.print(Horse.getSpeak() + " ");
        System.out.print(Horse.getEat() + " ");
        System.out.println(Horse.getRun() + " км/год");

        System.out.print(Lion.getName() + " ");
        System.out.print(Lion.getSpeak() + " ");
        System.out.print(Lion.getEat() + " ");
        System.out.println(Lion.getRun() + " км/год");

        System.out.print(Mouse.getName()+ " ");
        System.out.print(Mouse.getSpeak()+ " ");
        System.out.print(Mouse.getEat()+ " ");
        System.out.println(Mouse.getRun() + " км/год");

        System.out.print(Piton.getName()+ " ");
        System.out.print(Piton.getSpeak()+ " ");
        System.out.print(Piton.getEat()+ " ");
        System.out.println(Piton.getRun() + " км/год");
    }
}

