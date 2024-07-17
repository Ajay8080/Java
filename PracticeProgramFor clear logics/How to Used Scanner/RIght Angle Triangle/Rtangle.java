/* Write a program in
Java to calculate and display the hypotenuse of a Right-Angled Triangle by
taking perpendicular and base as inputs.

 h = √p2 + b2
 */
import java.util.Scanner;
// import java.util.Lang;

public class Rtangle{
    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of perpendicular: ");
        int p = sc.nextInt();
        System.out.println("Enter the value of base: ");
        int b = sc.nextInt();
        System.out.println("Hypotenuse: "+Math.sqrt(p*p + b*b));
    }
    public static void main(String[] args) {
        Rtangle r = new Rtangle();
        r.getDetails();

    }
}
