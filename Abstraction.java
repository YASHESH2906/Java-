import java.util.Scanner;

// Abstract class
abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method
    abstract void showDetails();
}

// Interface
interface Subject {
    void chooseSubject(String subject);

    // Default method in interface
    default void displayInfo() {
        System.out.println("This is a student information system using interfaces and abstraction.");
    }
}

// Student class extends abstract class & implements interface
class Student extends Person implements Subject {
    String subject;

    Student(String name, int age) {
        super(name, age);
    }

    @Override
    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    @Override
    public void chooseSubject(String subject) {
        this.subject = subject;
        System.out.println("Chosen Subject: " + subject);
    }
}

// Main class
public class AbstractionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        // Using abstraction
        Student st = new Student(name, age);

        st.showDetails();           // from abstract class
        st.chooseSubject(subject);  // from interface
        st.displayInfo();           // default method in interface

        sc.close();
    }
}
