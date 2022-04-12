package Tic_Tac_Toe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class ConfigAI {

    @FXML
    private TextField Lr1;

    @FXML
    private TextField Lr2;

    @FXML
    private TextField h1;

    @FXML
    private TextField h2;

    @FXML
    private TextField nbLayers1;

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField nbLayers2;

    @FXML
    private Text text1;

    @FXML
    private Text text2;

    String[] dif ;

    String[] fac;

    String source = "resources/config.txt";

    public void initialize() throws IOException {

        pane.getStyleClass().add("pane");
        text1.setId("text");
        text2.setId("text");

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));

        BufferedReader r = new BufferedReader(new InputStreamReader(bis, StandardCharsets.UTF_8));

        String facile = r.readLine();
        String difficile = r.readLine();

        fac = facile.split(":");
        h1.setText(""+fac[2]);
        Lr1.setText(""+fac[1]);

        nbLayers1.setText(""+fac[3]);


        dif = difficile.split(":");
        Lr2.setText(""+dif[1]);
        h2.setText(""+dif[2]);
        nbLayers2.setText(""+dif[3]);

        bis.close();


    }

    public void onClickValide(ActionEvent actionEvent) throws IOException {

        BufferedWriter sortie = new BufferedWriter(new FileWriter(source));

        sortie.write("facile:"+Lr1.getText()+":"+h1.getText()+":"+nbLayers1.getText());
        sortie.newLine();
        sortie.write("difficile:"+Lr2.getText()+":"+h2.getText()+":"+nbLayers2.getText());

        sortie.close();

        ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }
}
