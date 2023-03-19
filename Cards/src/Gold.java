public class Gold extends Standart{
    private int lunchSum;
    Gold(String number1, String pin1, String cvv1, int sum1) {
        super(number1, pin1, cvv1, sum1);
        lunchSum = 100000;
    }
    protected int getLunchSum() {
        return lunchSum;
    }
    protected int lunchMoney(int money){
        if(money > 0 && money <= lunchSum){
            lunchSum = lunchSum - money;
        }
        return lunchSum;
    }


}

