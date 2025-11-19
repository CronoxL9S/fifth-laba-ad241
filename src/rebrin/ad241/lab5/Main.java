package rebrin.ad241.lab5;

/*
 * @(#)Main.java
 *
 * Лабораторна робота №5
 * Тема: Поліморфізм (пізнє зв'язування). Висхідне перетворення
 * @author Ребрин Володимир
 * @version 1.0 2025/10/26
 * Група: АД-241
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\tПеревірка роботи поліморфізму та висхідного перетворення");

        Person person1 = new Student("Ребрин", "Володимир", 18,"АД-241", "AT488190");
        Person person2 = new Lecturer("Рудніченко", "Микола", 30, "Інформаційних технологій", 25000 );
        Person person3 = new Student("Карлов", "Юрій", 19,"ІФ-214", "IS374156");
        Person person4 = new Lecturer("Шевченко", "Тарас", 71, "Української літератури та компаративістики", 16000 );

        Person people[] = {person1, person2, person3, person4};

        System.out.println("\n--- Інформація про студентів та викладачів ---\n");

        for (Person p : people)
            System.out.println(p.printInfo());

        System.out.println("\n--- Фільтрація типів з використанням instanceof ---\n");

        for(Person p : people) {
            if (p instanceof Student) {
                Student student = (Student) p;
                System.out.println("Знайдено студента: " + student.getSurname() + " " + student.getName());
            } else if (p instanceof Lecturer) {
                Lecturer lecturer = (Lecturer) p;
                System.out.println("Знайдено викладача: " + lecturer.getSurname() + " " + lecturer.getName());
            }
        }
    }
}
