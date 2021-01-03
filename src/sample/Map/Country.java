package sample.Map;

import javafx.scene.paint.Color;
import sample.Players.Player;

import java.util.HashSet;
import java.util.Set;

public class Country {

    public Country(String name) {
        this.name = name;
        this.adjacentCountry = new HashSet<>();
    }

    public Country(String name, Coordinator coordinator) {
        this(name);
        this.coordinator = coordinator;
    }

    @Override
    public String toString(){ return name +" " + army;}

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Country> getAdjacentCountry() {
        return adjacentCountry;
    }

    public void setAdjacentCountry(Set<Country> adjacentCountry) {
        this.adjacentCountry = adjacentCountry;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    private Color color;
    private String name;
    private Set<Country> adjacentCountry;
    private Coordinator coordinator;
    private Continent continent;
    private Player player;
    private int army = 1;
}
