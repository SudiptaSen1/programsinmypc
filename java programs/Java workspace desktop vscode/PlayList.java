import java.util.LinkedList;

public class PlayList {

    public static void main(String[] args) {
        Song song=new Song("Rap God",5.10);
        Album album=new Album("Rap God", "Eminem");
        album.addSong("GoodBye", 3.50);
        LinkedList<Song> playList=new LinkedList<>();
        System.out.println(album.addToPlayList("Rap God", playList));
        System.out.println(album.addToPlayList("Go Crazy", playList));
        System.out.println(playList);
        System.out.println(album.addToPlayList(1, playList));
        System.out.println(album.addToPlayList(1, playList));
        System.out.println(playList);
    }
    
}
