public abstract class Product {
    protected int costPrice;
    protected int price;
    protected int dataOfManufacture;
    protected int count = 0;
    protected int monthsOfCredits;
    protected int sumOfPercent;
    protected int sumOfPercentPerMonth;
    protected int originalPrice;

    Product(int costPrice, int price, int dataOfManufacture) {
        this.costPrice = setCostPrice(costPrice);
        this.price = setPrice(price);
        this.dataOfManufacture = setDataOfManufacture(dataOfManufacture);
    }

    public abstract int setCostPrice(int costPrice);

    public abstract int setPrice(int price);

    public int setDataOfManufacture(int dataOfManufacture) {
        if (dataOfManufacture >= 2019 && dataOfManufacture <= 2023) {
            this.dataOfManufacture = dataOfManufacture;
        } else {
            System.exit(4);
        }
        return dataOfManufacture;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public int getPrice() {
        return price;
    }

    public int getDataOfManufacture() {
        return dataOfManufacture;
    }

    public void purchase(Cards card) {
        if (card.getSum() >= price) {
            while (count < 5) {
                count++;
            }
            card.sum -= price;
            System.out.println("Thank you for your recent purchase");
        } else {
            System.out.println("Transaction was rejected");
            System.exit(5);
        }
    }

    public abstract void coupons(Business card);

    public abstract void creditSum(int monthsOfCredits);
    public abstract void sumOfMonthsCredit();
}




