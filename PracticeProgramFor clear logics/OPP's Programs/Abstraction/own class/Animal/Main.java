public class Main{
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        d.makeSound();
        d.eat();
        System.out.println("------------------------CAT-------------------------------");
        c.makeSound();
        c.eat();
    }
}