package _1119_Fogoly;

public class EyeForEyeStrictly extends SuspectProfile {

    @Override
    public boolean confess(Suspect other) {
        if (enemy.containsKey(other)){
            return true;
        }
        return false;
    }
}
