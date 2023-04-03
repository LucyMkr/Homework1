public class Dell extends Laptop {
    Dell(int costPrice, int price, int dataOfManufacture, int RAM, int memory, String processor) {
        super(costPrice, price, dataOfManufacture, RAM, memory, processor);
    }

    @Override
    public int setCostPrice(int costPrice) {
        if (costPrice >= 300000 && costPrice <= 1400000) {
        } else {
            System.exit(10);
        }
        return costPrice;
    }

    @Override
    public int setPrice(int price) {
        if (price >= 300000 && price <= 1500000) {
        } else {
            System.exit(11);
        }
        return price;
    }

    @Override
    public String setProcessor(String processor) {
        String[] processors = new String[]{"i3", "i5", "i7", "i9", "i12"};
        for (int i = 0; i < processors.length; i++) {
            if (processor == processors[i]) {
                isNotProcessor = false;
                this.processor = processor;
            }
        }
        return processor;
    }

    @Override
    public void coupons(Business card) {
        if (count == 5) {
            count = 0;
            price = (int) (price * 0.9);
        } else {
            System.out.println("You do not have enough coupons");
            System.exit(12);
        }
    }
    @Override
    public void creditSum(int monthsOfCredits) {
        this.monthsOfCredits =monthsOfCredits;
        if (monthsOfCredits == 12) {
            price = (int) (price * 1.2);
        } else if (monthsOfCredits == 24) {
            price = (int) (price * 1.5);
        } else {
            System.exit(13);
        }
    }

}
