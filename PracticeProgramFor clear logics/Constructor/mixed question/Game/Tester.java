public class Tester {
    public static void main(String[] args) {
        Game g = new Game(100, 20, 10, "John");
        Game g1 = new Game(80,15,5,"Roman");

        g.displayPublicStatus();
        g1.displayPublicStatus();

        System.out.println("\nBattle Begins!\n");

        while(g.isAlive()&&g1.isAlive()){
            g.attack(g1);
            if(g1.isAlive()){
                g1.attack(g);
            }
            System.out.println();

        }
        g.displayPublicStatus();
        g1.displayPublicStatus();
    }
}
