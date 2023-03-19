public class Standart {
    private String number;
    private String pin;
    private String cvv;
    private int sum;

    Standart(String number1, String pin1, String cvv1, int sum1) {
        number = setNumber(number1);
        pin = setPin(pin1);
        cvv = setCvv(cvv1);
        sum = setSum(sum1);
    }

    private String setNumber(String number) {
        if (number.length() == 19) {
            this.number = number;
        } else {
            System.exit(1);
        }
        return number;
    }

    private String setPin(String pin) {
        if (pin.length() == 4) {
            this.pin = pin;
        } else {
            System.exit(2);
        }
        return pin;
    }

    private String setCvv(String cvv) {
        if (cvv.length() == 3) {
            this.cvv = cvv;
        } else {
            System.exit(3);
        }
        return cvv;
    }

    private int setSum(int sum) {
        if (sum >= 0 && sum <= 10000000) {
            this.sum = sum;
        } else {
            System.exit(4);
        }
        return sum;
    }
    protected String getNumber() {
        return number;
    }

    protected String getPin() {
        return pin;
    }

    protected String getCvv() {
        return cvv;
    }

    protected int getSum() {
        return sum;
    }

    protected int getMoney(int takenMoney) {
        if (takenMoney <= sum) {
            sum = sum - takenMoney;
        }
        else {
            System.exit(5);
        }
        return sum;
    }

    protected int inMoney(int inputMoney) {
        if (inputMoney > 0 && inputMoney + sum <= 10000000 ){
            sum = sum + inputMoney;
        }else {
            System.exit(6);
        }
        return sum;
    }
}

