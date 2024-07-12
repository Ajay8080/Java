/*WAP to input unit price and quantity of a product.Claculate total cost,discount
20% if the total purchase is more than Rs20000 otherwise discount is 10%.
Also find the net price to be paid. */
public class Watch{

    public void getdetails(int price, int quantiy){

        int total = price * quantiy;
        if(total > 20000){
            double totalCost = total-(total * 0.10);
            System.out.println("Net price is "+totalCost);
        }
        else{
            double totalCost = total-(total * 0.20);
            System.out.println("Net price is "+totalCost);
        }
    }
    public static void main(String[] args) {
        Watch w = new Watch();
        w.getdetails(15000, 1);
    }
}