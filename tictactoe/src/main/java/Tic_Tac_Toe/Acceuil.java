package Tic_Tac_Toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import javafx.fxml.FXML;

import java.io.IOException;

public class Acceuil {

    @FXML
    private Button vsmachine;
    @FXML
    private Button vsamie;

    public void machine(ActionEvent actionEvent) throws IOException
    {

//        Parent root = FXMLLoader.load(getClass().getResource("PremiereInterface.fxml"));
//        Stage stage=new Stage();
//        stage.setTitle("Apprentissage");
//        stage.setScene(new Scene(root));
//        stage.setResizable(false);
//        stage.show();

        Parent root= FXMLLoader.load(getClass().getResource("PremiereInterface.fxml"));
        Stage window=(Stage) vsmachine.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));
    }


    public void friend(ActionEvent actionEvent) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("NamePlayer.fxml"));
//        Stage stage=new Stage();
//        stage.setTitle("Apprentissage");
//        stage.setScene(new Scene(root));
//        stage.setResizable(false);
//        stage.show();



        Parent root= FXMLLoader.load(getClass().getResource("NamePlayer.fxml"));
        Stage window=(Stage) vsamie.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));
    }
}
