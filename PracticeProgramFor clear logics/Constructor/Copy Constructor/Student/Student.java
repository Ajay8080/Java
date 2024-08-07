class Student {
    private String sName;
    private int sId;
    private int sAge;

    public Student() {
        this.sName = "Unknown";
        this.sId = 0;
        this.sAge = 0;
    }

    public Student(String sName, int sId, int sAge) {
        this.sName = sName;
        this.sId = sId;
        this.sAge = sAge;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public void setId(int sId) {
        this.sId = sId;
    }

    public void setAge(int sAge) {
        this.sAge = sAge;
    }

    public String getName(){
        return sName;
    }
    public int getId(){
        return sId;
    }
    public int getAge(){
        return sAge;
    }

    public  void showDetails(){
        System.out.println("Student Name: "+sName);
        System.out.println("Student ID: "+sId);
        System.out.println("Student Age: "+sAge);
    }

}