


public class Person {
    private int age;
    private String sex;
    private String name;

    public Person(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex() {
        return this.sex;
    }
}
