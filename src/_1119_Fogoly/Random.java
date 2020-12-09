package _1119_Fogoly;

public class Random extends SuspectProfile{



    @Override
    public boolean confess(Suspect other) {
       return Math.random() < 0.5;
    }


}
