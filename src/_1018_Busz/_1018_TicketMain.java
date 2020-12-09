package _1018_Busz;

import java.io.FileNotFoundException;

public class _1018_TicketMain {


    public static void main(String[] args) throws FileNotFoundException {
       _1018_TravelByBusClass ticketByBus = new _1018_TravelByBusClass();
        ticketByBus.readFromFile();
        ticketByBus.lastTicketBuyerSeatNumberAndTravelLength();
        ticketByBus.whoTravelledTheWholeDistance();
        System.out.println(ticketByBus.howManyPassengersGetOnAndGetOff());
        int nrOfPassengers = ticketByBus.howManyPassengersGetOnAndGetOff();
        System.out.println(nrOfPassengers);
        System.out.println(ticketByBus.howManyStops());
    }







}
