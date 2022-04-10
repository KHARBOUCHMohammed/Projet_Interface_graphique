package Tic_Tac_Toe;


import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NamePlayer{
    @FXML
    Button b3;
    @FXML
    TextField T1,T2;
    public static String NomJoueur2;
    public static String NomJoueur1;

    public void setName(String name1,String name2) {
        this.NomJoueur1=name1;
        this.NomJoueur2=name2;
    }

    @FXML
    public void StartPlay(ActionEvent e) throws IOException {

//        setName(T1.getText(),T2.getText());


//        Parent root = FXMLLoader.load(getClass().getResource("InterfacePlay.fxml"));
//        Stage stage = new Stage();
//        stage.setTitle("Play");
//        Scene scene=new Scene(root);
//        stage.setScene(scene);
//        stage.setResizable(false);

        Parent root = FXMLLoader.load(getClass().getResource("InterfacePlay.fxml"));
        Stage stage=new Stage();
        stage.setTitle("Play");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();

//        ((Node)(e.getSource())).getScene().getWindow().hide();
//

    }


}
