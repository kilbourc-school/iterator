public class Album{
    int count = 0;
    Song[] menuItems = new Song[20];
    String name;

    /**
     * constructor
     * @param name
     */
    public Album(String name) {
        this.name = name;
    }

    /**
     * adds song to array
     * @param name
     * @param artist
     * @param length
     * @param genre
     */
    public void addSong(String name, String artist, double length, String genre) {
        Song song = new Song(name, artist, length, genre);
            menuItems[count] = song;
            count += 1;
    }

    /**
     * create a Iterator
     * @return AlbumIterator
     */
    public AlbumIterator createIterator() {
        return new AlbumIterator(menuItems);
    }

    // other menu methods here
}