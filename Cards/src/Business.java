public class Business extends Standart{
    private int sum1;
    private boolean isNotDone = true;
    Business(String number1, String pin1, String cvv1, int sum1) {
        super(number1, pin1, cvv1, sum1);

    }
    protected void duty(){
        if (isNotDone){
            isNotDone = false;
            sum1 = getSum() + 100000;
        }else{
            System.out.println("You cannot add more money");
            System.exit(6);
        }
    }

    protected int getSum1() {
        return sum1;
    }
}
