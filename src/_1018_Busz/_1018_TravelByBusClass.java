package _1018_Busz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class _1018_TravelByBusClass {


    public _1018_TicketClass[] ticketClass;

    public void readFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/eladott.txt"));

        int rowCount = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            rowCount++;
            System.out.println(line);
        }

        ticketClass = new _1018_TicketClass[rowCount];


        scanner = new Scanner(new File("Files/eladott.txt"));

        int i = 0;
        while (scanner.hasNext()) {
            int seats = scanner.nextInt();
            int getOnKm = scanner.nextInt();
            int getOffKm = scanner.nextInt();

            ticketClass[i++] = new _1018_TicketClass(seats, getOnKm, getOffKm);
        }

    }


    /* Adja meg a legutolsó jegyvásárló ülésének sorszámát és az általa beutazott távolságot!
    A kívánt adatokat a képernyőn jelenítse meg! */

    public void lastTicketBuyerSeatNumberAndTravelLength() {
        System.out.println(ticketClass[ticketClass.length - 1].getSeatNumber());
        System.out.println(ticketClass[ticketClass.length - 1].getGetOffKm() - ticketClass[ticketClass.length - 1].getGetOnKm());

    }

    /* Listázza ki, kik utazták végig a teljes utat! Az utasok sorszámát egy-egy szóközzel
    elválasztva írja a képernyőre! */

    public int whoTravelledTheWholeDistance() {
        for (int i = 0; i < ticketClass.length; i++) {
            if (ticketClass[i].getGetOnKm() == 0 && ticketClass[i].getGetOffKm() == 172) {
                System.out.print(i + " ");
            }

        }
        return -1;

    }

    /* Határozza meg, hogy a jegyekből mennyi bevétele származott a társaságnak!
    Az eredményt írja a képernyőre! */

    /*public int incomeAmount (){
        for (int i = 0; i < ticketClass.length; i++) {
            if(g)v
        }
    }*/

    /* Írja a képernyőre, hogy a busz végállomást megelőző utolsó megállásánál hányan szálltak
    fel és le! */

    public int howManyPassengersGetOnAndGetOff(){
        int counter = 0;
        for (int i = 0; i < ticketClass.length; i++) {
            if(ticketClass[i].getGetOnKm() == 165 || ticketClass[i].getGetOffKm() == 165){
                counter++;
            }
        }
        return  counter;
    }

    /* Adja meg, hogy hány helyen állt meg a busz a kiinduló állomás és a célállomás között!
    Az eredményt írja a képernyőre! */

    public int howManyStops(){
        ArrayList arrayList = new ArrayList<Integer>();
        int getOn = 0;
        int getOff = 0;
        for (int i = 0; i < ticketClass.length; i++) {
            getOn = ticketClass[i].getGetOnKm();
            getOff = ticketClass[i].getGetOffKm();
            if(!arrayList.contains(getOn)){
                arrayList.add(getOn);
            }
            if(!arrayList.contains(getOff)){
                arrayList.add(getOff);
            }

        }
        return arrayList.size();

    }


}
