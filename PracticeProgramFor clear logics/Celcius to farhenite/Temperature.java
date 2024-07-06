/* A program that converts a temperature from Celsius to 
Fahrenheit.(fahrenheit = (celsius * 9/5) + 32 ). */

import java.util.Scanner;

public class Temperature{
    public static void main(String[] args){
        {
            Scanner temp= new Scanner(System.in);

            System.out.println("Enter the celcius- ");
            double c = temp.nextDouble();
            double f = (c * 9/5) + 32 ;
            System.out.println("The fahrenheit is- "+f);
           

     
        }   
        
    }
}