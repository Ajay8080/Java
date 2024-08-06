class Batter{
    public String name;
    public int run;
    public int matches;
    public float bAvg;

    public Batter(){
        this.name="";
        this.run=0;
        this.matches=0;
        this.bAvg=0.0f;
    }
    public Batter(String name, int run, int matches){
        this.name=name;
        this.run=run;
        this.matches=matches;
        this.bAvg=0.0f;
    }
    public void  computeBattingAvgeera(){
        if(run < 0 || matches < 0){
            System.out.println("Score and matches must not be negative ");
        }
        else if(run>0 && matches==0){
            System.out.println("Matches must not be zero");
        }
        else{
            bAvg= (float)run/matches;
        }
        System.out.println("name: "+name);
        System.out.printf("Average: %.2f",bAvg);
    }
    public void getStatics(){
        if(run<0 && matches<0){
            System.out.println("Error");
        }
        else if(run>0 && matches==0){
            System.out.println("Error");
        }
        else{
            System.out.println("name: "+name);
            System.out.println("Matches: "+matches);
            System.out.println("run: "+run);
        }
    }
}