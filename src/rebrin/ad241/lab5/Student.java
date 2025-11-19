package rebrin.ad241.lab5;

/**
 * Клас для студентів - успадковується від Person
 */

public class Student extends Person {

    private String group;
    private String cardNumber;

    // Конструктор для ініціалізації нових полів для студента
    public Student(String surname, String name, int age, String group, String cardNumber) {
        super(surname, name, age);
        this.group = group;
        this.cardNumber = cardNumber;
    }

    @Override
    public String printInfo(){
        return "Студент групи " + this.group + " " + getSurname() + " " + getName() + ", Вік: " + getAge() + ". Номер студентського квитка: " + this.cardNumber;
    }

    public String getGroup() {
        return group;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
