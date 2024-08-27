class User{
    private String name;
    User(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void displayMassage(String massage){
        System.out.println("Massage is: "+massage);
        System.out.println("Name is : "+name);
    }
}