package _1116_Állatkert;

import java.util.ArrayList;

public class Main {

    static ArrayList<Animal> animalArrayList = new ArrayList();

    public static void main(String[] args) {

        Dog dog1 = new Dog("Pit-bull","Hungary", 5,"Vau-vau",false);
        Dog dog2 = new Dog("Labrador", "Hungary",20, "Vau-Vau",true);
        Cat cat1 = new Cat("Bengáli", "Usa",5, "Miau-miau",false);
        Cat cat2 = new Cat("Persian1","Turkey",6,"Miau-Miau",true);
        Cat cat3 = new Cat("Persian2","Turkey",6,"Miau-Miau",true);
        Cat cat4 = new Cat("Persian2","Turkey",6,"Miau-Miau",false);
        Cat cat5 = new Cat("Persian3","Turkey",6,"Miau-Miau",false);
        Cat cat6 = new Cat("Persian5","Turkey",6,"Miau-Miau",false);
        Cat cat7 = new Cat("Persian6","Turkey",6,"Miau-Miau",true);
        Cat cat8 = new Cat("Persian7","Turkey",6,"Miau-Miau",false);
        Canary canary1 = new Canary("Canary","Hawaii",2,"Csirip",15);
        Parrot parrot1 = new Parrot("GreyParrot","Africa",3,"Csirip",30);
        Parrot parrot2 = new Parrot("Macaw","South-America",4,"Csirip",50);
        Parrot parrot3 = new Parrot("Macaw","South-America",4,"Csirip",55);
        Parrot parrot4 = new Parrot("Macaw","South-America",4,"Csirip",60);
        Parrot parrot5 = new Parrot("Macaw","South-America",4,"Csirip",65);
        Parrot parrot6 = new Parrot("Macaw","South-America",4,"Csirip",70);
        animalArrayList.add(dog1);
        animalArrayList.add(dog2);
        animalArrayList.add(cat1);
        animalArrayList.add(cat2);
        animalArrayList.add(canary1);
        animalArrayList.add(parrot1);
        animalArrayList.add(parrot2);
        animalArrayList.add(parrot3);
        animalArrayList.add(parrot4);
        animalArrayList.add(parrot5);
        animalArrayList.add(parrot6);
        animalArrayList.add(cat3);
        animalArrayList.add(cat4);
        animalArrayList.add(cat5);
        animalArrayList.add(cat6);
        animalArrayList.add(cat7);
        animalArrayList.add(cat8);
        System.out.println(animalArrayList);
        howManyMammalsAndBirds();
        System.out.println(howManyPercentOfTheCatsAreDomesticated());
        System.out.println(averageWingsLength());
        funWithTheDog();

    }

    // Mondd meg mennyi emlős és mennyi madár alkotja az állatseregletet.

    public static void howManyMammalsAndBirds(){
        int counter = 0;
        int counter2 = 0;
        for (Animal animal : animalArrayList) {
            if (animal instanceof Mammal){
                counter++;
            } else {
                counter2++;
            }
        }
        System.out.println("Ennyi emlős van: " + counter + "\n" + "Ennyi madár van: " + counter2);
    }

    /* Vegyél fel több macskát, háziasítottat és nem háziasítottat is.
    Írasd ki hány százaléka a macskáknak háziasított */

    public static float howManyPercentOfTheCatsAreDomesticated(){
        int counter = 0;
        int countAllCats = 0;
        for (Animal animal : animalArrayList) {
            if (animal instanceof Cat){
                countAllCats++;
                if (((Cat) animal).isDomesticated()){
                    counter++;
                }
            }
        }
        return (float) counter / countAllCats * 100;
    }

    // Vegyél fel több madarat, majd írasd ki az átlagos szárnyfesztávot

    public static int averageWingsLength(){
        int sum = 0;
        int countAllBirds = 0;
        for (Animal animal : animalArrayList) {
            if (animal instanceof Bird){
                countAllBirds++;
                sum += ((Bird) animal).windsLength;
            }
        }
        return sum / countAllBirds;
    }

    public static void funWithTheDog(){
        for (Animal animal : animalArrayList) {
            if (animal instanceof Dog){
                ((Dog) animal).funWithTheDogClass();
            }
        }
    }
}
