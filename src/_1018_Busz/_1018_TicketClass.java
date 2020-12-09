package _1018_Busz;

public class _1018_TicketClass {


    private int seatNumber;
    private int getOnKm;
    private int getOffKm;


    public _1018_TicketClass(int seatNumber, int getOnKm, int getOffKm) {

        this.seatNumber = seatNumber;
        this.getOnKm = getOnKm;
        this.getOffKm = getOffKm;
    }



    public int getSeatNumber (){
        return seatNumber;
    }

    public int getGetOnKm (){
        return getOnKm;
    }

    public int getGetOffKm (){
        return getOffKm;
    }



}
