package _1117_Tv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TelevisionMain {

    static HashMap<String,ArrayList<String>> televisionHashMap = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("Files/musorok.txt"));
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            for (int i = 1; i < parts.length -1; i++) {
                parts[1] = parts[1] + " " + parts[i+1];
            }
            televisionHashMap.putIfAbsent(parts[0], new ArrayList<String>());
            televisionHashMap.get(parts[0]).add(parts[1]);
        }

        // másik módszer
         /*while(scanner.hasNextLine()){
             String channel = scanner.next();
             String program = scanner.nextLine();
             Television television = new Television(channel,program);
        } */


        for (Map.Entry<String, ArrayList<String>> entry : televisionHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        TelevisionMain tvMain = new TelevisionMain();
        System.out.println(tvMain.howManyChannelsAtAll());
        System.out.println(tvMain.howManyProgramsAtAll());
        System.out.println(tvMain.howManyProgramsOnThatExactChannel("M2"));
        System.out.println(tvMain.howManyChannelBroadCastThatExactProgram("Lost"));
        System.out.println(tvMain.isTheExactProgramBroadcastOnTheExactChannel("M1","Sharknado"));
        System.out.println(tvMain.whichProgramBroadcastOnMostOfTheChannels());


    }

    // Hány csatorna van összesen?

    public int howManyChannelsAtAll(){
        return televisionHashMap.size();
    }

    // Hány különböző műsor van?

    public int howManyProgramsAtAll(){
        HashSet<String> programHashSet = new HashSet<>();
        for (ArrayList<String> value : televisionHashMap.values()) {
            for (String program : value) {
                programHashSet.add(program);
            }
        }
        return programHashSet.size();
    }

    // Kérjen be a felhasználótól egy csatornát. Hány különböző műsort játszanak ezen a csatornán?

    public int howManyProgramsOnThatExactChannel(String channel){
        return televisionHashMap.get(channel).size();
    }

    // Kérjen be a felhasználótól egy műsort. Hány csatornán adják a megadott műsort?

    public int howManyChannelBroadCastThatExactProgram(String program){
        int counter = 0;
        for (ArrayList<String> value : televisionHashMap.values()) {
            if (value.contains(program)){
                counter++;
            }
        }
        return counter;
    }

    // A megadott csatornán adják-e a megadott műsort?

    public boolean isTheExactProgramBroadcastOnTheExactChannel(String channel, String program){
        if (televisionHashMap.get(channel).contains(program)){
            return true;
        }
        return false;
    }

    // Melyik műsort játsszák a legtöbb csatornán?

    public String whichProgramBroadcastOnMostOfTheChannels(){
        int counter = 0;
        int counter2 = 0;
        String programName = "";
        HashSet<String> programHashSet = new HashSet<>();
        for (ArrayList<String> value : televisionHashMap.values()) {
            for (String program : value) {
                programHashSet.add(program);
            }
        }
        for (String program : programHashSet) {
            for (ArrayList<String> value : televisionHashMap.values()) {
                if (value.contains(program)){
                    counter++;
                }
            }
            if (counter > counter2){
                counter2 = counter;
                programName = program;
            }
            counter = 0;
        }
        return programName;
    }
    // egigmesz a hashmap-en
    // es megnezed, hogy a hashset elemei hanyszor szerepelnek





}
