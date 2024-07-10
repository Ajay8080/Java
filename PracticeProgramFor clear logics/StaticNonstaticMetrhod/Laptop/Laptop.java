public class Laptop{
    public void getDetails(double price,double q){
        double total= price*q;
        if(total>20000){
            double d=20;
            double totalCost=total-(total*(d/100));
            System.out.println("The total cost is "+totalCost);
        }
        else{
            double d=10;
            double totalCost=total-(total*(d/100));
            System.out.println("The total cost is "+totalCost);
        }
    }
    public static void main(String[] args) {
        Laptop l= new Laptop();
        l.getDetails(20000,2);
    }
}