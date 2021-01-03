package sample.FrontPage.SetupGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.GameStatus;
import sample.Util.NumberTextField;

public class SetupGame {
    private static final int[] initialArmy = {35, 30, 25, 20};

    /**
     * constuctor
     *
     */
    public SetupGame(){
        try{
            _numberTextField = new NumberTextField();
            _numberTextField.setRange(3, 6);
        }
        catch (IllegalArgumentException e){
//            this.confirm.setDisable(true);
        }
    }

    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("@SetupGame.fxml"));


    @FXML
    private void confirm(ActionEvent event){
        if(_numberTextField.isOutOfRange()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(_numberTextField.getNumber() + " is invalid, please enter number between " + _numberTextField.getRange());
            alert.show();
        } else{
            GameStatus.getInstance().reset();
        }


        System.out.println("confirm");
    }

    @FXML
    private void cancel(ActionEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getParent().getScene().getWindow();
        stage.close();
        System.out.println("cancel");
    }



    private AnchorPane _setupPane;
    private Button _btn_confirm;
    private Button _btn_cancel;
    private NumberTextField _numberTextField;

}


