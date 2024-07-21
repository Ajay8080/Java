// Print upto 10 numbers using do while loop

public class Numbers{

        public static void getNumbers(int n, int i)
        {
                do{
                System.out.println(i);
                    i++;
                }
                while(i<=n);
        }
        public static void main(String[] args){

                    getNumbers(10, 15);
        }
}