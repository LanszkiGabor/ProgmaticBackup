package _1119_Fogoly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criminal {

    static List<Suspect> suspects = new ArrayList<>();
    static Map<Suspect, Integer> statistics = new HashMap<>();

    public static void main(String[] args) {
        Snitch badGuy = new Snitch();
        Godfather naive = new Godfather();
        Random random = new Random();
        Prejudice prejudice = new Prejudice();
        EyeForEyeLight eyeForEyeLight = new EyeForEyeLight();
        EyeForEyeStrictly eyeForEyeStrictly = new EyeForEyeStrictly();


        suspects.add(badGuy);
        suspects.add(naive);
        suspects.add(random);
        suspects.add(prejudice);
        suspects.add(eyeForEyeLight);
        suspects.add(eyeForEyeStrictly);

        investigate();
    }

    public static void investigate() {
        for (Suspect suspect1 : suspects) {
            for (Suspect suspect2 : suspects) {
                if (suspect1 == suspect2) {
                    break;
                }
                if (suspect1.confess(suspect2) && suspect2.confess(suspect1)) {
                    suspect1.setPunishment(suspect2,2);
                    suspect2.setPunishment(suspect1,2);
                } else if (suspect1.confess(suspect2) && !suspect2.confess(suspect1)) {
                    suspect1.setPunishment(suspect2,0);
                    suspect2.setPunishment(suspect1,3);
                } else if (!suspect1.confess(suspect2) && suspect2.confess(suspect2)) {
                    suspect1.setPunishment(suspect2,3);
                    suspect2.setPunishment(suspect1,0);
                } else if (!suspect1.confess(suspect2) && !suspect2.confess(suspect1)) {
                    suspect1.setPunishment(suspect2,1);
                    suspect2.setPunishment(suspect1,1);
                }
                System.out.println(suspect1.getName() + " " + suspect1.getPunishment() + " " + suspect2.getName() + " " + suspect2.getPunishment());
            }
        }
    }

}
