/*A shopkeeper sells
two calculators for the same price. He earns 20% profit on one and suffers a
loss of 20% on the other. Write a program to find his total cost price of the
calculators by taking selling price as input.

 CP = (SP / (1 + (profit / 100))) (when profit)

         CP
= (SP / (1 - (loss / 100))) (when loss) */
import java.util.Scanner;
public class Sells{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sp;
        System.out.println("Enter the selling price of the calculators: ");
        sp = sc.nextInt();
        double profit ;
        double loss ;
        System.out.println("Profit: ");
        profit = sc.nextInt();
        System.out.println("Loss: ");
        loss = sc.nextInt();
        double cp = 0;
        if (profit > 0) {
            cp = (sp / (1 + (profit / 100)));
            } else if (loss > 0) {
                cp = (sp / (1 - (loss / 100)));
                } else {
                    System.out.println("Invalid Input");
                    }
                    System.out.println("Total Cost Price of the calculators is " + cp);
                }
            
}