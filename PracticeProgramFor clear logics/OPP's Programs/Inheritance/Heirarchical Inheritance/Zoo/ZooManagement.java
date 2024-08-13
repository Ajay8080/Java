public class ZooManagement {
    public static void main(String[] args) {
        Lion l = new Lion("Ghost", 5, 25);
        Elephant e = new Elephant("Dumbo", 14, 150.6f);
        System.out.println("------------------LION-----------------");
        l.displayInfo();
        l.makeSound();

        System.out.println();

        System.out.println("-----------------ELEPHANT-------------------");
        e.displayInfo();
        e.makeSound();
    }
}
