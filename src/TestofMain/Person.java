package TestofMain;

import java.util.Scanner;

// Дефиниране на клас Person
public class Person {
    // Свойства (полета) на класа
    String name;
    int age;

    // Конструктор на класа
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Метод на класа
    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // Главен метод (начална точка на програмата)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        String name1=sc.nextLine();
        int age=sc.nextInt();
        int age1=sc.nextInt();

        // Създаване на обект от класа Person
        Person person1 = new Person(name, age);
        Person person2 = new Person(name1, age1);

        // Извикване на методите на обектите
        person1.greet();
        person2.greet();
    }
}
