public class OnlineShoping {
    public static void main(String [] args){
        Electronics e = new Electronics("Laptop", 65000, "MacBook");
        Clothing c = new Clothing("pant", 2000, "30 CM");
        System.out.println("------------------ELECTRONICS-----------------");
        e.displayInfo();
        System.out.println("Total Cost of laptop: "+e.calculateTotalCost(2));

        System.out.println();

        System.out.println("--------------------CLOTHING--------------------");
        c.displayInfo();
        System.out.println("Total Cost of pant: "+c.calculateTotalCost(10));
    }
}
