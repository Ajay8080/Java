// Print EVen and odd numbers separate upto 10 using for loop

public class EvenOdd{

    public static void getInput(int n){

        for(int i=1; i<=n; i++){
        
                System.out.println("Even Number is "+i*2);
          
        }

        System.out.println("--------------------");

        for(int i=1; i<=n; i++){
        
            System.out.println("Odd Number is "+(i*2+1));
      
    }
    }

    public static void main(String[] args) {
        getInput(10);
    }
}