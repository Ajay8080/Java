/* Create a method which take two different integer as inout 
 * and display the greatest among them
 */

 public class Great{
    public void getInteger(int num1,int num2){

        if(num1 > num2){
            System.out.println(num1+"  is the greatest number");
        }
        else if(num2 > num1){
            System.out.println(num2+" is the greatest number");
        }
        else{
        System.out.println("num1 and num2 both are same number");    
        }
    }
    public static void main(String[] args){
        Great obj= new Great();
        obj.getInteger(10,20);
    }
 }