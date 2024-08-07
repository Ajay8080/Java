public class Tester {
    public static void main(String[] args) {
        Time t1 = new Time(2, 30, 40);
        Time t2 = new Time(4,40,21);
        t1.show();
        t2.show();
        System.out.println();
        Time result = Time.add(t1, t2);
        result.show();
    }
}
