 /*Write a Java program to findprime  number upto given number   by using for loop?
input : n = 10.
output :- 2,3,5,7. */ 

public class Loop{
    public static void main(String[] args) {
        int n = 10;
        for(int i=2;i<=n;i++){
            int count = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                    }
                    }
                    if(count==0){
                        System.out.print(i+" ");
                        }
                        }
                        }
                        
}