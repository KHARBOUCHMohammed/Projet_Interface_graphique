package Tic_Tac_Toe;



import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NamePlayer{
    @FXML
    Button play;

    @FXML
    Button retou;
    @FXML
    TextField Text1,Text2;
    public static String NomJoueur2;
    public static String NomJoueur1;

    public void setName(String name1,String name2) {
        this.NomJoueur1=name1;
        this.NomJoueur2=name2;
    }

    @FXML
    public void StartPlay(ActionEvent e) throws IOException {

       setName(Text1.getText(),Text2.getText());




        Parent root= FXMLLoader.load(getClass().getResource("InterfacePlay.fxml"));
        Stage window=(Stage) play.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));



    }
    public void retour(ActionEvent e) throws IOException {


        Parent root= FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        Stage window=(Stage) retou.getScene().getWindow();
        window.setTitle("Tic_Tac_Toe");
        window.setScene(new Scene(root));



    }

}
