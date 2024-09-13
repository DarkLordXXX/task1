package Lesson6;

public class Dog {
    //3) Створити клас Dog. Додати поля на ваш розсуд та деякі методи.
    private double weight;
    private int age;
    private String name;
    private String breed;

    public Dog(String name, int age, double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public String bark() {

        return name + " Гав гав ";
    }
}
