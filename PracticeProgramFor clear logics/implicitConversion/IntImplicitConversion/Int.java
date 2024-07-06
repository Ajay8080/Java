// implicit conversion for int to long, float, or double

public class Int{
    public static void main(String[] args) {
        int i = 28986;
        long l = i;
        float f = i;
        double d = i;

        System.out.println("The value for Integer is = "+i);
        System.out.println("The value for Long is = "+l);
        System.out.println("The value for Float is = "+f);
        System.out.println("The value for Double is = "+d);

    }
}