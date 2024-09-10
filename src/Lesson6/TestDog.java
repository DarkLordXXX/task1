package Lesson6;

public class TestDog {
    public static void main(String[] args) {
        Dog myDog = new Dog("Пес ", 5, 10, "Пітбуль");
        System.out.println(myDog.getName() + " Сосиска ");
        System.out.println(myDog.getBreed() + " порода");
        System.out.println(myDog.getAge() + " років, вік собаки");
        System.out.println(myDog.getWeight() + " кг вага ");
        System.out.println(myDog.bark());
    }
}
