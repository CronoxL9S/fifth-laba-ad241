package rebrin.ad241.lab5;

/**
 * Батьківський клас для представлення людини
 */

public class Person {
    private String surname;
    private String name;
    private int age;

    // Конструктор для ініціалізації всіх полів
    public Person(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String printInfo() {
        return "Людина " + this.surname + " " + this.name + ", вік: " + this.age;
    }

    // Гетери
    public String getSurname() {
        return surname;}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Сетери
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}