package _1020_Útépítő;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _1020_RoadReadAndMethodClass {

    public _1020_RoadClass[] roadClass;

    public void readFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/forgalom.txt"));

        int rowCount = 0;
        if (scanner.hasNextLine()) {
            // String line = scanner.nextLine();
            // rowCount++;
            rowCount = scanner.nextInt();
            System.out.println(rowCount);
        }

        roadClass = new _1020_RoadClass[rowCount];


        // scanner = new Scanner(new File("Files/forgalom.txt"));

        int i = 0;
        while (scanner.hasNext()) {
            int hour = scanner.nextInt();
            int minute = scanner.nextInt();
            int sec = scanner.nextInt();
            int time = scanner.nextInt();
            String fromWhere = scanner.next();


            roadClass[i++] = new _1020_RoadClass(hour, minute, sec, time, fromWhere);
        }
        for (int j = 0; j < roadClass.length; j++) {
            System.out.println(roadClass[j].getHour() + " " + roadClass[j].getMinute() + " " + roadClass[j].getSec() + " " + roadClass[j].getTime() + " " + roadClass[j].getFromWhere());
        }
    }


    /* Írja ki a képernyőre, hogy az n-edikként belépő jármű melyik város felé haladt! Ehhez
    kérje be a felhasználótól az n értékét! */

    public void whichCityToward() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon megy értéket 1től 1105ig");
        int n = scanner.nextInt();
        String[] A, F = new String[]{"A", "F"};
        if (roadClass[n - 1].getFromWhere().contains("A")) {
            System.out.println("F");
        } else {
            System.out.println("A");
        }
    }

    /* Írja a képernyőre, hogy a Felső város irányába tartó utolsó két jármű hány másodperc kü-
    lönbséggel érte el az útszakasz kezdetét! */

    public int howManySecDifference() {
        int travellerCounter = 0;
        int index = 1104;
        int hour1 = 0;
        int min1 = 0;
        int sec1 = 0;
        int hour2 = 0;
        int min2 = 0;
        int sec2 = 0;
        while (travellerCounter < 2) {
            if (roadClass[index].getFromWhere().contains("A")) {
                travellerCounter++;
                if (travellerCounter == 1) {
                    hour1 = roadClass[index].getHour();
                    min1 = roadClass[index].getMinute();
                    sec1 = roadClass[index].getSec();
                }
                if (travellerCounter == 2) {
                    hour2 = roadClass[index].getHour();
                    min2 = roadClass[index].getMinute();
                    sec2 = roadClass[index].getSec();
                }
            }
            index--;
        }
        return (hour1 - hour2) * 3600 + (min1 - min2) * 60 + (sec1 - sec2);
    }

    /* Határozza meg óránként és irányonként, hogy hány jármű érte el a szakaszt! Soronként
    egy-egy óra adatait írja a képernyőre! Az első érték az órát, a második érték az Alsó, a
    harmadik a Felső város felől érkező járművek számát jelentse! A kiírásban csak azokat az
    órákat jelenítse meg, amelyekben volt forgalom valamely irányban! */

    public void howManyVehiclesInTheExactHour(){
        int counterA = 0;
        int counterF = 0;
        int actualHour = roadClass[1].getHour();
        for (int i = 1; i < 1105; i++) {
            if (roadClass[i].getFromWhere().contains("A")) {
                counterA++;
            } else {
                counterF++;
            }
            if (roadClass[i + 1].getHour() != roadClass[i].getHour()){
                System.out.print(actualHour + " ");
                System.out.print(counterA + " ");
                System.out.println(counterF);
            }
        }
    }
}










