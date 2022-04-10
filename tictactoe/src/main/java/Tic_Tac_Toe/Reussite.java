package Tic_Tac_Toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;

public class Reussite {
    @FXML
    private Button b1;
    @FXML
    private Button b2;

    @FXML
    private Text winner;

    public static String win;

    public void initialize(){
        winner.setText(win.toUpperCase(Locale.ROOT));
    }
    @FXML
    public void replay(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InterfacePlay.fxml"));
        Stage stage=new Stage();
        stage.setTitle("Apprentissage");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }
    @FXML
    public void quit(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PremiereInterface.fxml"));
       Stage stage=new Stage();
        stage.setTitle("Apprentissage");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }
}
