package Tic_Tac_Toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;

import java.util.Locale;

public class Reussite {
    @FXML
    private Button rejoue;


    @FXML
    private Text winner;

    public static String win;

    public void initialize(){


        winner.setText(win.toUpperCase(Locale.ROOT));

    }
    @FXML
    public void replay(ActionEvent actionEvent) throws IOException {


        Parent root= FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        Stage window=(Stage) rejoue.getScene().getWindow();
        window.setTitle("Tic_Tac_Toe");
        window.setScene(new Scene(root));
    }

}
