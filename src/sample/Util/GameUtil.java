package sample.Util;

import sample.Map.Country;
import sample.Players.Player;

import java.util.*;

public class GameUtil {
    public static Map<Country, Integer> temArmyDistributeMap = new HashMap<>();


    public static List<Country> findAllConnectedCountries(Player player, Country country){
        Set<Country> validOption = new HashSet<>();
//        connectedCountryUtil(country, validOptions, player.getTerritory());
//        List<Country> sortedArrayList = new ArrayList<>(validOptions);
//        sortedArrayList.sort((i, j) -> {
//
//            if (!i.getContinent().equals(j.getContinent())) {
//
//                return i.getContinent().getName().compareTo(j.getContinent().getName());
//            } else {
//                return i.getName().compareTo(j.getName());}
//
//        });
//
//        return sortedArrayList;


        return null;


    }

    public static void resetTempMap() {

        temArmyDistributeMap.clear();
    }
    /**
     * method to initial the TempMap
     *
     */
    public static void initTempMap(Player player) {

        resetTempMap();

//        player.getTerritory().forEach(c -> temArmyDistributeMap.put(c, c.getArmy()));
    }

    private static void connectedCountryUtil(Country c, Set<Country> visited, Set<Country> available) {

        for (Country country : c.getAdjacentCountry()) {

            if (!visited.contains(country) && available.contains(country)) {
                visited.add(country);
                connectedCountryUtil(country, visited, available);
            }
        }
    }
}
