public class Song {
    String name;
    String artist;
    double length;
    String genre;

    public Song(String name, String artist, double length, String genre) {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }

    /**
     * print line of all attributes
     */
    public void print() {
        System.out.println(name+" by "+artist+" catagory: "+genre+" length: "+length);
    }
}
