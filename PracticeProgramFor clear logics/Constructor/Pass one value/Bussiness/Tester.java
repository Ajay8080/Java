public class Tester {
    public static void main(String[] args) {
        Business b = new Business("Finish Project", "Complete Documentation", "High", false);
        System.out.println("Title: "+b.getTitle());
        System.out.println("Description: "+b.getDescription());
        System.out.println("Priority: "+b.getPriority());
        System.out.println("Is Task Completed: "+b.getCompleted());
    }
}
