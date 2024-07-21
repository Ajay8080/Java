// break statement using for do while

public class Break{
    public void showData(){
        int i=1;
        do{
            System.out.println(i);
            if(i==5){
                break;
            }
            i++;
        } while(i<10);
    }
    public static void main(String[] args) {
        Break b = new Break();
        b.showData();
    }
}