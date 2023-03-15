public class Manager extends Employee {
    String department;
    Manager(String name, String surname, String address, String phoneNumber, String specialization, int salary, String department) {
        super(name, surname, address, phoneNumber, specialization, salary);
        this.department = department;
    }
}
