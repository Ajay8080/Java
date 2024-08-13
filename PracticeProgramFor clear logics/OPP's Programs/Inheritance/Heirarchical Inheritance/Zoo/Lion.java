 class Lion extends Animal {
    private int maneLength;

    Lion(String name, int age, int maneLength){
        super(name,age);
        this.maneLength = maneLength;
    }
    public void makeSound(){
        System.out.println("The LIon is roar Loaudly");
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Manelength: "+maneLength);
    }
}
