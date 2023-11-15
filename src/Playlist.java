import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        Playlist.createPlaylist(desertIslandPlaylist, "desert music", "pyramid music", "\"change me\" music", "island music", "sleep music", "boring music");
        System.out.println(desertIslandPlaylist);

        //get length/size of list
        System.out.println(desertIslandPlaylist.size());

        //remove at index or remove by first value
        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove("boring music");
        System.out.println(desertIslandPlaylist);

        //gets index of the first matching value (if none match returns -1)
        System.out.println(desertIslandPlaylist.indexOf("beach music"));
        System.out.println(desertIslandPlaylist.indexOf("\"change me\" music"));

        //set value at index
        desertIslandPlaylist.set(2, "chill beach music");

        //get value at index
        System.out.println(desertIslandPlaylist.get(2));

        //reverse list
        Collections.reverse(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist);
        //or reverse list (see more further down)
        reversePlaylist(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist);

        //shuffle playlist
        shufflePlaylist(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist);
    }

    //adding values to ArrayLists in order or by adding index
    public static void createPlaylist(ArrayList<String> playlist, String title1, String title2, String title3, String title4, String title5, String title6) {
        playlist.add(title1);
        playlist.add(title2);
        playlist.add(title3);
        playlist.add(title4);
        playlist.add(title6);
        playlist.add(4, title5);
    }
    //reverse list
    public static void reversePlaylist(ArrayList<String> playlist) {
        if (playlist.size() != 0) {
            int j = playlist.size() - 1;
            for (int i = 0; i <= j; i++) {
                String title1 = playlist.get(i);
                String title2 = playlist.get(j);
                playlist.set(i, title2);
                playlist.set(j, title1);
                j--;
            }
        } else {
            System.out.println("Playlist is empty!");
        }
    }
    //shuffle list
    public static void shufflePlaylist(ArrayList<String> playlist){
        Random rand = new Random(); //create random
        ArrayList<String> copy = (ArrayList<String>) playlist.clone(); //create copy of playlist
        ArrayList<Integer> randomPositions = new ArrayList<Integer>(); //create list to save random numbers
        int i = 0;
        //System.out.println(copy);
        while (i < playlist.size()){
            int position = rand.nextInt(playlist.size()); //create random number between 0 (inclusive) and(playlist.size (exclusive)
            if (!randomPositions.contains(position)) { //check if number was already generated before
                randomPositions.add(position); //add number to list
                i++;
            }
        }
        //System.out.println(randomPositions);
        for (int j = 0; j < playlist.size(); j++) {
            playlist.set(j, copy.get(randomPositions.get(j))); //set playlist with random songs in order
        }
    }
}
