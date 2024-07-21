/*
 * 
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 * 
 */
public class Star{
    void getInput(){
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void getRvrInput(){
        for(int i=1; i<=4; i++)  {
            for(int j=4; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
      }
      public static void main(String[] args) {
        Star s = new Star();
        s.getInput();
        s.getRvrInput();
      }
}

/*
 Output:

* 
* *       
* * *     
* * * *   
* * * * * 
* * * *   
* * *     
* *
*

*/