public class Tester {
    public static void main(String[] args) {
        Person e = new Person();
        e.setName("Ajay");
        e.setAge(18);
        String Eligibility = (e.getvoterAge()>=18)? "Eligible for voting":"Not Eligible for voting";
        e.display();
        System.out.println("Voting Eligibility: "+Eligibility);
        
    }
    
}
