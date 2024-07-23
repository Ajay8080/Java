/*Q9. Write the program in Java to display the following pattern:

9 9 9 9 9
7 7 7 7 7
5 5 5 5 5
3 3 3 3 3
1 1 1 1 1
 */
class Number{
    public static void main(String[] args){
        for(int i=9; i>=1; i-=2){
            for(int j=1; j<=5; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}