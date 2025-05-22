package domain;

public abstract class Person {

    private String name;
    private int age;
    private int height;
    private double weight;

    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public int getHeight() { return height; }

    public double getWeight() { return weight; }

}
