package _1103_Artists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ArtistMain {

    static HashMap<String, Artist> artistHashMap = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/szemely.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            Artist artist;
            if (parts.length == 2) {
                artist = new Artist(parts[0], Integer.parseInt(parts[1]));
            } else {
                artist = new Artist(parts[0], Integer.parseInt(parts[1]), parts[2]);
            }

            artistHashMap.put(parts[0], artist);
        }


        scanner = new Scanner(new File("Files/foglalkozas.txt"));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String artistName = parts[0];
            for (int i = 1; i < parts.length; i++) {
                String occupationName = parts[i];
                artistHashMap.get(artistName).getOccupation().add(occupationName);
            }
        }

        System.out.println(artistHashMap);
        System.out.println("A 2013ban díjazottak neve ABC sorrendben: " + orderTheArtistsInABCWhoGetAnAwardIn2013());
        System.out.println("Balett");
        findTheBalettWord();
    }

    /* Sorold fel ábécérendben a 2013-ban kitüntetettek nevét!
    Írd meg a feladatot comparator segítségével is! */

    public static ArrayList<String> orderTheArtistsInABCWhoGetAnAwardIn2013() {
        ArrayList<String> prizeIn2013 = new ArrayList<>();
        for (Artist artist : artistHashMap.values()) {
            if (artist.getYearOfThePrize() == 2013) {
                prizeIn2013.add(artist.getName());
            }
        }
        prizeIn2013.sort(new ABC_Comparator());

        return prizeIn2013;
    }

    /* Balettel foglalkozó díjazottakra vagyunk kíváncsiak, de többféle ezzel kapcsolatos hivatás létezik.
    Írasd ki azoknak a nevét és foglalkozását, akik foglalkozási neve tartalmazza a „balett” szórészletet! */


    public static void findTheBalettWord() {
        HashSet<String> artistHashSet = new HashSet<>();
        for (Artist artist : artistHashMap.values()) {
            for (String foglalkozas : artist.getOccupation()) {
                if (foglalkozas.contains("balett")) {
                    System.out.println(artist.getName());
                    System.out.println(foglalkozas);
                }
            }
        }
    }

    // Melyik évben volt a legtöbb díjazott és hányan voltak


}
