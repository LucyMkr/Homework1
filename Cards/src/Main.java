public class Main {
    public static void main(String[] args) {
//        Cards.Standard card1 = new Cards.Standard("1547 3584 5415 1546", "1547", "541", 150000, "Lilia", "Matevosyan", 2050);
//        card1.inMoney(10000);
//        System.out.println(card1.getSum());
//        card1.getMoney(15000);
//        System.out.println(card1.getSum());
//        card1.onlinePurchase(1000);
//        System.out.println(card1.getSum());
//        System.out.println("work with standard cards is finished");


        Cards.Business card2 = new Cards.Business("1547 3584 5415 1546", "1547", "541", 1000,"Lala", "Mirzoyan", 2055);
//        card2.duty();
//        System.out.println(card2.getSum());
//        card2.onlinePurchase(1000);
//        System.out.println(card2.getSum());
        System.out.println(card2);
        System.out.println("work with business cards is finished");


        Cards.Gold card3 = new Cards.Gold("1547 3584 5415 1545", "1547", "541", 1000000, "Karine", "Levonyan", 2050 );
//        System.out.println(card3.getLunchSum());
//        card3.lunchMoney(15000);
//        System.out.println(card3.getLunchSum());
        card3.getMoney(1500);
        System.out.println(card3.getBonus());
        System.out.println(card3);
        System.out.println("work with gold cards is finished");
    }
}
