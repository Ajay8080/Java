/* Suppose you want to
display your bio-data on the output screen. Write a program in Java to perform
the task in the given format:

Name:

Father's Name:

Date of birth:

Blood Group:

Aadhar Card No.:

State: */

import java.util.Scanner;

public class BioData{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = s1.nextLine();

        System.out.println("Enter your Father name: ");
        String fname = s1.nextLine();

        System.out.println("Enter your date of birth: ");
        String dob = s1.nextLine();

        System.out.println("Enter your blood group: ");
        String Bgroup = s1.nextLine();
        
        
        System.out.println("Enter your Adhar number: ");
        Long Anum = s1.nextLong();
        
        System.out.println("Enter your State name: ");
        String sname = s1.next();

        System.out.println(" name: "+name);
        System.out.println(" Father name: "+fname);
        System.out.println(" Date of Birth : "+dob);
        System.out.println(" Blood Group: "+Bgroup);
        System.out.println(" Adhar Number: "+Anum);
        System.out.println(" State name: "+sname);
    }
}