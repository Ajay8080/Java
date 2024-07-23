/*Q8. Write a program in Java to display the following pattern:

5
4 4
3 3 3
2 2 2 2
1 1 1 1 1 */

class Number{
    public static void main(String[] args){
        for(int i=5; i>=1; i--){
            for(int j=5; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}