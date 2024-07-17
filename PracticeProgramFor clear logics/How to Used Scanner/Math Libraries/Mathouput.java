import java.util.Scanner;
public class Mathouput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathInput n = new MathInput();

        System.out.println("Enter any Number: ");
        int num = sc.nextInt();

        n.getInput(num);
        n.display();
    }
}
