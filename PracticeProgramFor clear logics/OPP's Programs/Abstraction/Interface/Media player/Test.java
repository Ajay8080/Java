public class Test {
    public static void main(String[] args) {       
        MusicPlayer audio = new MusicPlayer();
        System.out.println("TEST CASE 1-----------------");
        audio.play("Life");
        audio.stop("Life");
        audio.pause("Life");
        System.out.println();
        System.out.println("TEST CASE 2-----------------");
        audio.play("");

    }
}
