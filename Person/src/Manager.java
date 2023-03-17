public class Manager extends Employee {
    String department;

    Manager(String name, String surname, String address, String phoneNumber, String specialization, int salary, String department1) {
        super(name, surname, address, phoneNumber, specialization, salary);
        this.department = setDepartment(department1);
    }

    public String setDepartment(String department) {
        if (department.equals("production")) {
            this.department = department;
        } else {
            System.exit(1);
        }
        return department;
    }
}
