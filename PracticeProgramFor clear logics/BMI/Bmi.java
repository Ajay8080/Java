/*A program that calculates the Body Mass Index (BMI) given the weight in kilograms and height in meters.
	weight in kilograms (kg) divided by height in meters (m) squared.
	(bmi = weight / (height * height);
 */

 import java.util.Scanner;

 public class Bmi{
    public static void main(String[] args){
        Scanner height = new Scanner(System.in);
        Scanner weight = new Scanner(System.in);
      int bmi;

        System.out.println("Enter Height: ");
        int h=height.nextInt();

        System.out.println("Enter weight:- ");
        int w = weight.nextInt();
        bmi = w/(h*h);
        System.out.println("BMI is: "+bmi);

    }
 }
