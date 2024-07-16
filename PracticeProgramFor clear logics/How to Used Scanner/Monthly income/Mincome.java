/*A person is paid ₹350
for each day he works and fined ₹30 for each day he remains absent. Write a
program to calculate and display his monthly income, if he is present for 25
days and remains absent for 5 days.
 */

 import java.util.Scanner;

 public class Mincome{
    public static void main(String[] args){
        int Eday = 350;
        int fine = 30;
        int absent;
        int present;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your absent day ");
        absent = sc.nextInt();
        
        System.out.println("Enter your present day ");
        present = sc.nextInt();
        System.out.println(present);
        System.out.println(absent);

        int Monthly= (present * Eday)-(absent * fine);
        System.out.println("Monthly income is "+Monthly);
    }

 }