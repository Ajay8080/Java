// Continue statement using do while loop

public class Continue{
    public void getData(){
        int i=0;
        do{
            i++;
            if(i==5 || i==6 || i==7){
                continue;
            }
            System.out.println(i);
        }
        while(i<=10);
    }
    public static void main(String[] args){
        Continue obj=new Continue();
        obj.getData();
    }
}