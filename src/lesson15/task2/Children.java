package lesson15.task2;

public class Children {

    private String firstName;
    private int age;
    private boolean sex;

    public Children(String firstName, int age, boolean sex) {
        this.firstName = firstName;
        this.age = age;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Children{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
