package _1119_Fogoly;

public class Prejudice extends SuspectProfile{

    @Override
    public boolean confess(Suspect other) {
        int friendSum = 0;
        int enemySum = 0;
        for (Integer value : enemy.values()) {
            enemySum += value;
        }
        for (Integer value : friend.values()) {
            friendSum += value;
        }
        if (friendSum < enemySum){
            return true;
        }
        return false;
    }


}
