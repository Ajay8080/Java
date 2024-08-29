class Dollar extends Currency {
    private double value;

    Dollar(String country, double value){
        super(country);
        this.value = value;
    }
    @Override
    public String toString(){
        return super.toString()+"$"+value;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dollar dollar = (Dollar) obj;
        return this.value==dollar.value && super.equals(dollar);
    }
}
