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
    Button play;
    @FXML
    Button retou;

    @FXML
    TextField player1;
    public static String NomJoueur1;

    public void setName(String name1) {
        this.NomJoueur1=name1;
    }
    public void StartPlay(ActionEvent actionEvent) throws IOException {
        setName(player1.getText());
//        Parent root = FXMLLoader.load(getClass().getResource("InterfacePlayIA.fxml"));
//        Stage stage = new Stage();
//        stage.setTitle("Model's list");
//        Scene scene=new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//        stage.setResizable(false);

        Parent root= FXMLLoader.load(getClass().getResource("InterfacePlayIA.fxml"));
        Stage window=(Stage) play.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));
    }
    public void retour(ActionEvent actionEvent) throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("PremiereInterface.fxml"));
        Stage window=(Stage) retou.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));
    }

}
