class  Business{
    private String title;
    private String description;
    private String priority;
    private boolean completed;

    public Business(String title, String description, String priority,boolean completed){
        this.title=title;
        this.description=description;
        this.priority=priority;
        this.completed=completed;
    }
    public void updateDescription(String newDescription){
        this.description=newDescription;
    }
    public void updatePriority(String newPriority){
        this.priority=newPriority;
    }
    public void markAsCompleted(boolean completed){
    this.completed=completed;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }   
    public String getPriority(){
        return priority;
    } 
    public boolean getCompleted(){
        return completed;
    }
}