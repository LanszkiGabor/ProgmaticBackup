package _1108_Tinder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TinderMain {

    static HashMap<Integer, User> userHashMap = new HashMap<>();
    static ArrayList<Swipe> swipeArrayList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/users.txt"));
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            User user = new User(Integer.parseInt(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]), parts[4], parts[5]);
            userHashMap.put(user.getID(), user);
        }

        scanner = new Scanner(new File("Files/swipes.txt"));
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            Swipe swipe = new Swipe(userHashMap.get(Integer.parseInt(parts[0])), userHashMap.get(Integer.parseInt(parts[1])), parts[2], Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6]),Integer.parseInt(parts[7]),Integer.parseInt(parts[8]));
            swipeArrayList.add(swipe);
            userHashMap.get(swipe.getSwiperUser().getID()).addSwipe(swipe);
        }

        findTheQueen();



    }

    /* Ki az alkalmazás “királynője”? (Melyik női felhasználót jelölték be a legtöbben kedvencnek?)
        Ha holtverseny alakul ki, akkor írd ki az összes felhasználó nevét! */

    public static void findTheQueen(){
        HashMap<Integer, Integer> queenHashMap = new HashMap<>();
        for (Swipe swipe : swipeArrayList) {
            if (swipe.getSwipedUser().isFemale() && swipe.isLike()){
                queenHashMap.put(swipe.getSwipedUser().getID(), queenHashMap.getOrDefault(swipe.getSwipedUser().getID(),0)+1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> actualEntry : queenHashMap.entrySet()) {
            if (max < actualEntry.getValue()){
                max = actualEntry.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> actualEntry : queenHashMap.entrySet()) {
            if (actualEntry.getValue() == max){
                User swipedUser = userHashMap.get(actualEntry.getKey());
                System.out.println(swipedUser.getName());
            }
        }
    }

}
