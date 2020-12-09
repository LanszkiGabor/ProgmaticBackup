package _1107_Valasztasok;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ElectionMain {

    static ArrayList<Election> electionArrayList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/szavazatok.txt"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            Election election = new Election(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), parts[2], parts[3], parts[4]);
            electionArrayList.add(election);
        }
        for (int i = 0; i < electionArrayList.size(); i++) {
            System.out.println(electionArrayList.get(i).getElectionDistrict() + " " + electionArrayList.get(i).getCountedVotes() + " " + electionArrayList.get(i).getFirstName() + " " + electionArrayList.get(i).getLastName() + " " + electionArrayList.get(i).getParty());
        }

        System.out.println("A helyhatósági választáson " + countTheDelegates() + " képviselőjelöl indult");
        System.out.println(howManyVotesOnOneDelegate("Ceruza", "Zsombor"));
        howManyVotesAtAll();
        System.out.println(whichDelegateGetsTheMostVotes());
        getTheDelegatesData(whichDelegateGetsTheMostVotes());
        getTheDistrictWinnerData(findTheWinnerInTheDistricts());


    }

    /* Hány képviselőjelölt indult a helyhatósági választáson? A kérdésre egész mondatban
    válaszoljon az alábbi mintához hasonlóan:
    A helyhatósági választáson 92 képviselőjelölt indult. */

    public static int countTheDelegates() {
        return electionArrayList.size();
    }

    /* Kérje be egy képviselőjelölt vezetéknevét és utónevét, majd írja ki a képernyőre, hogy
    az illető hány szavazatot kapott! Ha a beolvasott név nem szerepel a nyilvántartásban, úgy
    jelenjen meg a képernyőn az „Ilyen nevű képviselőjelölt nem szerepel
    a nyilvántartásban!” figyelmeztetés! A feladat megoldása során feltételezheti, hogy
    nem indult két azonos nevű képviselőjelölt a választáson. */

    public static int howManyVotesOnOneDelegate(String firstName, String lastname) {
        for (Election election : electionArrayList) {
            if (firstName.equals(election.getFirstName()) && lastname.equals(election.getLastName())) {
                return election.getCountedVotes();
            }
        }
        return -1;
    }

    /* Határozza meg, hányan adták le szavazatukat, és mennyi volt a részvételi arány!
            (A részvételi arány azt adja meg, hogy a jogosultak hány százaléka vett részt
    a szavazáson.) A részvételi arányt két tizedesjegy pontossággal, százalékos formában írja
    ki a képernyőre!
    Például:
    A választáson 5001 állampolgár, a jogosultak 40,51%-a vett részt. */

    public static void howManyVotesAtAll() {
        int sum = 0;
        for (int i = 0; i < electionArrayList.size(); i++) {
            electionArrayList.get(i).getCountedVotes();
            sum += electionArrayList.get(i).getCountedVotes();
        }
        System.out.println("Ennyi állampolgár vett részt a választáson: " + sum);
        System.out.printf("Ekkora volt a részvételi arány: %.2f ", (float) sum / 12345 * 100);
    }


    /* Melyik jelölt kapta a legtöbb szavazatot? Jelenítse meg a képernyőn a képviselő vezeték-
    és utónevét, valamint az őt támogató párt rövidítését, vagy azt, hogy független! Ha több
    ilyen képviselő is van, akkor mindegyik adatai jelenjenek meg! */

    public static int whichDelegateGetsTheMostVotes() {
        int max = 0;
        for (Election election : electionArrayList) {
            if (election.getCountedVotes() > max) {
                max = election.getCountedVotes();
            }
        }
        return max;
    }

    public static void getTheDelegatesData(int max) {
        for (Election election : electionArrayList) {
            if (election.getCountedVotes() == max){
                System.out.println(election.getFirstName()+ " " + election.getLastName() + " " + election.getParty());
            }
        }
    }

    /* Határozza meg, hogy az egyes választókerületekben kik lettek a képviselők! Írja ki
    a választókerület sorszámát, a győztes vezeték- és utónevét, valamint az őt támogató párt
    rövidítését, vagy azt, hogy független egy-egy szóközzel elválasztva
    a kepviselok.txt nevű szöveges fájlba! Az adatok a választókerületek száma szerinti
    sorrendben jelenjenek meg! Minden sorba egy képviselő adatai kerüljenek! */

    public static HashMap<Integer, Election> findTheWinnerInTheDistricts(){
        HashMap<Integer, Election> electionHashMap = new HashMap<>();
        for (Election election : electionArrayList) {
            Election actualMax = electionHashMap.get(election.getElectionDistrict());
            if (actualMax == null || actualMax.getCountedVotes() < election.getCountedVotes()){
                electionHashMap.put(election.getElectionDistrict(),election);
            }
        }
        return electionHashMap;
    }

    public static void getTheDistrictWinnerData(HashMap<Integer,Election> findTheWinner){
        for (Integer integer : findTheWinner.keySet()) {
            Election actual = findTheWinner.get(integer);
            System.out.println(actual.getElectionDistrict() + " " + actual.getFirstName()+ " " + actual.getLastName() + " " + actual.getParty());
        }
    }



}
