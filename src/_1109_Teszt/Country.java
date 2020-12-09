package _1109_Teszt;

import java.util.ArrayList;

public class Country {

    private String countryCode;
    private String countryName;
    private String continent;
    private String region;
    private float areaSize;
    private String independenceYear;
    private int population;
    private String minister;
    private ArrayList<City> cities = new ArrayList<>();


    public Country(String countryCode, String countryName, String continent, String region, float areaSize, String independenceYear, int population) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.continent = continent;
        this.region = region;
        this.areaSize = areaSize;
        this.independenceYear = independenceYear;
        this.population = population;
    }

    public Country(String countryCode, String countryName, String continent, String region, float areaSize, String independenceYear, int population, String minister) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.continent = continent;
        this.region = region;
        this.areaSize = areaSize;
        this.independenceYear = independenceYear;
        this.population = population;
        this.minister = minister;
    }

    public Country(String countryCode, String countryName, String continent, String region, float areaSize, String independenceYear, int population, String minister, ArrayList<City> cities) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.continent = continent;
        this.region = region;
        this.areaSize = areaSize;
        this.independenceYear = independenceYear;
        this.population = population;
        this.minister = minister;
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", areaSize=" + areaSize +
                ", independenceYear='" + independenceYear + '\'' +
                ", population=" + population +
                ", minister='" + minister + '\'' +
                ", cities=" + cities +
                '}';
    }

    public void isItNull() {
        if (independenceYear != "NULL") {
            Integer.parseInt(independenceYear);
        }
    }

    /* public void addNewCity(City newCity){
        this.cities.add(newCity);
    } */

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public float getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(float areaSize) {
        this.areaSize = areaSize;
    }

    public String getIndependenceYear() {
        return independenceYear;
    }

    public void setIndependenceYear(String independenceYear) {
        this.independenceYear = independenceYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getMinister() {
        return minister;
    }

    public void setMinister(String minister) {
        this.minister = minister;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    //visszaadja az adott ország népsűrűségét fő/km2-ben! Ha az ország területe vagy népessége nincs megadva, akkor metódusod -1-gyel térjen vissza!

    public double getPopulationDensity() {
        if (getPopulation() == 0 || getAreaSize() == 0) {
            return -1;
        } else {
            return getPopulation() / getAreaSize();
        }
    }


}
