public class Tester {
    public static void main(String[] args) {
        InventoryItem i = new InventoryItem("Apple", 10, 15);
        i.claculateTotalValue();
        System.out.println("Item: "+i.getName());
        System.out.println("price: "+i.getPrice());
        System.out.println("Quantity: "+i.getQuantity());
        System.out.println("totalCost: "+i.claculateTotalValue());
    }
}
