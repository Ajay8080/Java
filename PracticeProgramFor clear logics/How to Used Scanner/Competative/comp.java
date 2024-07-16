/* In a competitive
examination, there were 150 questions. One candidate got 80% correct and the
other candidate 72% correct. Write a program to calculate and display the
correct answers each candidate got. */

import java.util.Scanner;

public class comp{
    public void display(){
        int que = 150;
        double per;

        Scanner sc = new Scanner(System.in);
        System.out.println("per");
        per = sc.nextDouble();
        System.out.println("percentage "+per);
        double corrans = (per /100)*que;
        System.out.println(corrans);

    }
public static void main(String[] args) {
    comp s= new comp();
    s.display();
}
   
}