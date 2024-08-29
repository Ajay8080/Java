public class Main {
    public static void main(String[] args) {
        Sport sport = new Sport();
        System.out.println(sport.getName());
        System.out.println(sport.getNumberOfTeamMembers());
        Sport nullSport = null;
        if (nullSport == null) {
            System.out.println("Error: Sports object is null");
        } else {
            System.out.println("In " + nullSport.getName() + ", " + nullSport.getNumberOfTeamMembers());
        }
    }
}
