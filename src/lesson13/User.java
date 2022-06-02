package lesson13;

public class User implements Comparable {

    private String name;
    private boolean sex;
    private int age;

    public User(String name) {
        this.name = name;
    }

    public User(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return this.name.charAt(0) == user.getName().charAt(0);
    }

    @Override
    public int compareTo(Object obj) {
        User user = (User) obj;
        if (this.age == user.age && equals(user)) {
            return 0;
        } else if (this.age < user.age || (this.age == user.age && this.name.charAt(0) < user.getName().charAt(0))) {
            return -1;
        } else {
            return 1;
        }
    }

    public String getName() {
        return name;
    }

    public boolean getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
