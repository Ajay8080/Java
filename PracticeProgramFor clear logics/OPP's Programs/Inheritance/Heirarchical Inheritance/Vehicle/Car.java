class Car extends Vehicle{
    String cModel;
    String cYear;
    Car(String cModel, String cYear,String vName){
        super(vName);
        this.cModel = cModel;
        this.cYear = cYear;
    }
    @Override
    public String toString(){
        return " Vehicle Name: "+vName+"\n Car Model: "+cModel+"\n Car Year: "+cYear;
    }
}
