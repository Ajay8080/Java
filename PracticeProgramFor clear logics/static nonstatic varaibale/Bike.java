
/*WAP for the following requirement:     - Create a class
- Create one Static Variable
- Create two non static variables
-Access and Print the values of static as well as non static variable in main method*/

public class Bike{

    static String name="Bullete";
    String color="Black";
    String Model="Meteroid";

    public static  void m(){

        String Model="ThunderBird";
        System.out.println("Model of the bike "+Model);
    }


    public static void main(String[] args) {
        Bike b=new Bike();
        // System.out.println("Name of the Bike is "+name);
        // System.out.println("Color of the Bike is "+b.color);
        // System.out.println("Model of the Bike is "+b.Model);
        Bike.m();
        }
    }
