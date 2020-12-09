package _1109_Teszt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WorldStatistics {
    ArrayList<Country> countryArrayList = new ArrayList<>();
    ArrayList<City> cityArrayList = new ArrayList<>();


    public void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("Files/orszagok.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            Country country = null;
            if (parts.length == 7) {
                country = new Country(parts[0], parts[1], parts[2], parts[3], Float.parseFloat(parts[4]), parts[5], Integer.parseInt(parts[6]));
            } else {
                country = new Country(parts[0], parts[1], parts[2], parts[3], Float.parseFloat(parts[4]), parts[5], Integer.parseInt(parts[6]), parts[7]);
            }
            countryArrayList.add(country);
        }


        scanner = new Scanner(new File("Files/varosok.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            City city = new City(parts[0], parts[1], Integer.parseInt(parts[2]));
            cityArrayList.add(city);
        }
        for (int i = 0; i < cityArrayList.size(); i++) {
            for (int j = 0; j < countryArrayList.size(); j++) {
                if (countryArrayList.get(j).getCountryCode().equals(cityArrayList.get(i).getCountryCode())) {
                    countryArrayList.get(j).getCities().add(cityArrayList.get(i));
                }
            }
        }

        System.out.println(countryArrayList);
        System.out.println(cityArrayList);
        System.out.println(countryArrayList.get(0).getPopulationDensity());

    }




}
