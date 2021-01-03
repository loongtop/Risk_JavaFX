
package sample.FrontPage;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import sample.Main;
import sample.Util.FileOP;

import java.io.File;
import java.io.IOException;

/**
 * This class is used to control the front page.
 */
public class FPController {

    public void Start_Game(ActionEvent event) {
        System.out.println("Start_Game");
    }

    public void Load_Game(ActionEvent event) throws IOException {

        choseFile();

        DialogPane dialogPane = new DialogPane();
        dialogPane.setHeaderText("How many players(3 to 6)  do you want to choose?");
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("./SetupGame/SetupGame.fxml"));

        AnchorPane anchorPane = fxmlLoader.load();
        dialogPane.setContent(anchorPane);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setDialogPane(dialogPane);
        alert.showAndWait();

//        if (GameStatus.getInstance ().getPlayers()!=null&&!GameStatus.getInstance ().getPlayers ().isEmpty ()) {
        openGameScene (event);
//        }

        System.out.println("Load_Game");
    }

    public void Quit_Game(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
        System.out.println("Quit_Game");
    }

    public void setGame(Scene scene) { _gameScene = scene; }
    public void setMain(Main main) { _main = main; }

    private boolean choseFile(){
        boolean bstatus = true;

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select one GameMap File for Loading");
        fileChooser.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("map file", "*.map"));
        File fileSelected = fileChooser.showOpenDialog(null);

        if (fileSelected != null) {
            try {
                FileOP.readFile(fileSelected);
            } catch (Exception e) {
                e.printStackTrace();
                bstatus = false;
            }
        }
        return bstatus;
    }
    private void openGameScene(ActionEvent actionEvent) throws IOException{
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        _main.getGamePageController().renderMap();
        primaryStage.setScene(_gameScene);
        System.out.println("openGameScene");
    }

    private Scene _gameScene;
    private Main _main;
}


