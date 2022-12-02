public class Main {
    public static void main(String[] args) {
        double priceTicket = 3540.80; //цена билета, руб
        int priceMile = 20; //цена бонусной мили, руб

        int bonus = (int) priceTicket / priceMile;

        System.out.println("Начислено " + bonus + " бонусных миль");

    }

}
