public class MacBook extends Laptop {
    MacBook(int costPrice, int price, int dataOfManufacture, int RAM, int memory, String processor) {
        super(costPrice, price, dataOfManufacture, RAM, memory, processor);
        this.processor = setProcessor(processor);
    }

    @Override
    public String setProcessor(String processor) {
        String[] processors = new String[]{"M1", "M1 Pro", "M1 Max", "M1 Ultra", "M2", "M2 Pro", "M2 Max"};
        for (int i = 0; i < processors.length; i++) {
            if (processor == processors[i]) {
                isNotProcessor = false;
                this.processor = processor;
            }
        }
        if (isNotProcessor) {
            System.exit(15);
        }
        return processor;
    }

    @Override
    public int setCostPrice(int costPrice) {
        if (costPrice >= 700000 && costPrice <= 3000000) {
        } else {
            System.exit(6);
        }
        return costPrice;
    }

    @Override
    public int setPrice(int price) {
        if (price >= 800000 && price <= 3000000) {
        } else {
            System.exit(7);
        }
        return price;
    }


    @Override
    public void coupons(Business card) {
        if (count == 5) {
            count = 0;
            price = (int) (price * 0.95);
        } else {
            System.out.println("You do not have enough coupons");
            System.exit(8);
        }
    }


    @Override
    public void creditSum(int monthsOfCredits) {
        this.monthsOfCredits = monthsOfCredits;
        originalPrice = price;
        if (monthsOfCredits == 12) {
            price = (int) (price * 1.05);
        } else if (monthsOfCredits == 24) {
            price = (int) (price * 1.1);
        } else {
            System.exit(9);
        }
    }
}
