package _1106_Pets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PetMain {
    static HashMap<Integer, Pet> petHashMap = new HashMap<>();
    static HashMap<String, PetOwner> ownersMap = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/pets.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            Pet pet = new Pet(Integer.parseInt(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]));
            petHashMap.put(Integer.parseInt(parts[0]), pet);
        }

        scanner = new Scanner(new File("Files/petowners.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            ArrayList<Pet> pets = new ArrayList<>();
            for (int i = 3; i < parts.length; i++) {
                Pet p = petHashMap.get(Integer.parseInt(parts[i]));
                pets.add(p);
            }
            PetOwner owner = new PetOwner(parts[0], Integer.parseInt(parts[1]), parts[2], pets);
            ownersMap.put(parts[0], owner);
            for (Pet pet : pets) {
                pet.setPetOwner(owner);
            }
        }

        //System.out.println(ownersMap);
        //System.out.println(petHashMap);
        //System.out.println(orderByAgePetOwner());
        // System.out.println(orderByAgePet());
        // System.out.println(listThePetOwnersWhoGotOlderPet());
        // System.out.println(getTheOwnerName("Rambo"));
        // System.out.println(getTheOwnerPets("Ultra Viola"));
        // System.out.println(whichPetOwnerGotTheMostPets());
        System.out.println(getPetCount("Trab Antal"));

    }

    /* Állattartók kora szerinti növekvő sorrendbe rendezve kiírja az állattartókat és
    állataikat! */

    public static ArrayList<PetOwner> orderByAgePetOwner() {
        ArrayList<PetOwner> petOwnerArrayList = new ArrayList<>();
        for (PetOwner petOwner : ownersMap.values()) {
            petOwnerArrayList.add(petOwner);
        }
        petOwnerArrayList.sort(new AgeComparator());
        return petOwnerArrayList;
    }

    // Állatok kora szerinti növekvő sorrendbe rendezve kiírja az állattartókat és állataikat!

    public static ArrayList<Pet> orderByAgePet() {
        ArrayList<Pet> petArrayList = new ArrayList<>();
        for (Pet pet : petHashMap.values()) {
            petArrayList.add(pet);
        }
        petArrayList.sort(new AgeComparatorPet());
        return petArrayList;
    }

    /* Listázza azokat az állattartókat, akiknek van legalább egy náluk idősebb
    házikedvence! */

    public static ArrayList<PetOwner> listThePetOwnersWhoGotOlderPet() {
        ArrayList<PetOwner> petOwnerArrayList = new ArrayList<>();
        for (Pet pet : petHashMap.values()) {
            if (pet.getPetOwner().getAge() < pet.getAge()) {
                petOwnerArrayList.add(pet.getPetOwner());
            }
        }
        return petOwnerArrayList;
    }

    /* Kérd be a felhasználótól egy háziállat nevét! Valósíts meg egy metódust, amely
    visszaadja az adott nevű háziállat gazdáját! */

    public static String getTheOwnerName(String petName) {
        for (Pet pet : petHashMap.values()) {
            if (pet.getName().equals(petName)) {
                return pet.getPetOwner().getName();
            }
        }
        return null;
    }

    /* Kérd be a felhasználótól egy állattartó nevét! Valósíts meg egy metódust, amely
    visszaadja az adott nevű állattartó házikedvenceit, életkor szerinti csökkenő
    sorrendben! */

    public static ArrayList<Pet> getTheOwnerPets(String askedPetOwnerName) {
        ArrayList<Pet> petArrayList;
        for (PetOwner petOwner : ownersMap.values()) {
            if (petOwner.getName().equals(askedPetOwnerName)) {

                petArrayList = petOwner.getPets();
                petArrayList.sort(new AgeComparatorPetDescending());
                return petArrayList;
            }
        }
        return null;
    }

    // Melyik állattartónak van a legtöbb házikedvence?

    public static String whichPetOwnerGotTheMostPets() {
        String theMostPetOwnerName = null;
        int max = Integer.MIN_VALUE;
        for (PetOwner petOwner : ownersMap.values()) {
            if (petOwner.getPets().size() > max) {
                max = petOwner.getPets().size();
                theMostPetOwnerName = petOwner.getName();
            }
        }
        return theMostPetOwnerName;
    }

   /*  Bővítsd a PetOwner osztályt egy int getPetCount() metódussal, ami visszaadja, hogy
    az adott gazdának hány háziállata van! */

    public static int getPetCount(String askedPetOwnerName) {
        for (PetOwner petOwner : ownersMap.values()) {
            if (petOwner.getName().equals(askedPetOwnerName)) {
                return petOwner.getPets().size();
            }
        }
        return -1;
    }

    /* Melyik betűvel kezdődik a legtöbb háziállatnév? A visszatérési érték egy egybetűs
    String, a metódus szignatúrája pedig az alábbi legyen:
    String getPopuparFirstLetter() */




}
