package _1109_Teszt;

public class City {

    private String townName;
    private String countryCode;
    private int cityPopulation;

    public City(String townName, String countryCode, int population) {
        this.townName = townName;
        this.countryCode = countryCode;
        this.cityPopulation = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "townName='" + townName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", population=" + cityPopulation +
                '}';
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }
}
