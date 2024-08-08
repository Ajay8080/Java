public class Tester {
    public static void main(String[] args) {

        Student s1 = new Student("Mahesh", 101, "Math", 500);
        s1.show();
        s1.setAVg(76);
        System.out.println("Grade For " + s1.getAverage() + " : " + s1.calculateGrade());

        System.out.println("---------------------------------");
        System.out.println();

        Student s2 = new Student("Arun", 102, "Data Scrince", 27000);
        s2.show();
        s2.setAVg(58);
        System.out.println("Grade for " + s2.getAverage() + " : " + s2.calculateGrade());

        System.out.println("---------------------------------");
        System.out.println();

        Student s3 = new Student("Shashi", 103, "ITI", 8000);
        s3.show();
        s3.setAVg(-10);
        System.out.println(s3.calculateGrade());
    }
}
