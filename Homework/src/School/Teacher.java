package School;

public class Teacher {
    private String name;
    private String surname;
    protected int hourOfWork;
    private int sumOfHour;
    protected int salary;
    private int count = 1;
    protected double coefficient = 1;

    public Teacher(String n, String sn, int hw) {
        sumOfHour = 5000;
        name = setName(n);
        surname = setSurname(sn);
        hourOfWork = setHourOfWork(hw);
    }

    private String setName(String name) {
        if (name.length() < 2) {
            System.exit(1);
        } else {
            this.name = name;
        }
        return name;
    }

    private String setSurname(String surname) {
        if (surname.length() < 1) {
            System.exit(2);
        } else {
            this.name = name;
        }
        return surname;
    }

    protected int setHourOfWork(int hourOfWork) {
        if (hourOfWork >= 15 && hourOfWork <= 35) {
            this.hourOfWork = hourOfWork;
        } else {
            System.exit(3);
        }
        return hourOfWork;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHourOfWork() {
        return hourOfWork;
    }

    public int getSumOfHour() {
        return sumOfHour;
    }

    public int getSalary() {
        return salary;
    }

    public void salary() {
        if (count > 0) {
            count--;
            salary = (hourOfWork * sumOfHour);
        } else {
            System.out.println("You cannot multiply any more");
            System.exit(5);
        }
    }
}
