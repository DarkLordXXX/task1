package Lesson7;

public class Animal {
    private String name;
    private String eat;
    private String speak;
    private String sleep;

    private int run;


    public Animal(String name, String eat, String speak, String sleep, int run) {
        this.name = name;
        this.eat = eat;
        this.speak = speak;
        this.run = run;
        this.sleep= sleep;
    }

    public String getName() {
        return name;
    }


    public String getEat() {
        return eat;
    }



    public String getSpeak() {
        return speak;
    }



    public int getRun() {
        return run;

    }
    public String getSleep() {
        return sleep;
    }
}

