public class Employee extends Person {
    String specialization;
    int salary;
    Employee(String name, String surname, String address, String phoneNumber, String specialization, int salary) {
        super(name, surname, address, phoneNumber);
        this.specialization = specialization;
        this.salary = salary;
    }
}
