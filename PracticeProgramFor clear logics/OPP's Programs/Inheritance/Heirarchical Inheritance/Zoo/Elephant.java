class Elephant extends Animal {
    private float trunksLength;
    Elephant(String name, int age, float trunksLength){
        super(name,age);
        this.trunksLength = trunksLength;
    }
    public void makeSound(){
        System.out.println("The elephant trumpets.");
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Trunks LengthL "+trunksLength);
    }
}
