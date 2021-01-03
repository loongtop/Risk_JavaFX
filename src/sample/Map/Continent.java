package sample.Map;

import java.util.ArrayList;
import java.util.List;



public class Continent {
    /**
     * Construction method with incoming parameters.
     *
     * @param name continent name with String type
     * @param army  number of army can get after conquest the continent
     */
    public Continent(String name, int army) {
        if ("".equals(name.trim()) || army == 0) {
            throw new IllegalArgumentException("Invalid data for continent: " + name + ", army:" + army);
        }
        this.name = name;
        this.army = army;
        this.countries = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getArmy() {
        return army;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setArmy(int army) {
        this.army = army;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
    private String name;
    private int army;
    private List<Country> countries;
}
