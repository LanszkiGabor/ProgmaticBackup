package _1119_Fogoly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SuspectProfile implements Suspect {

    int punishment;

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public int getPunishment() {
        return punishment;
    }

    @Override
    public void setPunishment(Suspect suspect, int punishment) {
        confessionMap.putIfAbsent(suspect, new ArrayList<>());

        if (punishment == 1 || punishment == 0) {
            if (friend.containsKey(suspect)) {
                friend.put(suspect, friend.get(suspect) + 1);
            }
            friend.putIfAbsent(suspect, 1);
            confessionMap.get(suspect).add(false);
        } else if (punishment == 2 || punishment == 3) {
            if (enemy.containsKey(suspect)) {
                enemy.put(suspect, enemy.get(suspect) + 1);
            }
            enemy.putIfAbsent(suspect, 1);
            confessionMap.get(suspect).add(true);
        }
        this.punishment += punishment;
    }


    public Map<Suspect, Integer> friend = new HashMap<>();

    public Map<Suspect, Integer> enemy = new HashMap<>();

    public Map<Suspect, List<Boolean>> confessionMap = new HashMap<>();
}
