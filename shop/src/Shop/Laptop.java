public abstract class Laptop extends Product {
    protected int RAM;
    protected int memory;

    protected String processor;
    protected boolean isNotRAM = true;
    protected boolean isNotProcessor = true;
    protected int sumForMonth;


    Laptop(int costPrice, int price, int dataOfManufacture, int RAM, int memory, String processor) {
        super(costPrice, price, dataOfManufacture);
        this.RAM = setRAM(RAM);
    }

    public int setRAM(int RAM) {
        int[] RAMarr = new int[]{4, 8, 16, 34, 64, 128, 256, 512, 1024};
        for (int i = 0; i < RAMarr.length; i++) {
            if (RAM == RAMarr[i]) {
                isNotRAM = false;
                this.RAM = RAM;
            }
        }
        if (isNotRAM) {
            System.exit(14);
        }
        return RAM;
    }

    public void setMemory(int memory) {
        int[] RAMarr = new int[]{128, 256, 512, 1024};
        for (int i = 1; i < RAMarr.length; i++) {
            if (RAM == RAMarr[i]) {
                this.RAM = RAM;
            }
        }
    }
    public abstract String setProcessor(String processor);
    public abstract void coupons(Business card);
    public void sumOfMonthsCredit() {
        sumForMonth = price / monthsOfCredits;
    }

}
