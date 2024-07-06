// implicit coversion for short to int, long, float, or double

public class Short{

    public static void main(String[] args) {
        short s = 127;
        int i = s;
        long l = s;
        float f = s;
        double d = s;

        System.out.println("The Value for short is = "+s);
        System.out.println("The Value for int is = "+i);
        System.out.println("The Value for long is = "+l);
        System.out.println("The value for float is = "+f);
        System.out.println("The value for double is = "+d);
        
    }
}