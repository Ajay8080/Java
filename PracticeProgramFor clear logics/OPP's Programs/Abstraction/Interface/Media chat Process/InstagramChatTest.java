public class InstagramChatTest {
    public static void main(String[] args) {
        InstagramUser instaUser = new InstagramUser("Mahesh");
        Messanger instagramChat = new InstagramChat();
        instagramChat.sendMassage(instaUser);
    }
}
