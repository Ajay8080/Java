class Sport{
    private String sportName;
    private int teamSize;
    private String sportType;

    public Sport(){
        this.sportName="unknown";
        this.teamSize=0;
        this.sportType="unknown";
    }
    public Sport(String sportName, int teamSize){
        this.sportName=sportName;
        if(teamSize<0){
            System.err.println("Team size must be positive.");
        }
        else{
        this.teamSize=teamSize;
        }
        this.sportType="unknown";
    }
    public Sport(String sportName, int teamSize, String sportType){
        this.sportName=sportName;
        if(teamSize<0){
            System.err.println("Team size must be positive");
        }
        else{
            this.teamSize=teamSize;
        }
        this.sportType=sportType;
    }
    public void displayInfo(){
        System.out.println("SportName: "+sportName);
        System.out.println("teamSize: "+teamSize);
        System.out.println("sportType: "+sportType);
    }
}