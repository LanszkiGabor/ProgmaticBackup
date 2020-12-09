package _1105_Kocsma;

import java.util.ArrayList;

public class Pub {
    private String name;
    private float cash;
    private ArrayList<Drink> storage;

    public Pub(float cash, ArrayList<Drink> storage) {
        this.name = "Falatozó a kék Bugylibicskához";
        this.cash = cash;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public ArrayList<Drink> getStorage() {
        return storage;
    }

    public void setStorage(ArrayList<Drink> storage) {
        this.storage = storage;
    }

    public Drink purchaseDrink(String liquid){
        Drink ital = new Drink("beer",300,30);
        for (Drink drink : storage) {
            if(drink.getType().equals(liquid)){
                if(drink.getQuantity() > drink.getGlass()){
                    drink.setQuantity(drink.getQuantity() - drink.getGlass());
                    cash += drink.getPrice();
                    return drink;
                } else {
                    for (Drink drink1 : storage) {
                        System.out.println(drink1.getType() + " " + drink1.getType());
                    }
                }
            }
        }
        return ital;
    }


}
