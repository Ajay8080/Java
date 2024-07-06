// implicit conversion char to int, long, float, or double

public class Char{

    public static void main(String[] args) {
        char c = 'a';
        int i = c;
        long l = c;
        float f = c;
        double d = c;

        System.out.println("The value for character is = "+c);
        System.out.println("The value for integer is = "+i);
        System.out.println("The value for long is = "+l);
        System.out.println("The value for float is = "+f);
        System.out.println("The value for double is = "+d);
    }
}