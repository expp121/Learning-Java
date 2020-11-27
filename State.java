/**
 * State
 */
public class State {

    private class City {
        private String cityName;
        private int population;
    }

    private String nameOfState;
    private int population;
    private City capitalCity = new City();
    private City populousCity = new City();

    public State() {
        this.nameOfState = "Nevada";
        this.population = 20000044;
        this.capitalCity.cityName = "Sofia";
        this.capitalCity.population = 7000000;
        this.populousCity.cityName = "Gorna Oryahovitsa";
        this.populousCity.population = 30;
    }

    public State(String nameOfState, int populationOfState, String capitalCityName, int capitalCityPopulation, String populousCityName, int populousCityPopulation) {
        this.nameOfState = nameOfState;
        this.population = populationOfState;
        this.capitalCity.cityName = capitalCityName;
        this.capitalCity.population = capitalCityPopulation;
        this.populousCity.cityName = populousCityName;
        this.populousCity.population = populousCityPopulation;
    }

    public String getNameOfState() {
        return nameOfState;
    }

    public int getPopulation() {
        return population;
    }

    public City getCapitalCity() {
        return capitalCity;
    }

    public String getCapitalCityName() {
        return capitalCity.cityName;
    }

    public int getCapitalCityPopulation() {
        return capitalCity.population;
    }

    public City getPopulousCity() {
        return populousCity;
    }
    
    public String getPopulousCityName() {
        return populousCity.cityName;
    }

    public int getPopulousCityPopulation() {
        return populousCity.population;
    }

    public void setNameOfState(String nameOfState) {
        this.nameOfState = nameOfState;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setCapitalCity(City capitalCity){
        this.capitalCity = capitalCity;
    }

    public void setCapitalCityName(String capitalCityName) {
        this.capitalCity.cityName = capitalCityName;
    }

    public void setCapitalCityPopulation(int capitalCitypopulation) {
        this.capitalCity.population = capitalCitypopulation;
    }

    public void setPopulousCity(City populousCity) {
        this.populousCity = populousCity;
    }

    public void setPopulousCityName(String populousCityName) {
        this.populousCity.cityName = populousCityName;
    }

    public void setPopulousCityPopulation(int populousCityPopulation) {
        this.populousCity.population = populousCityPopulation;
    }

}

