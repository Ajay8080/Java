public class Main {
    public static void main(String[] args) {
        Egg e = new Egg(4.1, 2.1, 5, 8);
        Bread b = new Bread(4.0, 1.1, 2.1, 8);
        System.out.println("--------------------------EGG---------------------------------");
        e.getaste();
        e.getType();
        e.getMacroNutrients();

        System.out.println();

        System.out.println("--------------------------Bread---------------------------------");
        b.getaste();
        b.getType();
        b.getMacroNutrients();
    }
}
