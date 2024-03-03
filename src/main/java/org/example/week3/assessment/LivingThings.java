package org.example.week3.assessment;

 abstract class LivingThings implements Living {
    private String name;
    private int age;

    public abstract void speak();
    public abstract void sleep();

    public LivingThings(String name, int age) {
        this.name = name;
        this.age = age;
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
}
