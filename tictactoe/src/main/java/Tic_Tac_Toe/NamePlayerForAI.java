package Tic_Tac_Toe;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class NamePlayerForAI {

    @FXML
    Button b3;
    @FXML
    TextField joueur1;
    public static String NomJoueur1;

    public void setName(String name1) {
        this.NomJoueur1=name1;
    }
    public void StartPlay(ActionEvent actionEvent) throws IOException {
        setName(joueur1.getText());
        Parent root = FXMLLoader.load(getClass().getResource("InterfacePlayIA.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Model's list");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
}
