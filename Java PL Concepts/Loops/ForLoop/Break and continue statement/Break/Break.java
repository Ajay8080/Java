// Break statement using for loop

public class Break{

    public void displayData(){

        for(int i=0; i<10; i++){
            System.out.println(i);
            if(i==5){
                break;
            }
        }
    }
    public static void main(String[] args){
        Break d = new Break();
        d.displayData();
    }
}