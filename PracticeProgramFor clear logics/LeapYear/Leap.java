/*Design a program that takes a year as input and determines whethe
r it is a leap year or not. Consider the leap year rules
 (divisible by 4, but not divisible by 100 unless also divisible by 400)
  and use if-else statements to provide the appropriate output.
 */

 import java.util.Scanner;

 public class Leap{

    public static void main(String[] args) {
        {
            Scanner leap= new Scanner(System.in);

            System.out.println("ENter a year:- ");
            int year= leap.nextInt();
            if(year%4==0 && year%100!=0 || year%400==0){
                System.out.println("It is a leap year");
            }
            else{
                System.out.println("It is not a leap year");
        }
    }
 }
}
