package School;

public class Director extends Teacher {
    private String name;
    private String surname;
    private int salary;

    public Director(String n, String sn, int hw, int s) {
        super(n, sn, hw);
        salary = s;

    }

    public int setSalary(int salary) {
        if (salary < 100000 && salary > 300000) {
            this.salary = salary;
        } else {
            System.exit(6);
        }
        return salary;
    }

    protected int setHourOfWork(int hourOfWork) {
        if (hourOfWork >= 10 && hourOfWork <= 15) {
            super.hourOfWork = hourOfWork;
        } else {
            System.exit(3);
        }
        return hourOfWork;
    }

    @Override
    public void salary() {
        super.salary();
        super.salary += this.salary;
    }
}
