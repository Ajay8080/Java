/*Write a program to
input two unequal numbers. Display the numbers after swapping their values in
the variables without using a third variable.

Sample Input: a = 23, b = 56

Sample Output: a = 56, b = 23
 */

 import java.util.Scanner;

 public class Swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping: a = "+a+" b = "+b);
        a = b;
        b = a;
        System.out.println("After Swapping: a = "+a+" b = "+b);
    }
 }