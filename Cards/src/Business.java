public class Business extends Standart{
    private int sum1;
    private int count = 1;
    Business(String number1, String pin1, String cvv1, int sum1) {
        super(number1, pin1, cvv1, sum1);

    }
    protected void duty(){
        while (count > 0){
            count--;
            sum1 = getSum() + 100000;
        }
    }

    protected int getSum1() {
        return sum1;
    }
}
