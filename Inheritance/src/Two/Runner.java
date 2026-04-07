package Two;

public class Runner {
    public static void main(String[] args) {

        Employee e1 = new Manager("Aditya", 101, 80000, 10);
        Employee e2 = new Developer("Deepesh", 102, 60000, "Java");
        Employee e3 = new Intern("Amar", 103, 20000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}