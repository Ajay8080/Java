/*Q5. Write the program in Java to display the following pattern:

1 3 5 7 9
1 3 5 7
1 3 5
1 3
1
 */
class Number{
    public static void main(String[] args){
        for(int i=5; i>=1; i--){
            for(int j=1; j<=(2*i-1); j+=2){
                
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
}