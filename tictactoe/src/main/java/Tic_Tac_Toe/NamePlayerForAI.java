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
        URL url = new File("Interface3.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = new Stage();
        stage.setTitle("Play");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }
}
