package Cards;

public class Gold extends Standard {
    private int lunchSum;
    private int bonus;

    public Gold(String number1, String pin1, String cvv1, int sum1) {
        super(number1, pin1, cvv1, sum1);
        lunchSum = 100000;
    }

    public int getLunchSum() {
        return lunchSum;
    }

    public int getBonus() {
        return bonus;
    }

    public int lunchMoney(int money) {
        if (money > 0 && money <= lunchSum) {
            lunchSum = lunchSum - money;
        } else {
            System.out.println("You do not have enough money");
            System.exit(9);
        }
        return lunchSum;
    }

    @Override
    public int getMoney(int takenMoney) {
        if (takenMoney <= sum && takenMoney > 0) {
            sum = sum - takenMoney;
            bonus += 2;
        } else {
            System.out.println("You do not have enough money");
            System.exit(5);
        }
        return sum;
    }


}

