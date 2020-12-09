package _0928_1006_Metódusok_Tömbök;

public class zaszlo {
    public static void main(String[] args) {
        dannishFlag();
    }
    // Magyar zászló


    public static void hungarianFlag() {
        String ANSI_RED = "\u001B[31m" + "*" + "\u001B[31m";
        String ANSI_WHITE = "\u001B[37m" + "*" + "\u001B[37m";
        String ANSI_GREEN = "\u001B[32m" + "*" + "\u001B[32m";


        for (int sor = 1; sor <= 4; sor++) {
            for (int oszlop = 1; oszlop < 30; oszlop++) {
                System.out.print(ANSI_RED);
            }
            System.out.println(ANSI_RED);
        }
        for (int sor = 1; sor <= 4; sor++) {
            for (int oszlop = 1; oszlop < 30; oszlop++) {
                System.out.print(ANSI_WHITE);
            }
            System.out.println(ANSI_WHITE);
        }
        for (int sor = 1; sor <= 4; sor++) {
            for (int oszlop = 1; oszlop < 30; oszlop++) {
                System.out.print(ANSI_GREEN);
            }
            System.out.println(ANSI_GREEN);
        }
    }
    //Dán Zászló

    public static void dannishFlag() {

        String ANSI_RED = "\u001B[31m" + "*" + "\u001B[31m";
        String ANSI_WHITE = "\u001B[37m" + "*" + "\u001B[37m";

        for (int sor = 1; sor <= 5; sor++) {
            for (int oszlop = 1; oszlop < 10; oszlop++) {
                System.out.print(ANSI_RED);
            }
            System.out.println(ANSI_RED);
        } 

    }
}
