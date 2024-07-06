//Write a java program to check whether a number is divisible by 5 and 11 or not.


import java.util.Scanner;

public class Divisble{
    public static void main(String[] args)
    {
            Scanner value = new Scanner(System.in);

            System.out.println("Enter a number to check whether it is divisible \n by 5 and 11 or not:- ");

            int num= value.nextInt();

            if(num%5==0 && num%11==0){
                System.out.println("The number is divisible by 5 and 11");
            }
            else{
                System.out.println("The number is not divisible by 5 and 11");
            }
    }
}