package lesson12.task1;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private int age;
    private boolean sex;

    public User(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
