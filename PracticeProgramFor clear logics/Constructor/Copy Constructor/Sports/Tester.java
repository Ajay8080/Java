public class Tester {
    public static void main(String[] args) {
        Sport s1 = new Sport("Cricket", 11, "Outdoor");
        s1.displayInfo();
        System.out.println();
        Sport s2 = new Sport("Vollyball", 11);
        s2.displayInfo();
        System.out.println();
        Sport s3= new Sport();
        s3.displayInfo();
        System.out.println();
        Sport s4 = new Sport("Football",-1);
        s4.displayInfo();
    }
}
