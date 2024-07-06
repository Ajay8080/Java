// implicit conversion long to float or double

public class Long{

    public static void main(String[] args) {
        long l = 75845674576945678L;
        float f = l;
        double d = l;

        System.out.println("The value for long is = "+l);
        System.out.println("The value for float is = "+f);
        System.out.println("The value for double is = "+d);
    }
}