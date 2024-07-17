/*String name;
    String fname;
    String dob;
    String bgroup;
    long AdharNum;
    String state; */
import java.util.Scanner;
public class User { 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Profile p = new Profile();
    System.out.println("Enter your name: ");
    String name = sc.nextLine();

    System.out.println("Enter your Father name: ");
    String fname = sc.nextLine();

    System.out.println("Enter your Blood Group: ");
    String bgroup = sc.nextLine();
    
    System.out.println("Enter your Date of Birth: ");
    String dob = sc.nextLine();

    System.out.println("Enter your Adhar Number: ");
    long AdharNum = sc.nextLong();

    sc.nextLine();
    System.out.println("Enter your state: ");
    String state = sc.nextLine();

    p.setName(name);
    p.setFname(fname);
    p.setBgroup(bgroup);
    p.setDOB(dob);
    p.setAdhar(AdharNum);
    p.setState(state);
    p.display();
    }
}
