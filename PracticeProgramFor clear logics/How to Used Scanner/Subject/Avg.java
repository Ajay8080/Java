/*n your semester
examination, you have appeared for six subjects. Write a program in Java to
calculate the average mark obtained and finally display the marks in
rounded-off form.

Take six subjects’ marks as inputs. */
import java.util.Scanner;
public class Avg {
    void display(){
        int s;
        int total =0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=6; i++){
            System.out.println("Enter subject"+i);
            s = sc.nextInt();
            System.out.println("Sybject"+i+" = "+s);
            total+=s;
        }
        System.out.println("Total = "+total);
        double avg= total/6;
        System.out.println("Average: "+avg);

    }
    public static void main(String[] args) {
        Avg avg  = new Avg();
        avg.display();
    }
    
}
