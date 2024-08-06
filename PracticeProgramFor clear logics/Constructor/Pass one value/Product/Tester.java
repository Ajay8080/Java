public class Tester {
    public static void main(String[] args) {
        Product p1 = new Product();
        System.out.println("Default Product");
        p1.displayInfo();
        System.out.println();
        System.out.println("User Product");
        Product p2 = new Product("Laptop", 101, 75000);
        p2.displayInfo();
        System.out.println();
        System.out.println("Invalid Product Creation");
        Product p3 = new Product("",-34,-5688);
        System.out.println();
        p3.displayInfo();
    }
}
