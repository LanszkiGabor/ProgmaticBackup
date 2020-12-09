package _1123_OkosOtthon;


import java.util.ArrayList;
import java.util.Random;

public abstract class SmartHome {


    protected boolean heatOn;
    protected ArrayList<Nyilaszarok> nyilaszarokArrayList = new ArrayList<>();

    

    public SmartHome(boolean heatOn) {
        this.heatOn = heatOn;
    }

    public SmartHome() {

    }

    public abstract void makeMyHome();


    public void closeAllTheNyilaszaro(){
        for (int i = 0; i < nyilaszarokArrayList.size(); i++) {
            if (nyilaszarokArrayList.get(i).isItOpen){
                nyilaszarokArrayList.get(i).isItOpen = false;
            }
        }
    }

    public void openTheSmallWindows(){
        for (int i = 0; i < nyilaszarokArrayList.size(); i++) {
            if (nyilaszarokArrayList.get(i) instanceof Window){
                if(((Window) nyilaszarokArrayList.get(i)).isItSmall){
                    nyilaszarokArrayList.get(i).openWindow();
                }
            }
        }
    }


    /* public boolean setClosedDoor() {
        if (setHeatOn("on")){
            return true;
        }
        return false;
    }


    public boolean setClosedWindow() {
        if (setHeatOn("on")){
            return true;
        }
        return false;
    }

    public boolean setHeatOn(String onOff) {
        if (onOff.equals("on")){
            System.out.println("Í");
            return true;
        }
        System.out.println("|");
        return false;
    }

    /*public boolean isItBigWindow(){
        return false;
    } */



    /* public void printTheHouse(){
        String[] groundFloor = {"\u25A0","\u25A1","\u25AE","\u25AF"};
        String[] firstFloor = {"\u25A0","\u25A1"};
        Random random = new Random();

        String randomGroundFloor;

        for (int i = 0; i < 4; i++) {
            randomGroundFloor = groundFloor[random.nextInt(groundFloor.length)];
            System.out.print(randomGroundFloor);
        }

        System.out.println();

        String randomFirstFloor;

        for (int i = 0; i < 4; i++) {
            randomFirstFloor = firstFloor[random.nextInt(firstFloor.length)];
            System.out.print(randomFirstFloor);
        }
    } */



    }


