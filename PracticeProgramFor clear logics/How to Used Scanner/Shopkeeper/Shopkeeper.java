/*A shopkeeper offers
10% discount on the printed price of a Digital Camera. However, a customer has
to pay 6% GST on the remaining amount. Write a program in Java to calculate the
amount to be paid by the customer taking printed price as an input. */

import java.util.Scanner;

public class Shopkeeper{
    public void display(int Cprice){
        double discount = Cprice * 0.1;
        double gst = Cprice * 0.06;
        double paid = (Cprice - discount)+ gst;
        System.out.println("Customer should be Paid: "+paid);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the Camera Price? ");
        int Cprice = sc.nextInt();
        Shopkeeper Offer = new Shopkeeper();
        System.out.println("Camera price : "+Cprice);
        Offer.display(Cprice);
    }
}