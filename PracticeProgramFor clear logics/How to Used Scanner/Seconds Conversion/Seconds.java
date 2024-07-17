/*Write a program to
input the time in seconds. Display the time after converting them into hours,
minutes and seconds.

Sample Input: Time in seconds 5420

Sample Output: 1 Hour 30 Minutes 20 Seconds
 */

 import java.util.Scanner;

 public class Seconds{
    void display(int Seconds){
        int hour = Seconds / 3600;
        int min = (Seconds % 3600)/ 60;
        int sec = Seconds % 60;
        System.out.println(hour+" Hour "+min+" minute "+sec+" Seconds");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter seconds: ");
        int seconds = sc.nextInt();
        System.out.println("Seconds: "+seconds);
        Seconds obj = new Seconds();
        obj.display(seconds);
    }
 }