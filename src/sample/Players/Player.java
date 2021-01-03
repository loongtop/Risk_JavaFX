package sample.Players;


import sample.Card.Card;
import sample.Map.Continent;
import sample.Map.Country;

import java.util.HashSet;
import java.util.Set;

/**
 * This class represents all of the data and functions that a player should have
 *
 */
public class Player {

    /**
     * Constructor method
     *
     * @param id   the player id with int type
     * @param army the numer of army with int type
     * @Param territory
     * the set of countries set to player in the begin
     */

    public Player(int id, int army, Set<Country> country){
        playerId = id;
        playerName = "";
        this.army = army;
        spentArmy = 0;

//        _cardset = new Set<Card>();
        countrySet = country;
        continentSet = new HashSet<>();
    }
    public Player(int id, int army){
        playerId = id;
        playerName = "";
        this.army = army;
    }

    public int getPlayerId(){ return playerId; }

    public String getPlayerName(){ return playerName; }
    public void setPlayerName(String name){ playerName = name; }

    public int getArmy(){ return army; }
    public void setArmy(int army) {
        this.army = army;
    }

    public Set<Country> getCountrySet(){ return countrySet;}
    public void setCountrySet(Set<Country> countrySet){
        this.countrySet = countrySet;
        updateContinent();
    }

    public Set<Continent> getContinentSet(){ return continentSet; }
    public void setContinentSet(Set<Continent> continentSet){
        this.continentSet = continentSet;
    }

    /**
     * Method to gain the number of Army
     *
     * @return the number of Army gained with type int
     */
    public void gainArmy() {
        spentArmy = 0;
        int gainedArmy = Math.max(getCountrySet().size() / 3, 3);

        if (getContinentSet() != null && getContinentSet().isEmpty()){
            for (Continent continent : getContinentSet()) {

                gainedArmy += continent.getArmy();
            }
        }
        setArmy(gainedArmy);
    }

    /**
     * Method to get Continent String
     *
     * @return the get Continent String with type String
     */
    public String getContinentString() {
        if (continentSet.isEmpty()) return "";

        StringBuilder stringBuilder = new StringBuilder();

//        _countryset.forEach( i ->{
//            stringBuilder.append(i);
//            stringBuilder.append(" ")
//        });
        for (int i = 0; i < countrySet.size(); ++i){
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    public Set<Card> getCards() { return cardSet; }
    public void setCards(Set<Card> cards) { cardSet = cards; };

    /**
     * get the spent army.
     * @return the number of army spent.
     */
    public int getSpentArmy() { return spentArmy; }
    public int set_spentArmy(int spentArmy) { return this.spentArmy = spentArmy; }

    public void updateContinent(){}

    private int playerId;
    private String playerName;
    private int army;
    private int spentArmy;

    private Set<Card> cardSet;
    private Set<Country> countrySet;
    private Set<Continent> continentSet;

    public Set<Country> getTerritory() {
        return null;
    }
}
