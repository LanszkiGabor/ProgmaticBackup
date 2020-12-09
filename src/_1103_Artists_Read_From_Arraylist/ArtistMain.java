package _1103_Artists_Read_From_Arraylist;

import _1103_Artists.Artist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArtistMain {
    static ArrayList<Artist> artistArrayList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/szemely.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            _1103_Artists.Artist artist;
            if (parts.length == 2) {
                artist = new _1103_Artists.Artist(parts[0], Integer.parseInt(parts[1]));
            } else {
                artist = new _1103_Artists.Artist(parts[0], Integer.parseInt(parts[1]), parts[2]);
            }

            artistArrayList.add(artist);
        }

        scanner = new Scanner(new File("Files/foglalkozas.txt"));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String artistName = parts[0];
            for (int i = 1; i < parts.length; i++) {
                String occupationName = parts[i];
                for (int j = 0; j < artistArrayList.size(); j++) {
                    if (artistArrayList.get(j).getName().equals(artistName)){
                        artistArrayList.get(j).getOccupation().add(occupationName);
                    }
                }
            }
        }
    }
}
