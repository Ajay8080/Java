public class Tester {
    public static void main(String[] args) {
        Ticket regularTicket = new  Ticket("Concert", 101, 50.0);
        VipTicket vipTicket = new VipTicket("VipConcert", 201, 100.0,"BackStage Concert");
        StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);
        System.out.println();

        System.out.println("-----------------RegularTicket-----------------");
        regularTicket.displayInfo();

        System.out.println();

        System.out.println("-----------------VipTicket---------------------");
        vipTicket.displayInfo();

        System.out.println();

        System.out.println("----------------StundentTicket------------------");
        studentTicket.displayInfo();

    }
}
