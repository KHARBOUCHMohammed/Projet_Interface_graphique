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

public class reussiteController {
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
        URL url = new File("InterfacePlay.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Stage stage = new Stage();
        stage.setTitle("Tic Tac Toe");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }
 

}
