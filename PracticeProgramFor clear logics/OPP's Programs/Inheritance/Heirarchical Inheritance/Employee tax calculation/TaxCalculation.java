public class TaxCalculation {
    public static void main(String[] args) {
        Developer dvr = new Developer("Samya", 101, 40000.0, 5000.0, 3000.0);
        Manager mgr = new Manager("Manya", 102, 60000.0, 7000.0, 4000.0, 10000.0);
        Trainer trainer = new Trainer("Bob Brown", 103, 45000, 5000, 3500, 5, 2000);
        Sourcing sourcing = new Sourcing("Alice Green", 104, 30000, 4000, 2000, 10, 7, 1500);
        TaxUtil taxUtil = new TaxUtil();
        System.out.println("---------------------------------Tax for Developer---------------------------------------------");
        System.out.println(dvr);
        System.out.println("Tax: "+taxUtil.calculateTax(dvr));
        System.out.println();
        System.out.println("---------------------------------Tax for Manager---------------------------------------------");
        System.out.println(mgr);
        System.out.println("Tax: "+taxUtil.calculateTax(mgr));
        System.out.println();
        System.out.println("---------------------------------Tax for Trainer---------------------------------------------");
        System.out.println(trainer);
        System.out.println("Tax: "+taxUtil.calculateTax(trainer));
        System.out.println();
        System.out.println("---------------------------------Tax for Souricng---------------------------------------------");
        System.out.println(sourcing);
        System.out.println("Tax: "+taxUtil.calculateTax(sourcing));
        System.out.println();
    }
}
