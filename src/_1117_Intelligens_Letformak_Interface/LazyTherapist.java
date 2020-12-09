package _1117_Intelligens_Letformak_Interface;

 public class LazyTherapist implements IntelligentEntity{
    @Override
    public String communication(String string){
        String[] answersAfterQuestion = {"Biztos ön ebben?", "Miért gondolja ezt?", "El tudja képzelni ennek az ellenkezőjét is?", "Nem tudom. Talán így van. Ön mit gondol erről?"};
        String[] answersAfterExclaim = {"Most dühös lett?", "Mit érez miközben ezt mondja?", "Feszült lett attól, amiről beszélünk?"};
        String[] answersAfterElse = { "Kérem, folytassa", "Biztos ebben?", "Csakugyan?"};
        if (string.endsWith("?")){
            return answersAfterQuestion[(int)(Math.random() * answersAfterQuestion.length)];
        } else if (string.endsWith("!")){
            return answersAfterExclaim[(int)(Math.random() * answersAfterExclaim.length)];
        } else {
            return answersAfterElse[(int)(Math.random() * answersAfterElse.length)];
        }

    }
}
