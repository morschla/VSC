public class BandBoosterTestser{

    public static void main(String[] args) {
        BandBooster b1 = new BandBooster("Joe Mama");
        BandBooster b2 = new BandBooster("Alex");
        b1.updateSales(10);
        System.out.println(b1);
        b1.updateSales(20);
        b2.updateSales(25);
        System.out.println(b1);
        System.out.println(b2);
    }

}