/*Write a program to enter three numbers and a character.
Find and display sum of the numbers if the given character is ’s’ and product of
the numbers if the given character is 'p'. The program displays a message "Invalid
Character" if the user enters a letter other than 's' or 'p'.
 */

 public class Choice{

    public static void main(String[] args){
        int a=10,b=20,c=15;
        char ch='s';
        if(ch=='s'){
            System.out.println("Sum of three numbers is "+(a+b+c));
        }
        else if(ch=='m'){
            System.out.println("Product of three numbers is "+(a*b*c));
        }
        else{
            System.out.println("Invalid Character");
        }
    
    }
 }