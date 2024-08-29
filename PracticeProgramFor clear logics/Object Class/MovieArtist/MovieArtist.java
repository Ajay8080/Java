class MovieArtist{
    private String name;
    private String roll;

    MovieArtist(String name, String roll){
        this.name = name;
        this.roll = roll;
    }
    @Override
    public String toString(){
        return name + " as " + roll;
    }
    @Override
    public int hashCode(){
        return name.hashCode() + roll.hashCode();
    }
}