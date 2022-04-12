package Tic_Tac_Toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;
import javafx.fxml.FXML;

import java.io.IOException;

public class Acceuil {

    @FXML
    private Button vsmachine;
    @FXML
    private Button vsamie;

        //pour changer la page si on clique sur la bouton contre Machine
    public void machine(ActionEvent actionEvent) throws IOException
    {



        Parent root= FXMLLoader.load(getClass().getResource("PremiereInterface.fxml"));
        Stage window=(Stage) vsmachine.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));
    }

    //pour changer la page si on clique sur la bouton contre amie
    public void friend(ActionEvent actionEvent) throws IOException {



        Parent root= FXMLLoader.load(getClass().getResource("NamePlayer.fxml"));
        Stage window=(Stage) vsamie.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));
    }


}
