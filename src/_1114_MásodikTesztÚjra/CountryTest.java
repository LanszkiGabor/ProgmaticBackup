package _1114_MásodikTesztÚjra;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CountryTest {

    Country country1;
    Country country2;
    WorldStatistics worldStatistics = new WorldStatistics();


    @Before
    public void setUp() throws Exception {
        country1 = new Country("HUN", "Hungary", "Europe", "EasternHungary", 100, 1989, 1000);
        country2 = new Country("ROM", "Romania", "Europe", "EasternEurope", 0, 2000, 2000);
        country1.addNewCity(new City("Budapest", "HUN", 200, country1));
        country1.addNewCity(new City("Szeged", "HUN", 100, country1));
        worldStatistics.readFile("Files/orszagok.txt", "Files/varosok.txt");

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getPopulationDensity() {
        double test1 = country1.getPopulationDensity();
        double test2 = country2.getPopulationDensity();
        Assert.assertEquals(-1, test1, 0);
        Assert.assertEquals(-1, test2, 0);
    }

    @Test
    public void getRuralPopulation() {
        double elvart1 = 700;
        double test1 = country1.getRuralPopulation();
        double test2 = country2.getRuralPopulation();
        assertEquals(elvart1, test1, 0);
        assertEquals(2000, test2, 0);
    }

    @Test
    public void getCountriesOfContinent(){
        ArrayList<String> elvart1 = new ArrayList<>();
        elvart1.add("ATA");
        elvart1.add("ATF");
        elvart1.add("SGS");
        elvart1.add("BVT");
        elvart1.add("HMD");
        ArrayList<String> test1 = worldStatistics.getCountriesOfContinent("Antarctica");
        assertEquals(elvart1,test1);
    }


}
