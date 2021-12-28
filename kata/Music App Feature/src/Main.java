public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Song song1 = new Song("s1","a1",2);
        Song song2 = new Song("s2","a2",4);
        Song song23 = new Song("s2","a23",4);
        Song song3 = new Song("s3","a1",5);
        song2.setTimesThatRepated(4);
        song23.setTimesThatRepated(4);
        song3.setTimesThatRepated(5);
        library.addSong(song1);
        library.addSong(song2);
        library.addSong(song23);
        library.addSong(song3);
        library.addSong(new Song("s1","a1",2));

        System.out.println(library.getLibraryChart());
    }
}
