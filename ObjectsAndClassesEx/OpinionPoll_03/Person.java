package OpinionPoll_03;

public class Person {
    // да опишем нашите полета /характеристиките/ -> име и възраст
    private String name;
    private  int age;

    // конструктор -> с него създаваме обекти от класа
    public Person (String name, int age) {
        // искам да си създам един нов обект чрез конструктора
        this.name = name;
        this.age = age;
    }
    // методи -> поведение
    // getter -> метод, чрез който достъпваме стойност на поле
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
}
