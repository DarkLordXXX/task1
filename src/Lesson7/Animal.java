package Lesson7;

public class Animal {
    private String name;
    private String eat;
    private String speak;

    private int run;

    public Animal(String name, String eat, String speak, String sleep, int run) {
        this.name = name;
        this.eat = eat;
        this.speak = speak;
        this.run = run;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }
}

