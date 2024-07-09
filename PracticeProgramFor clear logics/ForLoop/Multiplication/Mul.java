/*Write a Java program to print multiplication table by using for loop?
input : 5.
output :-

5 X 1 = 5.
5 X 2 = 10.
.
.
.
5 X 10 = 50. */

public class Mul{
    public static void main(String[] args) {
        int num = 5;
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
            }
            }
            
}