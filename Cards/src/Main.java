public class Main {
    public static void main(String[] args) {
        Standart card1 = new Standart("1547 3584 5415 1546", "1547", "541", 150000);
        card1.inMoney(10000);
        System.out.println(card1.getSum());
        card1.getMoney(15000);
        System.out.println(card1.getSum());
        Business card = new Business("1547 3584 5415 1546", "1547", "541", 150000);
        card.duty();
        System.out.println(card.getSum1());
        Gold card2 = new Gold("1547 3584 5415 1546", "1547", "541", 1000000);
        System.out.println(card2.getLunchSum());
        card2.lunchMoney(15000);
        System.out.println(card2.getLunchSum());
        Gold card4 = new Gold("1547 3584 5415 1546", "5752", "154", 100);
    }
}
