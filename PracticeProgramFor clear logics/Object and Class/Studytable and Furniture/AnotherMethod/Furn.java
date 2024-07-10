public class Furn{

    String type;
    String color;

    public void showDetails(String type, String color){
        System.out.println("Type: "+type+" Color: "+color);
    }
    public static void main(String[] args) {
        Furn f=new Furn();
        f.showDetails("wood","Black");
    }
}