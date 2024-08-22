public class Main {
    public static void main(String[] args) {
        Car c = new Car("Thar", "Roxx", 2024);
        Truck t = new Truck("TATA", "E420", 2022);
        Motorcycle m = new Motorcycle("Bullete", "Thunder bird", 2019);
        System.out.println("---------------------CAR-------------------------");
        c.startEngine();
        System.out.println(c.toString());
        c.calculateRentalCost();
        c.stoppEngine();
        System.out.println();
        System.out.println("---------------------TRUCK-------------------------");
        t.startEngine();
        System.out.println(t.toString());
        t.calculateRentalCost();
        t.stoppEngine();
        System.out.println();
        System.out.println("---------------------MOTOCYCLE-------------------------");
        m.startEngine();
        System.out.println(m.toString());
        m.calculateRentalCost();
        m.stoppEngine();
    }
}
