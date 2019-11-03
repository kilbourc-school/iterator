import java.util.Iterator;
public class AlbumIterator implements Iterator {
    private Song[] songs;
    private int position = 0;

    public AlbumIterator(Song[] songs) {
        this.songs = songs;
    }

    /**
     * goes next
     * @return Song
     */
    public Song next() {
        Song song = songs[position];
        position = position + 1;
        return song;
    }

    /**
     * checks next song
     * @return boolean
     */
    public boolean hasNext() {
        if(position >= songs.length || songs[position] == null) {

            return false;
        } else {
            return true;
        }
    }
}