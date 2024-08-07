public class Player {
    private String pName;
    private int pAge;
    private int pId;

    public Player(Student s){
        this.pName = s.getName();
        this.pAge = s.getAge();
        this.pId = s.getId();
    }
    public void showDetails(){
        System.out.println("Player Name: "+pName);
        System.out.println("Player Id: "+pId);
        System.out.println("Player Age: "+pAge);
    }
    public void updateName(String newName){
        this.pName = newName;
    }
    public boolean isEligible(){
        return pAge >= 18;
    }
}
