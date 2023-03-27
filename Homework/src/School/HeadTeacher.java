package School;

public class HeadTeacher extends Teacher {
    public HeadTeacher(String n, String sn, int hw, double c) {
        super(n, sn, hw);
        coefficient = setCoefficient(c);
    }

    public double setCoefficient(double coefficient) {
        if (coefficient > 1.5 && coefficient < 2) {
            this.coefficient = coefficient;
        } else {
            System.exit(4);
        }
        return coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    @Override
    public void salary() {
        super.salary();
        salary *= coefficient;
    }
}
