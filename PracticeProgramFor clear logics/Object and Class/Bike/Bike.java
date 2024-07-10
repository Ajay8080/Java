/*Design a class Bike with certain attributes and methods.
    Display the details of different Bikes with suitable
    message. */

    public class Bike{
        String bname="Bajaj";
        String bmodel="Pulsur150NS";
        String bcolor="Black";
        String bprice="Rs. 1,00,000";
        public void display()
        {
            System.out.println("Bike Name: "+bname);
            System.out.println("Bike Model: "+bmodel);
            System.out.println("Bike Color: "+bcolor);
            System.out.println("Bike Price: "+bprice);
            }
            public static void main(String[] args)
            {
                Bike b=new Bike();
                b.display();
                }
                

    }