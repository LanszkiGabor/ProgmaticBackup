package _1119_Fogoly;

public class EyeForEyeLight extends SuspectProfile {


    @Override
    public boolean confess(Suspect other) {

        if(confessionMap.get(other)!=null){
        return confessionMap.get(other).get(confessionMap.get(other).size() - 1);
        }
        return false;
    }


}
