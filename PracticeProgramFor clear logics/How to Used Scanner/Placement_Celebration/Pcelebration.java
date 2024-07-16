/*/*Write a program by
using a class 'Placement_Celebration' without any data members but having only
functions as per the specifications given below:

class name : 'Placement_Celebration’

void display1( ): To print venue, place and
reporting time.

void display2( ): To print number of students,
friends of students and parents accompanying .

Write a main class to create an object of the
class 'Picnic' and call the functions display1() and display2( ). */
 
import java.util.Scanner;

public class Pcelebration {
   static Scanner sc1 = new Scanner(System.in);
    public void display1(){
        String venue,place;
        int Rtime;
        
         
        System.out.println("Enter the venue ");
        venue = sc1.nextLine();

        System.out.println("Enter the place ");
        place = sc1.nextLine();

        System.out.println("Enter the Reporting-Time ");
        Rtime = sc1.nextInt();

        System.out.println("Venue "+venue);
        System.out.println("Place "+place);
        System.out.println("Reporting Time "+Rtime);
    }

    public void display2(){
        int nStd;
        int fstd;
        int parents;

        System.out.println("Enter number of students ");
        nStd = sc1.nextInt();

        System.out.println("Enter the Students of friends  ");
        fstd = sc1.nextInt();

        System.out.println("Enter the number of Parents ");
        parents = sc1.nextInt();

        System.out.println("NUmber of students "+nStd);
        System.out.println("Friends of Students "+fstd);
        System.out.println("Parents "+parents);
    }
    public static void main(String[] args){
        Pcelebration picnic = new Pcelebration();
        picnic.display1();
        picnic.display2();
    }
}
