package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.FrontPage.FPController;
import sample.GamePage.GPController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        CreatMainWindow(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Defines details of the main window.
     */
    private void CreatMainWindow(Stage primaryStage) {
        try {
            primaryStage.setResizable(true);
            primaryStage.setTitle("Hello World");

            FXMLLoader FrontPageLoader = new FXMLLoader(getClass().getResource("FrontPage/FrontPage.fxml"));
            FXMLLoader GamePageLoader = new FXMLLoader(getClass().getResource("GamePage/GamePage.fxml"));

            AnchorPane FrontPagePane = FrontPageLoader.load();
            AnchorPane GamePagePane = GamePageLoader.load();

            Scene FrontPageScene = new Scene(FrontPagePane);
            Scene GamePageScene = new Scene(GamePagePane);

//            String stylesheet = Main.class.getResource("style.css").toExternalForm();
//            FrontPageScene.getStylesheets().addAll(stylesheet);
//            GamePageScene.getStylesheets().addAll(stylesheet);

            FPController frontPageController = FrontPageLoader.getController();
//            frontPageController.setMain(this);
//            frontPageController.setGame(gamePageScene);

            gamePageController = GamePageLoader.getController();
//            gamePageController.setFrontPage(frontPageScene);

            primaryStage.setScene(FrontPageScene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /* Get the controller bind to the game page.
     * @return
     */
    public GPController getGamePageController() {
        return gamePageController;
    }

    GPController gamePageController;
}
