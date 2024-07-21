import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Comp c = new Comp();
    System.out.println("Enter your percentage :  ");
    int per = sc.nextInt();
    System.out.println("percentage: "+per);
    c.getPer(per);
     c.display();
     
    }
}
