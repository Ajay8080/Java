// Continue statement using while loop

public class Continue{
    public static void main(String[] args){
        int i=0;
        while(i<10){
            i++;
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}