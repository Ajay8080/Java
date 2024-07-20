/*A palindromic prime is a prime number and also palindromic. 
For example, 131, 313, and 757 are prime numbers and also palindromic prime numbers.
 Write a program to create a method that displays the first 10 palindromic prime numbers. */

import java.util.Scanner;

class PprimeNumber {

    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        } else
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        return true;
    }

    public static boolean palindrome(int    num) {
        int rvr = 0;
        int orgnlNum = num;
        int remainder;

        while (num != 0) {
            remainder = num % 10;
            rvr = rvr * 10 + remainder;
            num = num / 10;
        }
        return orgnlNum == rvr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int count = 0;
        while (count < 10) {
            if (prime(number) && palindrome(number)) {
                System.out.println("The number is palindrome and Prime:  " + number);
                count++;
            }
            number++;
        }
    }
}
/*
 * Output:
 * Enter the number:
 * 131
 * The number is palindrome and Prime: 131
 * The number is palindrome and Prime: 151
 * The number is palindrome and Prime: 181
 * The number is palindrome and Prime: 191
 * The number is palindrome and Prime: 313
 * The number is palindrome and Prime: 353
 * The number is palindrome and Prime: 373
 * The number is palindrome and Prime: 383
 * The number is palindrome and Prime: 727
 * The number is palindrome and Prime: 757
 */