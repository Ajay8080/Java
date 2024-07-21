// First n Even Numbers Sum

public class Esum{
    public static void main(String[] args){
        int n = 4;
        int sum=0;
        for(int i=1; i<=n; i++){
            sum = sum+(2*i);
        }
        System.out.println("First N Even Numbers Sum are :- "+sum);
    }
}