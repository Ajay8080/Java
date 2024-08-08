class Student {
    private String name;
    private int id;
    private String course;
    private double fee;
    private char grade;
    private double avg;

    public Student(String name, int id, String course, double fee) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.fee = fee;
        this.grade = 'N';
        this.avg = 0.0;
    }

    public Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.course = s.course;
        this.fee = s.fee;
        this.grade = s.grade;
        this.avg = s.avg;
    }

    public char calculateGrade() {
        if (avg < 0 || avg > 100) {
            System.err.println("Average should be less than 100 and greater than 0");
            return 'N';
        } else {
            if (avg >= 90) {
                grade = 'A';
            } else if (avg >= 80 ) {
                grade =  'B';
            } else if (avg >= 70 ) {
                grade =  'C';
            } else if (avg >= 60 ) {
                grade = 'D';
            } else {
                grade = 'F';
            }
        }
        return grade;
    }
    public void setAVg(double avg){
        this.avg = avg;
    }
    public double getAverage(){
        return avg;
    }
    public char getGrade(){
        return grade;
    }

    public void show(){
        System.out.println("Name Student : "+name);
        System.out.println("Student ID : "+id);
        System.out.println("Course: "+course);
        System.out.println("Fee: "+fee);
    }

}