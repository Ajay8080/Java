class Game{
    int hPoints;
    int aPower;
    int defense;
    String name;

    public Game(int hPoints, int aPower, int defense,String name){
        this.hPoints=hPoints;
        this.aPower=aPower;
        this.defense=defense;
        this.name=name;
    }
    public void attack(Game opponent){
        int damage = this.aPower - opponent.defense;
        if(damage>0){
            opponent.hPoints -= damage;
            System.out.println(this.name+" attacked "+opponent.name+" for "+damage+" damage.");
        }
        else {
            System.out.println(this.name+" tried to attack "+opponent.name+" but was blocked.");
        }
    }
    public boolean isAlive(){
        return this.hPoints>0;
    }
    public void displayPublicStatus(){
        System.out.println(this.name+" has "+this.hPoints+" health points and ");
    }
}