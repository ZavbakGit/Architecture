package lesson5.chain;

public class People {

    private int age;
    private String name;
    private int height;
    private int weight;


    public People(int age, String name, int height, int weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
