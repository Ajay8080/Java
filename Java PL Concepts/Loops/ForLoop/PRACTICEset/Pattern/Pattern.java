/*  Write the program in java using for loop for print the following pattern

* * * *
* * *
* *
*

*/
public class Pattern{
    public void getData(){
        int n=4;
        for(int i=n; i>0; i--){
            for(int j=0; j<i;j++){
            System.out.print("*");
        }
        System.out.print("\n");
    }
    }
    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.getData();
    }
}