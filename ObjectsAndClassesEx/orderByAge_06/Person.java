package orderByAge_06;

public class Person {
    // полетата -> характеристики -> име, ID , възраст
    private  String name;
    private  String id;
    private int age;

    // конструктор -> ще създавам обекти от моя клас


    public Person(String name, String id, int age) {
        // целта му е да създаде нов обект, в началото е празен обект, всички полета са = 0
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }
}
