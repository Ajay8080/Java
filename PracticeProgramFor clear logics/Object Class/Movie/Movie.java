class Movie{
    private String name;
    private String director;
    Movie(String name, String director){
        this.name = name;
        this.director = director;
    }
    
    public String getClassName(){
        return this.getClass().getSimpleName();
    }
    @Override
    public String toString(){
        return "Title: "+name+"\n Director: "+director;
    }
    public void displayClassName(){
        System.out.println("class movie object: "+ getClassName());
    }
}