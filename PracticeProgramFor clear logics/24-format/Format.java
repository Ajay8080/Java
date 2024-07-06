/*Write a java program that takes an hour in the 24-hour format as input and identifies the 
time of day as "Morning," "Afternoon," "Evening," or "Night." 
Implement this using a series of if statements. Ensure that the program also
 checks for invalid input, displaying an appropriate message if the entered hour 
 is not within the valid range (0-23). Present the program with a suitable title and 
 header for clarity.*/

import java.util.Scanner;

public class Format{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Hour in 24-Format: ");
        double Hour =sc.nextDouble();


        System.out.println("------------------------------------");

        if(Hour>=5 && Hour<12){
            System.out.println("Good Morning!!");
        }
        else if(Hour>=12 && Hour < 4){
            System.out.println("Good Afternoon!!");
        }
        else if(Hour >=4 && Hour<8){
            System.out.println("Good Evening!!");
        }
        else if (Hour >=8 && Hour<24) {
            System.out.println("Good Night!!");
            
        }
        else if(Hour>=0&& Hour<6){
            System.out.println("Midnight!!");
        }
        else {
            System.out.println("You Enter wrong yeasr!! Enter Again");
        }
    }

 }
