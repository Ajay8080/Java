class Egg extends Food{
    Egg(double proteins, double fats, double carbs,int tastyScore){
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;
        this.tastyScore = tastyScore;
    }
    @Override
    public void getaste(){
        System.out.println("Taste score: "+tastyScore);
    }
    @Override
    public void getType(){
        System.out.println("Non Vegetarian");
    }
    @Override
    public void getMacroNutrients(){
        System.out.println("An egg has"+this.proteins+" gms of protein,"+this.fats+"gms of fats and "+this.carbs+"gms of carbohydrates.");
    }
}
