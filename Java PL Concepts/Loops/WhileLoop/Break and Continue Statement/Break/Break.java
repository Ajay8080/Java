// Break Statement using while

public class Break{
    public void showData(){
        int i=1;
        while(i<10){
            System.out.println(i);
            if(i==6){
                break;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Break obj = new Break();
        obj.showData();
    }
}