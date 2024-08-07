public class Tester {
    public static void main(String[] args) {
        Student s = new Student("Om", 101, 19);

        System.out.println("Student Details");
        System.out.println("---------------------------");       
        s.showDetails();
        System.out.println("---------------------------");
        System.out.println();

        Player p = new Player(s);
        System.out.println("Player Details");
        System.out.println("---------------------------");
        p.showDetails();
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Update name of player");
        p.updateName("Shrutik");
        p.showDetails();
        System.out.println();
        System.out.println("Player is ELigible:");
        System.out.println(p.isEligible()?"Yes":"No");
    }
}
