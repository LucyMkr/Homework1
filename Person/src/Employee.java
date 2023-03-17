public class Employee extends Person {
    private String specialization;
    private int salary;
    Employee(String name, String surname, String address, String phoneNumber, String specialization1, int salary1) {
        super(name, surname, address, phoneNumber);
        specialization = setSpecialization(specialization1);
        salary = setSalary(salary1);
    }

    private String setSpecialization(String specialization) {
        if (specialization.equals( "Email Marketer") || specialization.equals( "Digital Marketing Manager")|| specialization.equals("Growth Marketer")) {
            this.specialization = specialization;
        } else {
            System.exit(1);
        }
        return specialization;
    }

    private int setSalary(int salary){
        if (salary < 63000 || salary >300000 ){
            System.exit(1);
        }else {
            this.salary = salary;
        }
        return salary;
    }


}
