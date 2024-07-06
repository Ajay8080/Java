/*Write a program to input 2 numbers and check which is the greatest
between two numbers.
 */

 public class CheckGreater{
    public static void main(String[] args){
        int a=10,b=10;
        if(a>b)
        {
            System.out.println("a is greater than b");
        }
        else if(b>a){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("a and b are equal");
        }
    }
 }