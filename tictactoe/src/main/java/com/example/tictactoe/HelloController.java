package com.example.tictactoe;

import ai.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HelloController {
    @FXML
    public Button VsFriend;

    @FXML
    public Button VsIA;
    @FXML
    public Menu menu;

  public static double lr;
  public static int h, l;
    public static double getLr() {
    return lr;
}

    public void setLr(double lr) {
        this.lr = lr;
    }

    public static int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public static int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }




    public void configuration(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ConfigAI.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Configuration");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);




    }

    public void model(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ListeModele.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Configuration");
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    public void onClickContinue(ActionEvent actionEvent) throws IOException {



        Parent root = FXMLLoader.load(getClass().getResource("learningAI.fxml"));
        Stage stage=new Stage();
        stage.setTitle("Learning");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();




    }



}



