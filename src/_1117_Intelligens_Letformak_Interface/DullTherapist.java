package _1117_Intelligens_Letformak_Interface;

import java.util.HashMap;

public class DullTherapist implements IntelligentEntity{

    @Override
    public String communication(String string) {
        String[] answers = {"Kérem folytassa", "Biztos ebben?", "Csakugyan", "Nem tudom talán így van, ön mit gondol erről?","Csá","Mizu", "Majom"};
        return answers[(int)(Math.random() * answers.length)];
    }
}
