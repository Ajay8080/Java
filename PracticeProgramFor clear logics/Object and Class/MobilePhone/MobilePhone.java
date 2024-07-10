/*Design a class MobilePhone with certain attributes and methods.
    Display the details of different mobile phones with suitable
    message. */
    public class MobilePhone{
        String Brand="realme";
        String Model="X7 Pro";
        String Color="Black";
        int Price=25000;
        public void Display(){
            System.out.println("Brand: "+Brand);
            System.out.println("Model: "+Model);
            System.out.println("Color: "+Color);
            System.out.println("Price: "+Price);
            }
        public static void main(String[] args) {
            MobilePhone obj=new MobilePhone();
            obj.Display();
            
        }
    }