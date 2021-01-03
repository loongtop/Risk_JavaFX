
package sample;

import sample.Players.Player;

import java.util.ArrayList;
import java.util.List;

public class GameStatus {

    private static GameStatus instance = new GameStatus();

    public static GameStatus getInstance() {
        return instance;
    }
//
//
//    public void addPlayer(Player player){
//        players.add(player);
//    }
//
//    public Player getCurrentPlayer(){
//        return players.get(currentPlayerIndex);
//    }
//
//    public void nextPlayer(){
//        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
//        if (!isStart && currentPlayerIndex == 0) {
//            isStart = true;
//            getCurrentPlayer().gainArmy();
//        }
//    }
//
//    public void nextPhase(){
//        phase = (phase + 1) % 4;
//        switch (phase){
//            case 0:
//                phase = 1;
//            case 1:
//                if (isStart) {
//                    nextPlayer();
//                    getCurrentPlayer().gainArmy();
//                }
//            case 2:
//            case 3:
//
//        }
//    }
//
    public void reset() {
        phase = 1;
        currentPlayerIndex = 0;
        players = new ArrayList<>();
    }
//
//
//
//    public List<Player> getPlayers() {
//        return players;
//    }
//
//    public void setPlayers(List<Player> players) {
//        this.players = players;
//    }
//
//    public int getPhase() {
//        return phase;
//    }
//
//    public void setPhase(int phase) {
//        this.phase = phase;
//    }
//
//    public boolean isStart() {
//        return isStart;
//    }
//
//    public void setStart(boolean start) {
//        isStart = start;
//    }
//
//    public boolean isCountryClicked() {
//        return countryClicked;
//    }
//
//    public void setCountryClicked(boolean countryClicked) {
//        this.countryClicked = countryClicked;
//    }

    private boolean countryClicked = false;
    private int phase = 1;

    private int currentPlayerIndex = 0;
    private boolean isStart = false;

    private List<Player> players;
}

