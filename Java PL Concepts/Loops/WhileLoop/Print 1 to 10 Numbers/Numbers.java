// Print the upto 10 natural numbers using while loop

public class Numbers{

    public static void getNumber(int n, int i){

        while(i<=n){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args){
        getNumber(10,0);
    }
}