import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        createPlaylist(desertIslandPlaylist, "desert music", "pyramid music", "beach music", "island music", "sleep music");
    }

    public static void createPlaylist(ArrayList<String> arrayList, String title1, String title2, String title3, String title4, String title5){
        arrayList.add(title1);
        arrayList.add(title2);
        arrayList.add(title3);
        arrayList.add(title4);
        arrayList.add(title5);
    }
}
