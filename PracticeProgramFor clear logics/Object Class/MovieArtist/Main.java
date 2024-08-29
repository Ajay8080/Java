public class Main {
    public static void main(String[] args){
        MovieArtist artist1 = new MovieArtist("Leonardo DiCaprio", "Actor");
        MovieArtist artist2 = new MovieArtist("Hans Zimmer", "Music Composer");
        System.out.println(artist1.toString());
        System.out.println(artist2.toString());
        System.out.println("Hash Code of artist1: " + artist1.hashCode());
        System.out.println("Hash Code of artist2: " + artist2.hashCode());
        System.out.println("Actual reference of artist1: " + System.identityHashCode(artist1));
        System.out.println("Actual reference of artist2: " + System.identityHashCode(artist2));
    
    }
}
