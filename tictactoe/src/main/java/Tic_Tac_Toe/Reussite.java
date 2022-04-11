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
    private Button rejoue;
    @FXML
    private Button quitte;

    @FXML
    private Text winner;

    public static String win;

    public void initialize(){
        winner.setText(win.toUpperCase(Locale.ROOT));
    }
    @FXML
    public void replay(ActionEvent actionEvent) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("InterfacePlay.fxml"));
//        Stage stage=new Stage();
//        stage.setTitle("playing game");
//        stage.setScene(new Scene(root));
//        stage.setResizable(false);
//        stage.show();

        Parent root= FXMLLoader.load(getClass().getResource("InterfacePlay.fxml"));
        Stage window=(Stage) rejoue.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));
    }
    @FXML
    public void quitter(ActionEvent actionEvent) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("PremiereInterface.fxml"));
//       Stage stage=new Stage();
//        stage.setTitle("");
//        stage.setScene(new Scene(root));
//        stage.setResizable(false);
//        stage.show();

        Parent root= FXMLLoader.load(getClass().getResource("Alert.fxml"));
        Stage window=(Stage) quitte.getScene().getWindow();
        window.setTitle("");
        window.setScene(new Scene(root));
    }
}
