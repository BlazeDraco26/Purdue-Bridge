public class Employee {

    public String name;
    public int salary;

    // Default constructor of the class
    public Employee() {
        // Calls the constructor with (String) parameter
        this("New Employee");
    }

    public Employee(String name) {
        // Calls the constructor with (String, int) parameter
        this(name, 0);
    }
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Employee2 {

    public String name;
    public int salary;

    // Default constructor of the class
    public Employee2() {
        // Calls the constructor with (String) parameter
        this.name = "New Employee";
        this.salary = 0;
    }

    public Employee2(String name) {
        // Calls the constructor with (String, int) parameter
        this.name = name;
        this.salary = 0;
    }
    public Employee2(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}