package Cards;

public class Standard {
    private String number;
    private String pin;
    private String cvv;
    protected int sum;

    public Standard(String number1, String pin1, String cvv1, int sum1) {
        number = setNumber(number1);
        pin = setPin(pin1);
        cvv = setCvv(cvv1);
        sum = setSum(sum1);
    }

    private String setNumber(String number) {
        if (number.length() == 19) {
            this.number = number;
        } else {
            System.out.println("Wrong data input");
            System.exit(1);
        }
        return number;
    }

    private String setPin(String pin) {
        if (pin.length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Wrong data input");
            System.exit(2);
        }
        return pin;
    }

    private String setCvv(String cvv) {
        if (cvv.length() == 3) {
            this.cvv = cvv;
        } else {
            System.out.println("Wrong data input");
            System.exit(3);
        }
        return cvv;
    }

    private int setSum(int sum) {
        if (sum >= 0 && sum <= 10000000) {
            this.sum = sum;
        } else {
            System.out.println("Wrong data input");
            System.exit(4);
        }
        return sum;
    }

    public String getNumber() {
        return number;
    }

    public String getPin() {
        return pin;
    }

    public String getCvv() {
        return cvv;
    }

    public int getSum() {
        return sum;
    }

    public int getMoney(int takenMoney) {
        if (takenMoney <= sum && takenMoney > 0) {
            sum = sum - takenMoney;
        } else {
            System.out.println("You do not have enough money");
            System.exit(5);
        }
        return sum;
    }

    public int inMoney(int inputMoney) {
        if (inputMoney > 0 && inputMoney + sum <= 10000000) {
            sum = sum + inputMoney;
        } else {
            System.out.println("You cross you limit of your card");
            System.exit(6);
        }
        return sum;
    }

    public int onlinePurchase(int takenMoney) {
        if (takenMoney <= sum && takenMoney > 0) {
            sum = sum - takenMoney;
        } else {
            System.out.println("You do not have enough money");
            System.exit(8);
        }
        return sum;
    }
}

