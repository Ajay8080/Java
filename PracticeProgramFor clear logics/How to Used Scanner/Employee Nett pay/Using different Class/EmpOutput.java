import java.util.Scanner;
public class EmpOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpInput e = new EmpInput();
        System.out.println("Enter BasicPay: ");
        int basicPay = sc.nextInt();
        System.out.println("BasicPay: "+basicPay);
        e.getbasicPay(basicPay);
        e.getDisplay();
    }
}
