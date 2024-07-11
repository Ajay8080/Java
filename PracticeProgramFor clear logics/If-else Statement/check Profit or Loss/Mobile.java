/*Q2.

Write a program to input the cost price and the selling price of an article. 
If the selling price is more than the cost price then calculate and 
display actual profit and profit per cent otherwise, calculate and display actual loss and 
loss per cent. If the cost price and the selling price are equal,
 the program displays the message 'Neither profit nor loss'.
 */

 public class Mobile{
    public void getDetails(int sp, int cp){

     if(sp>cp){
         int p = sp-cp;
         System.out.println("The profit is "+p);

         double pp = (p*10)/cp;
         System.out.println("The Profit Percentage is "+pp);
            }

        else if(sp<cp){
            int l=cp-sp;
            System.out.println("The Loss is "+l);

            double lp = (l*100)/sp;
            System.out.println("The Loss Perecntage is "+lp);
        }
        else {
            System.out.println("Neither Profit nor Loss");
        }
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.getDetails(20000, 15000);
    }
}