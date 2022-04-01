package com.example.tictactoe;

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

    String[] difficileSplit ;

    String[] facileSplit;

    String source = "resources/config.txt";

    public void initialize() throws IOException {

        pane.getStyleClass().add("pane");
        text1.setId("text");
        text2.setId("text");

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));

        BufferedReader r = new BufferedReader(new InputStreamReader(bis, StandardCharsets.UTF_8));

        String facile = r.readLine();
        String difficile = r.readLine();

        facileSplit = facile.split(":");
        Lr1.setText(""+facileSplit[1]);
        h1.setText(""+facileSplit[2]);
        nbLayers1.setText(""+facileSplit[3]);


        difficileSplit = difficile.split(":");
        Lr2.setText(""+difficileSplit[1]);
        h2.setText(""+difficileSplit[2]);
        nbLayers2.setText(""+difficileSplit[3]);

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
