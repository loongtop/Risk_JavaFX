package sample.Map;

import java.io.File;
import java.util.List;

public class Map {

    private Map() {
    }

    private static final Map instance = new Map();
    public static Map getInstance(){
        return instance;
    }



    public File getImageFile() {
        return imageFile;
    }

    public void setImageFile(File imageFile) {
        this.imageFile = imageFile;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getScroll() {
        return scroll;
    }

    public void setScroll(String scroll) {
        this.scroll = scroll;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Country> getTerritories() {
        return territories;
    }

    public void setTerritories(List<Country> territories) {
        this.territories = territories;
    }

    public Boolean getWarn() {
        return warn;
    }

    public void setWarn(Boolean warn) {
        this.warn = warn;
    }

    public Boolean getWrap() {
        return wrap;
    }

    public void setWrap(Boolean wrap) {
        this.wrap = wrap;
    }

    private File imageFile;
    private Coordinator coordinator;

    private String author;
    private String scroll;

    private Boolean warn;
    private Boolean wrap;

    private List<Continent> continents;
    private List<Country> territories;
}
