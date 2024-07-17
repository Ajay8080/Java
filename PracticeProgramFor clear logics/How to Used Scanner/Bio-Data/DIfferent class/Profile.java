/* Suppose you want to
display your bio-data on the output screen. Write a program in Java to perform
the task in the given format:

Name:

Father's Name:

Date of birth:

Blood Group:

Aadhar Card No.:

State: */
class Profile{

    String name;
    String fname;
    String dob;
    String bgroup;
    long AdharNum;
    String state;
    public void setName(String name){
        this.name = name;
    }
    public void setFname(String fname){
        this.fname=fname;
    }
    public void setDOB(String dob){
        this.dob =  dob;
    }
    public void setBgroup(String bgroup){
        this.bgroup = bgroup;
    }
    public void setAdhar(long AdharNum){
        this.AdharNum = AdharNum;
    }
    public void setState(String state){
        this.state = state;
    }
    public void display(){
        System.out.println("name: "+name);
        System.out.println("Father name: "+fname);
        System.out.println("Date of Birth: "+dob);
        System.out.println("Blood Group: "+bgroup);
        System.out.println("Adhar Number: "+AdharNum);
        System.out.println("State: "+state);
    }
}
