/* Create a method takes an inetegers input and displays whether 
 * it is armstrong number ot not.
 */

 public class Armstr{
    public void getInteger(){
        int num = 153;
        int n= num;
        int sum =0;

        while(n != 0){
            int r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }

        if(num==sum){
            System.out.println("ARmstrong Number");
        }
        else{
            System.out.println(num+"is not Armstrong number");
        }
    }
        public static void main(String[] args){
            Armstr arm= new Armstr();
            arm.getInteger();
        }
    }

 