
public class Car{
    static String cname;
    public static void carName(String cname){
        System.out.println("Car name is : "+cname);
    }
    public void carColor(String color){
        System.out.println("Car color is : "+color);
    }
    public static void main(String[] args) {
        carName("BMW");
        Car c= new Car();
        c.carColor("Red");

    }
}