public class NotifierTest {
    public static void main(String[] args) {
        User user1 = new User("Alice", "alice@example.com");
        User user2 = new User("Bob", "bob@example.com");
        User user3 = new User("Charlie", "charlie@example.com");
        User user4 = new User("Frank", null);
        User user5 = new User("Grace", null);

        Notifier eNotifier = new EmailNotifier();
        System.out.println("--------------------------Test Case 1---------------------------------------------");
        eNotifier.notifyUsers(user1,user2);
        System.out.println();

        System.out.println("--------------------------Test Case 2---------------------------------------------");
        eNotifier.notifyUsers(user3);
        System.out.println();
        
        System.out.println("--------------------------Test Case 3---------------------------------------------");
        eNotifier.notifyUsers(user4, user5);
        System.out.println();

    }
}


/*
 ouput:
 --------------------------Test Case 1---------------------------------------------
Sending email to Alice at alice@example.com
Sending email to Bob at bob@example.com

--------------------------Test Case 2---------------------------------------------
Sending email to Charlie at charlie@example.com

--------------------------Test Case 3---------------------------------------------
Sending email to Frank at null
Sending email to Grace at null
 */