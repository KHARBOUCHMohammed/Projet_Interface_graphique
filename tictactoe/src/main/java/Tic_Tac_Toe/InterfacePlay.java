package Tic_Tac_Toe;


import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class InterfacePlay {


    Table game;
    int parg;




    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;







    @FXML
    Label joueur1, joueur2;


    @FXML
    private Button rejoue;

    @FXML
    private Button retou;




    public void initialize() throws Exception {

        Joueur humain1= new Joueur();
        Joueur humain2=new Joueur();
        humain1.setSign(1);
        humain2.setSign(-1);
        humain1.myTour=true;
        ArrayList<Joueur> players = new ArrayList<Joueur>(2);
        players.add(humain1);
        players.add(humain2);
        game = new Table(players);
        joueur1.setText(NamePlayer.NomJoueur1);
        joueur2.setText(NamePlayer.NomJoueur2);

    }








    @FXML
    void retour(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Acceuil.fxml"));
        Stage window=(Stage) retou.getScene().getWindow();
        window.setTitle("Tic_Tac_Toe");
        window.setScene(new Scene(root));

    }

    @FXML
    void rejouer(ActionEvent event) throws IOException {


        Parent root= FXMLLoader.load(getClass().getResource("InterfacePlay.fxml"));
        Stage window=(Stage) rejoue.getScene().getWindow();
        window.setTitle(" Play Game");
        window.setScene(new Scene(root));

    }




    @FXML
    public void jouer(ActionEvent event) throws IOException {


        Button btn  = (Button) event.getSource();

        //Gets the button clicked
        if(game.finish!=true) {
            if(game.getPlayers().get(0).myTour==true) {
                //btn1.setDisable(true);
                btn.setText("X");
                btn.setStyle("-fx-font: 50 arial;-fx-text-fill: red;");
                game.getPlayers().get(0).myTour=false;
                game.getPlayers().get(1).myTour=true;
                if(game.checkBoard()==true) {

                    game.finish=true;
                    parg++;

                }
            }
            else if(game.getPlayers().get(1).myTour==true) {
                btn.setText("O");
                btn.setStyle("-fx-font: 50 arial; -fx-text-fill: green;");
                btn.setDisable(true);
                game.getPlayers().get(0).myTour=true;
                game.getPlayers().get(1).myTour=false;
                if(game.checkBoard()==true) {
                    game.finish=true;

                    parg++;
                }

            }
           // partieG.setText(Integer.toString(parg));
            String b1 = btn1.getText();
            String b2 = btn2.getText();
            String b3 = btn3.getText();

            String b4 = btn4.getText();
            String b5 = btn5.getText();
            String b6 = btn6.getText();

            String b7 = btn7.getText();
            String b8 = btn8.getText();
            String b9 = btn9.getText();

            // PLAYER X CODING

            if(b6.equals("X") && b8.equals("X") && b7.equals("X"))
            {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn8.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur1;
                reussite();

            }

            if(b9.equals("X") && b1.equals("X") && b4.equals("X"))
            {
                btn9.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn4.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur1;
                reussite();
            }

            if(b5.equals("X") && b2.equals("X") && b3.equals("X"))
            {
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn2.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur1;
                reussite();
            }

            if(b6.equals("X") && b1.equals("X") && b3.equals("X"))
            {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur1;
                reussite();
            }

            if(b5.equals("X") && b1.equals("X") && b7.equals("X"))
            {
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur1;
                reussite();
            }
            if(b6.equals("X") && b9.equals("X") && b5.equals("X"))
            {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn9.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur1;
                reussite();
            }


            if(b8.equals("X") && b1.equals("X") && b2.equals("X"))
            {
                btn8.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn2.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur1;
                reussite();
            }

            if(b7.equals("X") && b4.equals("X") && b3.equals("X"))
            {
                btn4.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur1;
                reussite();
            }
            // PLAYER O CODING


            if(b6.equals("O") && b8.equals("O") && b7.equals("O"))
            {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn8.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur2;
                reussite();

            }

            if(b9.equals("O") && b1.equals("O") && b4.equals("O"))
            {
                btn9.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn4.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur2;
                reussite();
            }

            if(b5.equals("O") && b2.equals("O") && b3.equals("O"))
            {
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn2.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur2;
                reussite();
            }

            if(b6.equals("O") && b9.equals("O") && b5.equals("O")) {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn9.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur2;
                reussite();
            }

            if(b8.equals("O") && b1.equals("O") && b2.equals("O")) {
                btn8.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn2.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur2;
                reussite();
            }
            if(b7.equals("O") && b4.equals("O") && b3.equals("O")) {
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn4.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur2;
                reussite();
            }


            if(b6.equals("O") && b1.equals("O") && b3.equals("O")) {
                btn6.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn3.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur2;
                reussite();
            }

            if(b5.equals("O") && b1.equals("O") && b7.equals("O")) {
                btn5.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn1.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                btn7.setBackground(new Background(new BackgroundFill(
                        Color.web("#36c677"), CornerRadii.EMPTY, Insets.EMPTY)));
                Reussite.win=NamePlayer.NomJoueur2;
                reussite();
            }
        }


    }

    public void reussite() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("reussite.fxml"));
        Stage stage=new Stage();
        stage.setTitle("success");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();

    }

}

