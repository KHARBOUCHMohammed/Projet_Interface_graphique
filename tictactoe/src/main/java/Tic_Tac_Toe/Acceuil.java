package Tic_Tac_Toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Acceuil {

    public void machine(ActionEvent actionEvent) throws IOException
    {

        Parent root = FXMLLoader.load(getClass().getResource("PremiereInterface.fxml"));
        Stage stage=new Stage();
        stage.setTitle("Apprentissage");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }


    public void friend(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NamePlayer.fxml"));
        Stage stage=new Stage();
        stage.setTitle("Apprentissage");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }
}
