import java.util.*;

public class Evenodd{

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        int num =sc.nextInt();

        System.out.println(num);

        if(num%2==0){

            System.out.println("Even is "+num);
        }
        else{
            System.out.println("odd is "+num);
        }
        
    }
}