// Print upto 10 numbers using for loop

public class Numbers{

    public static void getNumbers(int n){

        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        getNumbers(10);
    }
}
